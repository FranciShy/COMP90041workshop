// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp8b;

// derived class
public class ChildClass extends ParentClass {
    private String item;

    // to avoid no default constructor
    public ChildClass() {
        // super();
        // an empty default constructor?
        System.out.println("Child class default constructor");
    }

    public ChildClass(String item) {
        super("not child item");
        this.item = item;
        System.out.println("Child class constructor");
    }

    private void setParentItem(String item) {
        super.item = item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrivacy() {
        return super.getPrivacy();
    }

    @Override
    public String toString() {
        return super.toString() + "child item: " + item;
    }

    public static void main(String[] args) {
        // test default constructors
        // what if the parent has no default constructor?
        System.out.println("/ test 1 /");
        ChildClass child = new ChildClass();
        System.out.println(child);

        // same name field in parent and child classes
        System.out.println("\n/ test 2 /");
        child = new ChildClass("new item");
        System.out.println(child);

        // access modifier private or protected?
        System.out.println("\n/ test 3 /");
        child.setParentItem("item1");
        child.setItem("item2");
        System.out.println(child);
        System.out.println("privacy: " + child.getPrivacy());
    }
}
