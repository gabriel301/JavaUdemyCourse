/**
 * Created by g.ferreira.oliveira on 14/11/2016.
 */
public class Car {
    //Access Modifier which defines what type of allowance of access of this class
    //Private: Only Accessible within the same class
    //default (package private) - When there is no access modifier, the default modifier is applied. Accessible to
    //private and other classes in the same package
    //Protected: default access and child classes
    //Public: Protected and Classes in the other packages

    //Class or member variables - Variables accessible within the class
    //You must define the access modifier for class variables
    //State Components
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    //Behavioural components
    public void setModel(String model){
        this.model = model;
    }

    public void setDoors (int doors){
        this.doors = doors;
    }

    public void setWheels (int wheels){
        this.wheels = wheels;
    }

    public void setEngine (String engine){
        this.engine = engine;
    }

    public  void setColor (String color){
        this.color = color;
    }

    public String getModel(){
        return this.model;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }
}
