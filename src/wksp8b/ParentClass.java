// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp8b;

public class ParentClass {
    protected String item;
    private int privacy = 4396;

    public ParentClass() {
        System.out.println("Parent class default constructor");
    }

    public ParentClass(String item) {
        this.item = item;
        System.out.println("Parent class constructor");
    }

    @Override
    public String toString() {
        return "parent item: " + item + "\n";
    }

    public int getPrivacy() {
        return privacy;
    }
}
