package Principle;

/**
 * Created by Brenda on 12/27/14.
 */
public class BiColor extends Bi {

    private Bi bi;
    private String color;

    public BiColor(Bi bi, String color) {
        this.bi = bi;
        this.color = color;
    }

    public Bi getBi() {
        return bi;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String draw() {
        return bi.draw() + " with " + color + " color";
    }
}
