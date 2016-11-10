/**
 * Created by g.ferreira.oliveira on 10/11/2016.
 */
public class Main {
    public static void main (String[] args){
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        //Code Blocks are code between brackets {}
        if(score==5000){
            System.out.println("Your Score is equal 5000");
        } else if (score < 5000) {
            System.out.println("Less than 5000");
        } else {
            System.out.println("Greater than 5000!");
        }

        if(gameOver){
            //Variables created inside codeblocks are only accessible/visible inside them (scope)
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
