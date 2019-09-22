// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp8a;

public class TennisShoe extends Shoe {

    public static final ShoeType ShoeType() {
        return ShoeType.TENNISSHOE;
    }

    private String sole;
    private String canvas;

    public TennisShoe() {
        super();
        sole = "Undefined";
        canvas = "Undefined";
    }

    public TennisShoe(float size) {
        super(size);
        sole = "Undefined";
        canvas = "Undefined";
    }

    public TennisShoe(String color, String designer, float size,
                      String sole, String canvas) {
        super(color, designer, size);
        this.sole = sole;
        this.canvas = canvas;
    }
}
