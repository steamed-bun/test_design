package com.coocaa.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    private Stack<Iterator> stack = new Stack<>();

    CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public boolean hasNext() {
        if (stack.empty()){
            return false;
        }else {
            Iterator iterator = stack.peek();
            if (iterator.hasNext()){
                return true;
            }else {
                stack.pop();
                return hasNext();
            }
        }
    }

    public Object next() {
        Iterator iterator = stack.peek();
        MenuComponent menuComponent = (MenuComponent) iterator.next();
        stack.push(menuComponent.createIterator());
        return menuComponent;
    }

    public void remove() {

    }
}
