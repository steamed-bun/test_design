package com.coocaa.iterator;

import java.util.Iterator;

public class Waitress {

    Menu dinnerMenu;
    Menu pancakeHouseMenu;
    Menu cafeMenu;

    public Waitress(Menu dinnerMenu, Menu pancakeHouseMenu,Menu cafeMenu) {
        this.dinnerMenu = dinnerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.cafeMenu = cafeMenu;
    }

    public void print(){
        Iterator iterator = dinnerMenu.createIterator();
        print(iterator);
        iterator = pancakeHouseMenu.createIterator();
        print(iterator);
        iterator = cafeMenu.createIterator();
        print(iterator);
    }

    private void print(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
