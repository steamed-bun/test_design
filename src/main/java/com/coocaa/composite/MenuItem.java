package com.coocaa.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent{

    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("MenuItem{" +
                "name='" + name + '\'' +
                '}');
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
