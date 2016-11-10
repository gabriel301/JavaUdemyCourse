/**
 * Created by g.ferreira.oliveira on 10/11/2016.
 */
public class Main {
    public static void main (String[] args){
        //Expression - myVariable=50
        //Statement - int myVariable=50; - myVariable++;

        int myVariable=50;
        myVariable++;


        //Statements must not be necessarily at the same line.
        System.out.println("This is a method call, " +
                            "therefore it is a Statement");
        int anotherVariable = 5; myVariable++;

    }
}
