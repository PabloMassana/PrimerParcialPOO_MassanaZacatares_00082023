public abstract class AbstractElectronicItem implements ElectronicItem {
    protected String name;
    protected String model;
    protected String description;
    protected double price;

    public AbstractElectronicItem(String name, String model, String description, double price) {
        this.name = name;
        this.model = model;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

