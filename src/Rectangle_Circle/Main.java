package Rectangle_Circle;

/**
 * Created by Brenda on 12/21/14.
 */
public class Main {
    public static void main(String[] args){

        Shape cir = new Circle();
        cir.draw();
        System.out.println("-------------------------------");

        Shape circleWithColor = new Color(new Circle());
        circleWithColor.draw();
        System.out.println("-------------------------------");


        Shape rectangleWithBorder = new Border(new Rectangle());
//        Shape rectangle = new Border(circleWithColor);
        rectangleWithBorder.draw();
        System.out.println("-------------------------------");

        Shape rectangleRedBorder = new Color(rectangleWithBorder);
        rectangleRedBorder.draw();
        System.out.println("-------------------------------");

        Shape circleBorderRed = new Color(new Border(new Circle()));
        circleBorderRed.draw();
        System.out.println("-------------------------------");

        Shape circleRedBorder = new Border(new Color(new Circle()));
        circleRedBorder.draw();
    }
}
