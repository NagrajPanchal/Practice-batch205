package com.bridgelabz.doubtsession;


import java.util.*;
import java.util.LinkedList;

public class Collections
{

    public static void main(String[] args)
    {
        List sampleList =  new LinkedList();
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        Vector vector = new Vector();
        Stack stack = new Stack();
        PriorityQueue priorityQueue = new PriorityQueue();
        ArrayDeque arrayDeque = new ArrayDeque();
        TreeSet treeSet = new TreeSet();
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        sampleList.add(10);
        sampleList.add(20);
        System.out.println(sampleList);
        System.out.println("List is Empty : "+sampleList.isEmpty());
        sampleList.add(1,15);
        System.out.println(sampleList);
        sampleList.clear();
        System.out.println("is List : "+sampleList);

        sampleList.add(10);
        sampleList.add(20);
        sampleList.add(1,15);
        sampleList.remove(0);
        System.out.println("is List : "+sampleList);
        System.out.println("Length of Array size is : "+sampleList.size());
        System.out.println("Array of Index is on 1 :  "+sampleList.get(1));
        System.out.println("Hash Code : "+sampleList.hashCode());
        sampleList.add(22);
        sampleList.add(12);
        System.out.println("is List : "+sampleList);
//        sampleList.removeAll(sampleList);
        System.out.println("is List : "+sampleList);
        arrayList.add(11);
        arrayList.add(22);
        System.out.println(arrayList);
        arrayList.add(0,sampleList);
        System.out.println("Array List : "+arrayList);

        linkedList.add(111);
        linkedList.addAll(1,arrayList);
        System.out.println(linkedList);

        System.out.println(linkedList.get(1) instanceof List);
        System.out.println(linkedList.get(1));
        System.out.println("before List : "+linkedList);
        linkedList.remove(sampleList.set(1,24));
        System.out.println("After List : "+linkedList);


//        linkedList.add(1,sampleList.set(1,25));
//        System.out.println("After List : "+linkedList);
//
//        linkedList.set(1,sampleList.set(0,28));
//        System.out.println("After List : "+linkedList);

        System.out.println(linkedList.indexOf(1));
        linkedList.listIterator();



        Iterator iterator;
        iterator = linkedList.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
    }
}
