/**
 * Created by g.ferreira.oliveira on 11/11/2016.
 */
public class Main {
    public static void main (String[] args){
        int count = 0;
        while (count != 5){
            System.out.println("Count: "+ count);
            count++;
        }

        count = 0;
        System.out.println("\n");
        while(true){
            if(count==5)
                break;
            System.out.println("Count: "+ count);
            count++;
        }

        count = 0;
        System.out.println("\n");

        do{
            System.out.println("Count: "+ count);
            count++;
        }while(count<5);

        int number=5;
        int finishNumber=20;
        while(number<=finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even Number: " + number);
            number++;
        }

    }

    public static boolean isEvenNumber(int n){
        return n%2==0;
    }

}
