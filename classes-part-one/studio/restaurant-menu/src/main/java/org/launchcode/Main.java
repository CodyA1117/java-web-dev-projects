package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create some MenuItem objects
        MenuItem item1 = new MenuItem(9.99, "Caesar Salad", "Appetizer", true);
        MenuItem item2 = new MenuItem(19.99, "Grilled Chicken", "Main Course", false);
        MenuItem item3 = new MenuItem(6.99, "Chocolate Cake", "Dessert", true);

        // Create a Menu and add the items
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        Menu restaurantMenu = new Menu(menuItems);

        restaurantMenu.addItem(item1);
        restaurantMenu.addItem(item2);
        restaurantMenu.addItem(item3);
    }
}
