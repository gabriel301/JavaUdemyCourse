/**
 * Created by g.ferreira.oliveira on 09/29/16.
 */
public class Main {
    public static void main (String[] args){
        //expressions - Building blocks of all java programs
        //a mile is equal to 1.603344 kilometers
        double kilometers = 1000d * 1.603344; //an Expressions (except the data type and semicolon)
        int hipScore = 50;
        if(hipScore==50){
            System.out.println("This is an expression");
        }

        int score = 100; //expression - score = 100
        if(score>90) //expression - score > 90
        {
            System.out.println("You Got the high score"); //expression
            score = 0; //expression - score = 0
        }
    }
}
