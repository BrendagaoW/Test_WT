package Rectangle_Circle;

/**
 * Created by Brenda on 12/21/14.
 */
public class Color implements Shape{

    Shape shape;

    public Color(Shape shape) {
        this.shape = shape;
    }

    public void draw(){
        shape.draw();
        System.out.println("with RED color");
    }

}
