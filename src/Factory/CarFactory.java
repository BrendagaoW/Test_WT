package Factory;

/**
 * Created by Brenda on 12/21/14.
 */
public class CarFactory {

    public enum Cars{BMW, Toyota};

    public static Car getCar(Cars car){
        switch (car){
            case BMW:
                return new BMW();
            case Toyota:
                return new Toyota();
            default:
                return null;
        }
    }

}
