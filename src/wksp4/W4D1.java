// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp4;

public class W4D1 {
    public static void main(String[] args) {
        // compare object address
        String a = new String("Iron Man");
        String b = a;
        System.out.println("a == b: " + (a == b));
        // constructor return a new object reference
        a = new String("Iron Man");
        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));

        Object obj1 = new String("Apple");
        // String obj1 = new String("Apple");
        Integer obj2 = new Integer(1);
        Integer obj3 = new Integer(1);
        System.out.println("obj1 == obj2: " + (obj1 == obj2));
        System.out.println("obj2 == obj3: " + (obj2 == obj3));
        System.out.println("obj3 == 1: " + (obj3 == 1));
    }
}
