/**
 * Created by g.ferreira.oliveira on 24/11/2016.
 */
public class Main {
    public static void main(String [] args){
//        Player player = new Player();
//
//        player.name="Tim";
//        player.health = 20;
//        player.weapon="Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Tim",50,"Sword");
//        System.out.println("Initial Health is " +  player.getHealth());

        Printer printer = new Printer(50,false);
        System.out.println("Initial page count = "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = "+ printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = "+ printer.getPagesPrinted());
    }
}
