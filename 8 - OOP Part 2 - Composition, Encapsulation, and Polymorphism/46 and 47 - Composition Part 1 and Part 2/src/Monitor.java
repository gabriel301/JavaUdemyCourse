/**
 * Created by g.ferreira.oliveira on 18/11/2016.
 */
public class Monitor {
    private String model;
    private String manufacturer;
    private int size;

    //Composition - Resolution Class is part of the Monitor Class (A Monitor HAS A Resolution)
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x,int y, String color){
        System.out.println("Drawing pixel at "+x+","+y+" in color "+ color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
