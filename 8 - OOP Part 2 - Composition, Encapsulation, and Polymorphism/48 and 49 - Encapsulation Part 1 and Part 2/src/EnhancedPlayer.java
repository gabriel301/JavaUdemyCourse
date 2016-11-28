/**
 * Created by g.ferreira.oliveira on 24/11/2016.
 */
public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if(hitPoints > 0 && hitPoints <=100)
            this.hitPoints = hitPoints;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0){
            System.out.println("The player knocked out");
            // TODO Reduce number of lives remaining for the player
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }
}
