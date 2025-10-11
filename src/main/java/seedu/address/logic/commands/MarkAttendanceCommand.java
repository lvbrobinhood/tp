package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.List;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Person;

/**
 * Marks the attendance of a person identified using their index from the displayed person list.
 */
public class MarkAttendanceCommand {

    /** Index of the person in the displayed list to mark attendance for. */
    private final Index index;

    /**
     * Creates a MarkAttendanceCommand to mark the attendance of the specified person.
     *
     * @param index Index of the person in the displayed list.
     */
    public MarkAttendanceCommand(Index index) {
        this.index = index;
    }

    /**
     * Executes the command to mark attendance for the specified person.
     *
     * @param model The model containing the person list and data.
     * @return A {@code CommandResult} indicating the outcome of the command.
     * @throws CommandException If the given index is invalid.
     */
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Person> lastShownList = model.getFilteredPersonList();

        if (index.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        }

        Person personToEdit = lastShownList.get(index.getZeroBased());
        return null; // to be implemented
    }
}
