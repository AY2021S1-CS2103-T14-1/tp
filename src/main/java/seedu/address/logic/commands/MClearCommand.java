package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import com.sun.prism.Mesh;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class MClearCommand extends Command {

    public static final String COMMAND_WORD = "mclear";

    public static final String MESSAGE_SUCCESS = "All modules deleted";

    public static final String MESSAGE_FAIL = "Module list is already empty";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Clears all the modules from the list.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        if (model.isEmptyModuleList()){
            throw new CommandException(MESSAGE_FAIL);
        } else {
            model.clearMod();
            return new CommandResult(MESSAGE_SUCCESS);
        }

    }

}
