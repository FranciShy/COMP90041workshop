// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp8a;

public class DressShoe extends Shoe {
    HeelType heel;

    public static final ShoeType ShoeType() {
        return ShoeType.DRESSSHOE;
    }

    public DressShoe() {
        super();
        this.heel = HeelType.FLAT;
    }

    public DressShoe(float size) {
        super(size);
        this.heel = HeelType.FLAT;
    }

    public DressShoe(String color, String designer, float size) {
        super(color, designer, size);
        this.heel = HeelType.FLAT;
    }

    public DressShoe(String color, String designer, float size, HeelType heel) {
        super(color, designer, size);
        this.heel = heel;
    }

    public HeelType getHeel() {
        return heel;
    }

    @Override
    public String toString() {
        return super.toString() + ", (heel, " +
                heel.toString().toLowerCase() + ")";
    }

    public static void main(String[] args) {
        DressShoe s = new DressShoe();
        System.out.println(s);
    }
}
