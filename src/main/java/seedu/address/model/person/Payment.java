package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;


public class Payment {

    public static final String MESSAGE_CONSTRAINTS =
            "Only paid/unpaid/overdue";

    public static final String VALIDATION_REGEX = "(?i)(paid|unpaid|overdue)";

    public final String value;

    public Payment(String paymentStatus) {
        requireNonNull(paymentStatus);
        String trimmedPaymentStatus = paymentStatus.trim().toLowerCase();
        checkArgument(isValidRole(trimmedPaymentStatus), MESSAGE_CONSTRAINTS);
        value = trimmedPaymentStatus;
    }

    /**
     * Returns true if a given string is a valid payment status.
     */
    public static boolean isValidRole(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Payment)) {
            return false;
        }

        Payment otherPaymentStatus = (Payment) other;
        return value.equals(otherPaymentStatus.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
