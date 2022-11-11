package com.bridgelabz.collection;

import com.bridgelabz.oops.Dog;

import java.util.Comparator;

public class ComparatorSample<T extends Comparable<T>> implements Comparator<T> {


    /**
     *
     *
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */

    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
