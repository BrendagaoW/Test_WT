package Principle;

/**
 * Created by Brenda on 12/27/14.
 */
public class Test {
    public static void main(String [] args){
        Bi brushBi = new Brush();
        System.out.println(brushBi.draw());

        Bi redPen = new BiColor(new Pen(),"red");
        System.out.println(redPen.draw());

        Bi greenPencilDraw = new PaintColor(new Pencil(),"green");
        System.out.println(greenPencilDraw.draw());
    }
}
