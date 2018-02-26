package com.coocaa.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

public class InterAdapter implements Enumeration {

    private Iterator iterator;

    public InterAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }
}
