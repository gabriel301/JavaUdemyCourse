/**
 * Created by g.ferreira.oliveira on 16/11/2016.
 */
public class Astra extends Car {
    private int roadServiceMonths;

    public Astra(int roadServiceMonths) {
        super("Astra", "2WD", 5, 4, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelarete(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity <= 0) {
            stop();
            changeGear(1);
        } else {

            if (newVelocity <= 10)
                changeGear(1);
            else if (newVelocity <= 20)
                changeGear(2);
            else if (newVelocity <= 30)
                changeGear(3);
            else
                changeGear(4);

            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}
