package com.coocaa.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu {

    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {

        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast");

        addItem("Regular Pancake Breakfast");

        addItem("Blueberry Pancakes");

        addItem("Waffles");

    }

    private void addItem(String name){
        MenuItem menuItem = new MenuItem(name);
        menuItems.add(menuItem);
    }


    public java.util.Iterator createIterator(){
        return menuItems.iterator();
    }

}
