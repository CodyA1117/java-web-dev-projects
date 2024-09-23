package technology;

public class Program {
    public static void main(String[] args) {
        // Create a Computer object
        Computer myComputer = new Computer("Dell", 500, 16);
        System.out.println("Computer ID: " + myComputer.getId());
        myComputer.turnOn();
        myComputer.turnOff();

        // Create a Laptop object
        Laptop myLaptop = new Laptop("Apple", 256, 8, 2.5);
        System.out.println("Laptop ID: " + myLaptop.getId());
        myLaptop.openLid();

        // Create a SmartPhone object
        SmartPhone myPhone = new SmartPhone("Samsung", 128, 4, true);
        System.out.println("SmartPhone ID: " + myPhone.getId());
        myPhone.makeCall();
    }
}

