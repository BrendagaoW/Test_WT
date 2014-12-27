package Rectangle_Circle;

/**
 * Created by Brenda on 12/21/14.
 */
public class Border implements Shape {

    Shape shape;

    public Border(Shape shape) {
        this.shape = shape;
    }

//    @Override
    public void draw() {
        shape.draw();
        System.out.println("with border");
    }
}
