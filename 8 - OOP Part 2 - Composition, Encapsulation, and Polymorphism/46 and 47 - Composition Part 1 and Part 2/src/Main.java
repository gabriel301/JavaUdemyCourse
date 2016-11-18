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
    }
}
