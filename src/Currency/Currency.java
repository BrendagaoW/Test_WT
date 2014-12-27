package Currency;

/**
 * Created by Brenda on 12/27/14.
 */
public abstract class Currency <T extends Currency> {

    private double money;
    private double rate;

    public Currency(double money, double rate) {
        this.money = money;
        this.rate = rate;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double add(T currency){
        return this.getMoney()+currency.getMoney()*currency.getRate()/this.getRate();

    }
}
