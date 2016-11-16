/**
 * Created by g.ferreira.oliveira on 14/11/2016.
 */
//All classes inherits from the class java.lang.Object automatically
public class Main {
    public static void main(String[] args){
        Astra astra = new Astra(36);
        astra.steer(45);
        astra.accelarete(30);
        astra.accelarete(20);
        astra.accelarete(-42);
    }
}
