/**
 * Created by g.ferreira.oliveira on 18/11/2016.
 */
public class Main {
    public static void main(String[] args){
        Case theCase = new Case("220b","Dell","244",new Dimensions(20,20,5));
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,8,"v2.44");
        PC thePC = new PC(theCase,theMonitor,theMotherboard);

        //Accessing PC members through getters (public getters)
//        thePC.getTheCase().pressPowerButton();
//        thePC.getMonitor().drawPixelAt(1200,1500,"Red");
//        thePC.getMotherboard().loadProgram("Windows 10");

        //Encapsulation of the member classes' methods
        thePC.power();

        //Challenge
        Wall [] walls = new Wall[4];
        String[] directions = {"North", "South", "East", "West"};
        for(int i=0;i<4;i++){
            walls[i] = new Wall(directions[i]);
        }

        Bedroom bedroom =  new Bedroom("My Bedroom",walls,new Ceiling(12,55), new Bed("Modern",4,3,2,1),new Lamp("Classic",false,75));
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
