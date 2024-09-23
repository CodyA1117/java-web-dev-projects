package technology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void testTurnOn() {
        Computer computer = new Computer("HP", 512, 16);
        computer.turnOn();
    }

    @Test
    void testStorage() {
        Computer computer = new Computer("HP", 512, 16);
        assertEquals(512, computer.getStorage());
    }

    @Test
    void testMemory() {
        Computer computer = new Computer("HP", 512, 16);
        assertEquals(16, computer.getMemory());
    }
}
