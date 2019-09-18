// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp6;

public class Test {
    public static void main(String[] args) {
        MyClass myObject = MyClass.factory("Actually, I am Iron Man.");
        System.out.println(myObject);
        System.out.println();

        MySmallClass mySmallObject = MyClass.smallClassFactory();
        System.out.println(mySmallObject);
    }
}
