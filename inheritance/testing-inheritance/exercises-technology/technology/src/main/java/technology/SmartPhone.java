package technology;

public class SmartPhone extends Computer {
    private boolean has5G;

    public SmartPhone(String brand, int storage, int memory, boolean has5G) {
        super(brand, storage, memory);
        this.has5G = has5G;
    }

    public void makeCall() {
        System.out.println("Making a call.");
    }

    public boolean has5G() {
        return has5G;
    }
}

