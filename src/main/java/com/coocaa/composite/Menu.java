package com.coocaa.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    private String name;
    private ArrayList<MenuComponent> menuItems = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent menuComponent){
        menuItems.add(menuComponent);
    }

    public void print() {
        System.out.println("Menu{" +
                "name='" + name + '\'' +
                '}');
        /*Iterator iterator = menuItems.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }*/
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuItems.iterator());
    }
}
