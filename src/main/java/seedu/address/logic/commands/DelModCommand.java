package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MODULE_CODE;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.module.ModuleCode;
import seedu.address.model.module.UniqueModuleList;

public class DelModCommand extends Command {

    public static final String COMMAND_WORD = "delmod";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Deletes a module from FaculType. "
            + "Parameters: "
            + PREFIX_MODULE_CODE + "MODULE CODE "
            + "Example: " + COMMAND_WORD + " "
            + PREFIX_MODULE_CODE + "CS2103 ";

    public static final String MESSAGE_SUCCESS = "Module deleted: %1$s";
    public static final String MESSAGE_MODULE_DOES_NOT_EXIST = "This module does not exist in FaculType";

    private final ModuleCode moduleCode;

    /**
     * @param moduleCode module code of the module to be deleted
     */
    public DelModCommand(ModuleCode moduleCode) {
        requireNonNull(moduleCode);
        this.moduleCode = moduleCode;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        UniqueModuleList moduleList = model.getModuleList();

        if (!moduleList.containsModuleCode(this.moduleCode)) {
            throw new CommandException(MESSAGE_MODULE_DOES_NOT_EXIST);
        }

        model.deleteMod(this.moduleCode);
        return new CommandResult(String.format(MESSAGE_SUCCESS, moduleCode));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof DelModCommand // instanceof handles nulls
                && moduleCode.equals(((DelModCommand) other).moduleCode));
    }
}
