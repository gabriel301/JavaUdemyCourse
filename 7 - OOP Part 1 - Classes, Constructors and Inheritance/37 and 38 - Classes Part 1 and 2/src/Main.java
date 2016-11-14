/**
 * Created by g.ferreira.oliveira on 14/11/2016.
 */
//Objects have 2 major characteristics:
//1 - State - Fields, Variables
//2 - Behaviour - Methods
//Class - Template or Blueprint to create objects
public class Main {
    public static void main (String [] args){

        Car porsche = new Car();
        Car holden = new Car();
        System.out.println("Model is " + holden.getModel());
        holden.setModel("Astra");
        System.out.println("Model is " + holden.getModel());
    }
}

