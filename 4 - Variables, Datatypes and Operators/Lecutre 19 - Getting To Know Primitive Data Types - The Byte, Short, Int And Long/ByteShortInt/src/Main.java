/**
 * Created by Augus on 24/09/2016.
 */
public class Main {
    public static void main (String[] args){
        /*
        int - 2^32 (32 bits - 4 bytes)
        Java considers literals as integers, no matter which type of the variable
        Thus, When using short data type, explicit cast is needed
        Since Java 7, underscores are allowed in numbers literals (no matter which type), to make code more readable
        */
        int myValue = 2_000;

        //Byte = 2^8 (8 bits - 1 byte)
        byte myByteValue = 10;

        //Java promotes variables  to int to perform any binary operation.
        //Thus, results of expressions are integers. In order to store the result
        //in a variables of different type, explicit cast is needed.
        //The parenthesis are needed to cast the whole expression.
        byte myNewByteValue = (byte)(myByteValue/2);


        //Short = 2^16 (16 bits - 2 bytes)
        short myShort = 1_000;
        short myNewShortValue = (short)(myShort/2);
        /*
        Long = 2^64 (64 bits - 8 bytes)
        Without L suffix, Java considers the literal as an integer.
        Since int is a smaller type than long, int is auto casted and stored as a long
        without information loss (underflow or overflow)
        */
        long myLongValue = 100_000L;

        //Exercise:
        //Converts the expression automatically to long, since sizeof(long) > sizeof(int)
        //This rule applies for any two types that one is lager than the order, since the smaller is stored into the larger.
        //Otherwise, a explicit cast is need, like the short type below
        long myNewLongValue = 50_000L + 10L *(myByteValue+myShort+myValue);
        short myShortCastedValue = (short) (100 + 2*(myByteValue+myNewShortValue+myValue));
        System.out.println(myNewLongValue);
        System.out.println(myShortCastedValue);
    }
}
