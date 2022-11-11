package com.bridgelabz.collection;

import com.bridgelabz.oops.Dog;

import java.util.*;

public class Collection2
{
    public static void main(String[] args) {
        // Collection => If we need to store different objects in a data structure , we use collections
        // Collection Framework
        List list1 = new ArrayList<>();
        list1.add(45);
        list1.add("ABC");
        list1.add('A');
        list1.add(true);
        list1.add(3.5F);
        System.out.println(list1);
        int[] arr = new int[10];
        System.out.println("******************************");
        List<Integer> list2 = new ArrayList<>();
        // ArrayList is implemented using dynamic array
        // array which grows dynamically at run time.
        list2.add(1);
        list2.add(300);
        list2.add(400);
        System.out.println(list2);


        List<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(680);
        linkedList1.add(345);
        linkedList1.add(457);

        list2.addAll(linkedList1);

        System.out.println(list2);
//        linkedList1.set(4,320);
//        System.out.println(linkedList1);



        System.out.println("*******************************");

        list2.add(2,500);
        System.out.println(list2);
        System.out.println();

        List<Integer> list3 = new ArrayList<>();
        list3.add(1000);
        list3.add(4000);
        list3.add(6000);
//        list2.addAll(list3);
        list2.addAll(2,list3);
        Integer i1= Integer.valueOf(8000);
        list2.add(i1);
        System.out.println(list2);

        Object[] arr1 = list2.toArray();
        System.out.println("Array =>" + arr1);
        list2.remove(4);
        list2.remove(i1);
        System.out.println(list2);

        list2.removeAll(list3);
//        list2.retainAll(list3);
        System.out.println(list2);

        list2.add(300);

        System.out.println(list2);
        System.out.println(list2.lastIndexOf(300));

        for (Integer x:list2) {
            System.out.print(x + " ");
        }

        // Cursors

        Iterator<Integer> iterator =  list2.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next()); // prints current element and moves the cursor to next element
        }

        ListIterator listIterator = list2.listIterator();

        System.out.println("List Iterator");

        while (listIterator.hasNext())
        {
            System.out.print (listIterator.hasPrevious() + " ");
//            System.out.println(listIterator.previous());
            System.out.println(listIterator.next());
        }

        // ******************************************************

        List<Integer> linkedList4 = new LinkedList<>();

        // Data structure used is Doubly Linked List
        linkedList4.add(1);
        linkedList4.add(10);
        linkedList4.add(50);

        list2.addAll(linkedList1);
        System.out.println(list2);

//
        Comparator<Dog> cs = new ComparatorSample<>();
        Dog labradorObject = new Dog();
        labradorObject.breed = "labrador";
        labradorObject.color = "brown";
        labradorObject.age = 6;

        // default constructor
        Dog pitbullObject = new Dog();
        pitbullObject.breed = "pitbull";
        pitbullObject.color = "black";
        pitbullObject.age = 3;

//         To initialize the object , we use constructor
//         parameterized constructor
        Dog huskyObject = new Dog("husky",8,"white");
        Queue<Dog> queue1 = new PriorityQueue<>(cs);

        queue1.add(labradorObject);
        queue1.add(pitbullObject);
        queue1.add(huskyObject);
        System.out.println("Queue1 => "+queue1);
//        System.out.println(queue1.poll());
//        System.out.println("Queue2 => "+queue1);
        System.out.println();
        while(!queue1.isEmpty()) {
            System.out.print(queue1.poll()+" ");
        }
        System.out.println();
        System.out.println(queue1);


        // Does not allow null values
        // FIFO





        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(4);
        deque.removeFirst();
        deque.removeLast();


        Set<Integer> set1 = new HashSet<>();
        // Set is implemented using a Map
        // Duplicates are not allowed
        // Only one null value is allowed.
        // Insertion order is not maintained
        Integer i2 = Integer.valueOf(4);
        set1.add(2);
        set1.add(1);
        set1.add(4);
        set1.add(i2);
        System.out.println("Set => "+set1);


        set1.remove(i2);
        System.out.println(set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(7);
        set2.add(5);
        set2.add(9);
        set2.add(i2);
        System.out.println("Set2 =>"+set2);

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(7);
        treeSet1.add(4);
        treeSet1.add(8);
        treeSet1.add(1);
        treeSet1.add(6);
//        treeSet1.add(null);

        // null values are not allowed in a TreeSet
        System.out.println(treeSet1);


        //****************************************************************

        // Not a part of Collection
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(3,"ABC");
        map1.put(2,"BCD");
        map1.put(5,"GBF");
        map1.put(4,"WXY");
        map1.put(1,"ABC");
        map1.put(6,"BCD");
        map1.put(8,"GBF");
        map1.put(7,"WXY");
        map1.put(2,"RET");

        // Keys cannot be duplicated
        System.out.println(map1);


        Map<Integer,String> map2 = new LinkedHashMap<>();
        map2.put(2,"BCD");
        map2.put(3,"MAN");
        map2.put(1,"MNO");
        map2.put(4,"WXY");
        System.out.println(map2);

        Map<Integer,String> map3 = new TreeMap<>();
        map3.put(1,"ABC");
        map3.put(5,"BCD");
        map3.put(3,"GBF");
        map3.put(7,"WXY");
        map3.put(2,"ABC");
        map3.put(6,"BCD");
        map3.put(4,"GBF");
        map3.put(8,"WXY");
        System.out.println(map3);

    }
}
