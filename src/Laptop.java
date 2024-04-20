public class Laptop extends AbstractElectronicItem {
    private String generation;
    private String supplier;

    public Laptop(String name, String model, String description, double price, String generation, String supplier) {
        super(name, model, description, price);
        this.generation = generation;
        this.supplier = supplier;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
