public class MobilePhone extends AbstractElectronicItem {
    private String brand;
    private String designer;

    public MobilePhone(String name, String model, String description, double price, String brand, String designer) {
        super(name, model, description, price);
        this.brand = brand;
        this.designer = designer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }
}
