package wksp11.type;

public class Demo1 {
    public static void main(String[] args) {
        String s = "New String";

        System.out.println("---- getClass() ----\n" + s.getClass());

        System.out.println(" ---- getClass().getTypeName ----\n"
                + s.getClass().getTypeName());

        System.out.println("---- getClass().getClass() ----\n"
                + s.getClass().getClass());

        System.out.println("---- String.class == s.getClass() ----\n"
                + (String.class == s.getClass()));
    }
}
