package wksp6;

public class MyClass {
    private String msg = "";
    private MyClass() {
        System.out.println("private MyClass() constructor");
    }

    private MyClass(String msg) {
        this();
        this.msg = msg;
        System.out.println("private MyClass(String msg)" +
                " constructor with message: " + msg);
    }

    public static MyClass factory() {
        return new MyClass();
    }

    public static MyClass factory(String msg) {
        return new MyClass(msg);
    }

    @Override
    public String toString() {
        return "tell you a secret: " + msg;
    }
}

class MySmallClass {
    public MySmallClass() {
        System.out.println("this is package class MySmallClass");
        System.out.println("it's not a good habit to code in this way");
    }

    public String toString() {
        return "MySmallClass instance(object)";
    }
}