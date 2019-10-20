package wksp10.exception;

public class NumberInput {
    public static double calculate(String input) throws Exception {
        int stream;

        // instead of parsing directly
        // stream = Integer.parseInt(input);
        try {
            stream = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            throw new NotIntException();
        }

        // throw an exception out of this method
        if (stream < 0) {
            throw new NegativeNumberException();
        }

        try {
            if (stream == 0) {
                // anonymous class
                throw new Exception() {
                    @Override
                    public String getMessage() {
                        return "Cannot be divided by zero.";
                    }
                };
            } else {
                return 1 / stream;
            }
        } finally {
            System.out.println("< finally block >");
        }
    }

    public static void main(String[] args) {
        String[] testInput = {"haha", "1.0", "-3", "0", "22"};
        for (String s: testInput) {
            System.out.println("---- test " + s + " ----");
            try {
                System.out.println(calculate(s));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
