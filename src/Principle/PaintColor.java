package Principle;

/**
 * Created by Brenda on 12/27/14.
 */
public class PaintColor extends BiColor {

    public PaintColor(Bi bi, String color) {
        super(bi, color);
    }

    @Override
    public String draw() {
        return super.draw() + " draw " + getColor() + " painting";
    }
}
