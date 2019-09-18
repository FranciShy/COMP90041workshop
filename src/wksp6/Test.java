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
