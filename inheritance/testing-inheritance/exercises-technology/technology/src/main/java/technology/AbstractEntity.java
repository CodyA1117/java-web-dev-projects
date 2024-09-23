package technology;

public abstract class AbstractEntity {
    private static int nextId = 1;
    private int id;

    public AbstractEntity() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }
}

