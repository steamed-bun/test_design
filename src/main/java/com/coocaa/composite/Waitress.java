package com.coocaa.composite;

import java.util.Iterator;

public class Waitress {

    private MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void print(){
        menuComponent.print();
    }

    public void printVegetMenu(){
        Iterator iterator = menuComponent.createIterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

}
