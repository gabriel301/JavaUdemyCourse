/**
 * Created by g.ferreira.oliveira on 18/11/2016.
 */
//Inheritance - IS relationship - A Car IS a Vehicle
//In Java, a class can inherits from just one class at time
public class Car extends Vehicle {
    private int doors;
    private int enginieCapacity;

    public Car(String name, int doors, int enginieCapacity) {
        super(name);
        this.doors = doors;
        this.enginieCapacity = enginieCapacity;
    }
}
