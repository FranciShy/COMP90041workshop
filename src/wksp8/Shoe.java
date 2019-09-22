// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp8;

public class Shoe {
    public enum ShoeType {
        SHOE, DRESSSHOE
    }

    public static final ShoeType getType() {
        return ShoeType.SHOE;
    }

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
