/**
 * Created by Augus on 25/09/2016.
 */
public class Main {
    public static void main(String[] args){
        //Operators may be unary, binary or ternary

        //Binary operators (+, -, /, %, *, =, += ,-=, *=,/=,%=, ==, !=, <, > , <=, >=, &, &&, |, ||)
        int result = 1+2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        result = result -1;
        System.out.println(previousResult + " - 1  = " + result);
        previousResult = result;
        result+=1;
        System.out.println(previousResult + " + 1  = " + result);

        boolean isAlien = false;
        if(isAlien==false)
            System.out.println("It is not an Alien!");

        int topScore = 100;
        if(topScore>=100)
            System.out.println("You got the high Score");

        //Operators && and || evaluate the left side of the expression and only if it is true
        //the right sioe is evaluated (Useful when checking wether an object is null before calling any of its methods)
        if(isAlien == false && topScore >= 100)
            System.out.println("You got the high Score and you are not an Alien");
        //On the other hand, & and | operators evaluate both sides
        if(isAlien == false & topScore >= 100)
            System.out.println("You got the high Score and you are not an Alien");
        //Unary Operators (post fixed  - variable++ or variable-- and pre fixed - ++varialbe or variable--
        result--;
        System.out.println("Result: " + result);
    }
}
