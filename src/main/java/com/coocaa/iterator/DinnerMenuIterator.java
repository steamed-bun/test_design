package com.coocaa.iterator;

public class DinnerMenuIterator implements java.util.Iterator {

    private MenuItem[] menuItems;
    private Integer position = 0 ;

    DinnerMenuIterator(MenuItem[] menuItems) {
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
