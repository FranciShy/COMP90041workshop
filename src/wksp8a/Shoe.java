// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp8a;

public class Shoe {
    // make a shoe type for
    public enum ShoeType {
        SHOE, DRESSSHOE, TENNISSHOE
    }

    public static final ShoeType getType() {
        return ShoeType.SHOE;
    }

    // make fields protected to be extended
    protected String color;
    protected String designer;
    protected float size;

    public Shoe() {
        this.color = "White";
        this.designer = "NB";
        this.size = (float) 7.5;
    }

    public Shoe(float size) {
        this();
        this.size = size;
    }

    public Shoe(String color, String designer, float size) {
        this.color = color;
        this.designer = designer;
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("shoe: (color, ").append(color).append("), (designer, " )
                .append(designer).append("), (size, ")
                .append(size).append(")");
        return s.toString();
    }

    // overriding or overloading?
    // is this a critical comparison?
    public boolean equals(Shoe shoe) {
        return this.size == shoe.size
                && this.color.equals(shoe.color)
                && this.designer.equals(shoe.designer);
    }

    // a stupid factory method just creates shoe with a certain size
    public static Shoe generateShoe(ShoeType type, float size) {
        Shoe shoe;
        switch (type) {
            // default case can cover SHOE case
            case SHOE:
                shoe =  new Shoe(size);
                break;
            case DRESSSHOE:
                shoe = new DressShoe(size);
                break;
            case TENNISSHOE:
                shoe = new TennisShoe(size);
                break;
            default:
                shoe = new Shoe(size);
        }
        return shoe;
    }

    // still a factory
    // lets make the factory a little bit smarter
    public static Shoe generateShoe(String type, double size) {
        Shoe shoe;
        try {
            shoe = generateShoe(ShoeType.valueOf(type.toUpperCase()), (float) size);
        } catch (Exception ex) {
            shoe = new Shoe((float) size);
        }
        return shoe;
    }

    // setters and getters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
}
