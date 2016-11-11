/**
 * Created by g.ferreira.oliveira on 11/11/2016.
 */
public class Main {
    public static void main(String[] args){

        for(int i = 1;i<=10;i++)
        {
            System.out.println("10,000 at "+ i +"% interest = " + String.format("%.2f",calculateInterest(10000d,(double)i)));
        }

        int countPrime = 0;
        for(int i=10;i<50;i++)
        {
            if(isPrime(i))
            {
                countPrime++;
                System.out.println("Prime Number: " + i);
                if(countPrime == 10)
                    break;
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==0) return false;
        if(n==1) return false;

        for(int i=2;i<=Math.sqrt((double) n)+1;i++){
            if(n%i==0)
                return  false;
        }
        return true;
    }
    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount*(interestRate/100d));
    }
}
