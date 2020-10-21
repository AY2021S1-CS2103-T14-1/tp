package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MODULE_CODE;

import seedu.address.model.Model;


public class UnassignallCommand extends Command {

    public static final String COMMAND_WORD = "unassignall";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Unassigns all instructors from all modules. "
        + "\nExample: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Unassigned all instructors from all modules";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.unassignAllInstructors();
        return new CommandResult(MESSAGE_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
            || (other instanceof UnassignallCommand); // instanceof handles nulls
    }
}
