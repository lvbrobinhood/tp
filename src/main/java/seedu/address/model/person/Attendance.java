package seedu.address.model.person;

/**
 * Represents a Person's attendance record in the address book.
 * <p>
 * This class is a placeholder and currently a work in progress.
 * Future versions may include fields and validation for tracking
 * attendance status (e.g., present, absent, late).
 * </p>
 */
public class Attendance {

    public static final String MESSAGE_CONSTRAINTS =
            "Work in progress";

    public final String value = "Work in progress";

    public Attendance() {
    }

    @Override
    public String toString() {
        return value;
    }

    /**
     * Returns true if both attendance have the same value.
     *
     * @param other The other object to compare.
     * @return True if both objects represent the same attendance.
     */
    @Override
    public boolean equals(Object other) {
        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
