package wksp10.exception;

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super();
    }

    public NegativeNumberException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        } else {
            return "Negative number is not allowed.";
        }
    }
}
