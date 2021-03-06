package com.coocaa.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

    private Hashtable<String, MenuItem> menuItems;

    public CafeMenu() {
        this.menuItems = new Hashtable<>();

        addItem("cafe_1");

        addItem("cafe_2");

        addItem("cafe_3");

        addItem("cafe_4");
    }


    private void addItem(String name){
        MenuItem menuItem = new MenuItem(name);
        menuItems.put(menuItem.name,menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
