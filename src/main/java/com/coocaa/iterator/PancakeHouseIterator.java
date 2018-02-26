package com.coocaa.iterator;

import java.util.List;

public class PancakeHouseIterator implements Iterator {

    List<MenuItem> menuItems;
    Integer position = 0 ;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    public boolean hasNext() {
        return (position < menuItems.size());
    }
}
