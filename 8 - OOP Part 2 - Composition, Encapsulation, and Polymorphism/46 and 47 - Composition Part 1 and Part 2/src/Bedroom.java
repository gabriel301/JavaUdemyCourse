/**
 * Created by g.ferreira.oliveira on 18/11/2016.
 */
public class Bedroom {
    private  String Name;
    private Wall[] walls;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall[] walls, Ceiling ceiling, Bed bed, Lamp lamp) {
        Name = name;
        this.walls = walls;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom -> Making Bed");
        bed.make();
    }
}
