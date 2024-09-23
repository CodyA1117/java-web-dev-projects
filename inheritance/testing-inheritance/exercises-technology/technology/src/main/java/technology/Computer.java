package technology;

public class Computer extends AbstractEntity {
    private String brand;
    private int storage;
    private int memory;

    public Computer(String brand, int storage, int memory) {
        super(); // Calls AbstractEntity constructor for unique ID
        this.brand = brand;
        this.storage = storage;
        this.memory = memory;
    }

    public void turnOn() {
        System.out.println("Computer is turning on.");
    }

    public void turnOff() {
        System.out.println("Computer is turning off.");
    }

    public String getBrand() {
        return brand;
    }

    public int getStorage() {
        return storage;
    }

    public int getMemory() {
        return memory;
    }
}

