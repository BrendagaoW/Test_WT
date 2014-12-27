package Factory;

/**
 * Created by Brenda on 12/21/14.
 */
public class FactoryPattern {


    public static void main(String [] args){
        Car bmw = CarFactory.getCar(CarFactory.Cars.BMW);
        bmw.run();

        Car toyota = CarFactory.getCar(CarFactory.Cars.Toyota);
        toyota.run();
    }
}
