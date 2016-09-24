/**
 * Created by Augus on 24/09/2016.
 */
public class Main {
    public static void main(String[] args){

        //int or long divisions do not store the remainder, only the integer part of the division
        int myIntValue = 5/3;

        //Float (23 bits Mantissa, 8 Exponent ,1 signal = 32 bits - 4 bytes)
        //Java automatically casts integer to Float, since their storage size are the same
        //(32 bits). However, overflow can occur because float numbers only uses 23 bits to store
        //the significand field, instead 32 as the integer.
        //Thus, to indicate a literal as float, we must to add the f suffix to the literal.
        //In case of adding a decimal point, Java interprets the number as double.
        float myFloatValue = 5f/3f; //float myFloatValue = 5.0f;

        //Double (52 bits Mantissa, 11 Exponent ,1 signal = 64 bits - 8 bytes)
        //Java automatically casts integer to double, since sizeof(double) > sizeof(int)
        //(32 bits). In this case there is no overflow because double uses 52 bits to store
        //the significand field, instead 32 as the integer. However, casting from long to double may cause overflows.
        //It is a good practice either adds the d suffix to indicate a double literal or put a decimal point.
        double myDoubleValue = 5d/3d; // double myDoubleValue = 5.0;

        System.out.println("Int: " + myIntValue);
        System.out.println("Float: " + myFloatValue);
        System.out.println("Double: " + myDoubleValue);

        //Challenge
        double pounds = 20_000.0_000_0000d,kilos,conversionRate = 0.45359237d;
        kilos = pounds*conversionRate;
        System.out.println("Kilos: " + kilos);
        System.out.println("Pounds: " + pounds);


    }
}
