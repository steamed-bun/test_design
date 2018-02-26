package com.coocaa.iterator;

public class MenuItem {

    String name;

    MenuItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
