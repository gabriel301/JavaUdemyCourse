/**
 * Created by g.ferreira.oliveira on 14/11/2016.
 */
//When extending from another class, the child class constructor must call the parent constructor.
//Thus at the parent class a default constructor must be implemented, or the child class must explicit call the
//parent constructor
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int size, int weight,int eyes,int legs,int tail, int teeth, String coat) {
        //Calls the parent constructor
        super("Dog", 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called!");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called!");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called!");
    }

    public void walk(){
        System.out.println("Dog.walk() called!");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called!");
        move(10);
    }
}
