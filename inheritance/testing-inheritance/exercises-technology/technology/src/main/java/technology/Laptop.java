package technology;

public class Laptop extends Computer {
    private double weight;

    public Laptop(String brand, int storage, int memory, double weight) {
        super(brand, storage, memory); // Calls the Computer constructor
        this.weight = weight;
    }

    public void openLid() {
        System.out.println("Laptop lid is opened.");
    }

    public double getWeight() {
        return weight;
    }
}

