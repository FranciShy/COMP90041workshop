package wksp10.exception;

public class NotIntException extends Exception {
    public NotIntException() {
        super();
    }

    public NotIntException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        } else {
            return "Cannot parse the String into int.";
        }
    }
}
