/**
 * Created by g.ferreira.oliveira on 18/11/2016.
 */
//Composition - A PC is built by a case, a monitor and a motherboard (HAS relationship)
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void power(){
        this.theCase.pressPowerButton();
        this.drawLogo();
    }

    private void drawLogo(){
        //Fancy graphics
        this.monitor.drawPixelAt(1500,50,"Yellow");
    }
}
