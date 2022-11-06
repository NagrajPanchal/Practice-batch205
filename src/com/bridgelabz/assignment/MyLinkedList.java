package com.bridgelabz.assignment;

import com.bridgelabz.doubtsession.Node;

public class MyLinkedList<T>
{
    INode<T> head;
    INode<T> tail;
    public void display() {
        INode<T> temp = head;
        if (head == null) {
            System.out.println("Linked list is Empty");
        }
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void push(T data) {
        INode<T> newNode = new INode<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public INode<T> search(T searchData) {
        INode<T> temp = head;
        while (temp != null) {
            if (temp.getData().equals(searchData))
                return temp;
            temp = temp.getNext();
        }
        return null;
    }
}
