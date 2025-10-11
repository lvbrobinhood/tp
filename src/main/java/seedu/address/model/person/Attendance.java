package seedu.address.model.person;

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

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
