package com.bridgelabz.datastructure;

public class LinkedList <T>
{
    Node<T> head;
    Node<T> tail;

    public void push(T data)
    {
    Node<T> newNode = new Node<>(data);
    if(head == null)
    {
        head = newNode;
        tail = newNode;
    }
    else
    {
        newNode.setNext(head);
        head = newNode;
    }

    }

    public void display()
    {
        Node<T> temp = head;
        if(head == null)
        {
            System.out.println("Linked List is Empty");
        }
        while (temp != null)
        {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(tail);
            tail = newNode;
            head = newNode;
        }
    }
}
