package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Payment status in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPayment(String)}.
 */
public class Payment {

    /** Message that represents the constraints imposed on payment status. */
    public static final String MESSAGE_CONSTRAINTS =
        "Only paid/unpaid/overdue";

    /** Regular expression to validate payment status. */
    public static final String VALIDATION_REGEX = "(?i)(paid|unpaid|overdue)";

    /** The payment status value (in lowercase). */
    public final String value;

    /**
     * Constructs a {@code Payment}.
     *
     * @param paymentStatus A valid payment status.
     * @throws NullPointerException if {@code paymentStatus} is null.
     * @throws IllegalArgumentException if {@code paymentStatus} does not match {@link #VALIDATION_REGEX}.
     */
    public Payment(String paymentStatus) {
        requireNonNull(paymentStatus);
        String trimmedPaymentStatus = paymentStatus.trim().toLowerCase();
        checkArgument(isValidPayment(trimmedPaymentStatus), MESSAGE_CONSTRAINTS);
        value = trimmedPaymentStatus;
    }

    /**
     * Returns true if a given string is a valid payment status.
     *
     * @param test The string to test.
     * @return True if the string matches {@link #VALIDATION_REGEX}, false otherwise.
     */
    public static boolean isValidPayment(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    /**
     * Returns the string representation of the payment status.
     *
     * @return The payment status as a string.
     */
    @Override
    public String toString() {
        return value;
    }

    /**
     * Returns true if both payments have the same value.
     *
     * @param other The other object to compare.
     * @return True if both objects represent the same payment status.
     */
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

    /**
     * Returns the hash code of the payment value.
     *
     * @return The hash code of the payment string.
     */
    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
