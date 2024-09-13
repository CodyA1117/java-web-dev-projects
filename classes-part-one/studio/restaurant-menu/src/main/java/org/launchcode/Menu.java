package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    // Constructor
    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }

    // Getters and Setters
    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date(); // Update lastUpdated
    }

    // Add an item
    public void addItem(MenuItem item) {
        items.add(item);
        this.lastUpdated = new Date();
    }

    // Remove an item
    public void removeItem(MenuItem item) {
        items.remove(item);
        this.lastUpdated = new Date();
    }
}

