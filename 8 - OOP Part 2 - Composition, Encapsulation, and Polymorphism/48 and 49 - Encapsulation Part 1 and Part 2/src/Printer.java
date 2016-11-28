/**
 * Created by g.ferreira.oliveira on 28/11/2016.
 */
public class Printer {
    private int tonelLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonelLevel, boolean isDuplex) {
        if(tonelLevel >=1 && tonelLevel <= 100)
            this.tonelLevel = tonelLevel;
        else
            this.tonelLevel = -1;
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonelAmount){
        if(tonelAmount > 0  && tonelAmount <=100 ){
            if(this.tonelLevel+tonelAmount > 100)
                return -1;
            this.tonelLevel += tonelAmount;
            return  this.tonelLevel;
        }
        else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint /=2;
            System.out.println("Printing in Duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return  pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
