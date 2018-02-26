package com.coocaa.iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu {

    private static final Integer MAX_SIZE = 6;
    private int index = 0;
    private MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_SIZE];
        addItem("Vegetarian BLT");
        addItem("BLT");
        addItem("Soup of the day");
        addItem("Hotdog");
        addItem("Steamed Veggies and Brown Rice");
        addItem("Pasta");
    }

    private void addItem(String name){
        MenuItem menuItem = new MenuItem(name);
        if (index >= MAX_SIZE) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[index] = menuItem;
            index++;
        }
    }

    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }

}
