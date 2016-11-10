/**
 * Created by g.ferreira.oliveira on 10/11/2016.
 */
public class Main {
    public static void main (String [] args){
        int newScore = calculateScore("Mike",500);
        System.out.println("Your new score is "+ newScore);

        newScore = calculateScore(75);

        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(1,1);
        System.out.println("Conversion Result: " + centimeters);
        centimeters = calcFeetAndInchesToCentimeters(24);
        System.out.println("Conversion Result: " + centimeters);
    }
    //Overloading != Overriding
    public static int calculateScore(String playerName,int score) {
        System.out.println("Player "+ playerName + " scored " + score);
        return score * 1000;
    }
    //An overloaded method has different NUMBER of parameters (unique signature)
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player Name, No Score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || (inches < 0 || inches > 12))
            return -1;
        double conversionRateToCm = 2.54d;
        double conversionRateToInches = 12d;

        return (conversionRateToCm * ((feet* conversionRateToInches) + inches));
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0 )
            return -1;
        double feet = inches/12; //Integer division, then cast to double (Java converts variables implicit to int)
        double newInches = inches%12;
        double centimeters = calcFeetAndInchesToCentimeters(feet,newInches);
        return centimeters;
    }
}
