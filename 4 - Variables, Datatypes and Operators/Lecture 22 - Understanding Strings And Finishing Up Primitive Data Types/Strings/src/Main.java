/**
 * Created by Augus on 24/09/2016.
 */
public class Main {
    public static void main(String[] args){
        //The eight primitive datatypes covered so far
            //byte - 1 byte
            //short - 2 bytes
            //int - 4 bytes
            //long - 8 bytes
            //float - 4 bytes
            //double - 8 bytes
            //char - 2 bytes
            //boolean - 1 byte

        //String - Reference Type - Sequence of Characters
        //Strings are immutable (once you have an instance, the String never changes
        //excepts you make a new reference. In this case, the other string is garbage collected, if it is not a literal.
        //String literals are stored into a String Pool, a different area of dynamic instances of Strings, that are into the heap
        //and thus eligible to be garbage collected
        String myString = "This is a String";
        System.out.println("My String: " + myString);
        myString = myString + ", and this is more!";
        System.out.println("My String: " + myString);

        //When there is a String and other data type being operated,
        //all other datatypes are casted to String;
        String myLastString = "10";
        int myInt = 50;
        myLastString = myLastString + myInt;
        System.out.println("My Last String: " + myLastString);
        double myDouble = 102.52d;
        myLastString = myLastString + myDouble;
        System.out.println("My Last String: " + myLastString);


    }
}
