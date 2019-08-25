package wksp4;

public class W4D1 {
    public static void main(String[] args) {
        String a = new String("Iron Man");
        String b = a;
        System.out.println("a == b: " + (a == b));
        a = new String("Tony Stark");
        System.out.println("a == b: " + (a == b));

        Object obj1 = new String("Apple"); // cannot give ref String type
        Integer obj2 = new Integer(1);
        Integer obj3 = new Integer(1);
        System.out.println("obj1 == obj2: " + (obj1 == obj2));
        System.out.println("obj2 == obj3: " + (obj2 == obj3));
    }
}
