package com.bridgelabz.datastructure;

public class LinkedListMain
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        System.out.println("Linked List 1");
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();
        System.out.println("Element popped : "+ linkedList1.pop());
        linkedList1.display();

        System.out.println("Linked List 2");
        linkedList2.append(70);
        linkedList2.append(30);
        linkedList2.append(56);
        linkedList2.display();
        System.out.println("Element popped : "+ linkedList2.popLast());
        linkedList2.display();

        LinkedList<Integer> linkedList3 = new LinkedList<>();
        System.out.println("Linked List 3");
        linkedList3.append(70);
        linkedList3.append(30);
        linkedList3.append(56);
        linkedList3.append(46);
        linkedList3.search(33);
        linkedList3.display();

        System.out.println("Insert Node");
        linkedList3.insertAfter(30,12);
        linkedList3.display();
        linkedList3.insertAfter(30,15);
        linkedList3.display();
        linkedList3.insertAfter(15,18);
        linkedList3.display();
        linkedList3.insertAfter(12,21);
        linkedList3.display();
        linkedList3.insertAfter(46,24);
        linkedList3.display();
        linkedList3.insertAfter(33,24);
        linkedList3.display();

        LinkedList<Integer> linkedList4 = new LinkedList<>();
        System.out.println("Linked List Short");
        linkedList4.push(70);
        linkedList4.push(30);
        linkedList4.push(56);
        linkedList4.display();



    }
}
