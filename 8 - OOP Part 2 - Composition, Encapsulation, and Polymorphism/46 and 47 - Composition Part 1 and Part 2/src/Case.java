/**
 * Created by g.ferreira.oliveira on 18/11/2016.
 */
public class Case {
    private String model;
    private String Manufacturer;
    private String powerSupply;

    //Compositon - A case HAS A Dimension
    private Dimensions dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimension) {
        this.model = model;
        Manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimension() {
        return dimension;
    }

}
