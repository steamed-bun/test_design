package com.coocaa.iterator;

public class DinnerMenuIterator implements java.util.Iterator {

    MenuItem[] menuItems;
    Integer position = 0 ;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    public void remove() {

    }

    public boolean hasNext() {
        return !(position >= menuItems.length || menuItems[position] == null);
    }
}
