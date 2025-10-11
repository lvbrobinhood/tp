package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

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
