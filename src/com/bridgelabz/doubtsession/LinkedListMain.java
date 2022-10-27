package com.bridgelabz.doubtsession;

public class LinkedListMain
{
    public static void main(String[] args) {
        LinkedList<Integer> linkedListA = new LinkedList<>();
        linkedListA.push(10);
        linkedListA.push(20);
        linkedListA.push(30);
        linkedListA.display();
        LinkedList<Integer> linkedListB = new LinkedList<>();
        linkedListB.append(40);
        linkedListB.append(25);
        linkedListB.append(12);
        linkedListB.append(35);
        linkedListB.display();

    }
}
