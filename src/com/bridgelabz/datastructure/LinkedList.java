package com.bridgelabz.datastructure;

public class LinkedList <T> {
    Node<T> head;
    Node<T> tail;

    protected void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }

    }

    protected void display() {
        Node<T> temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        }
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    protected void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    protected T pop() {
        T data = head.getData();
        head = head.getNext();
        return data;
    }

    protected T popLast() {
        if (head == null)
            return null;
        if (head.getNext() == null) {
            return null;
        }
        Node<T> secondLast = head;
        T data = tail.getData();
        while (secondLast.getNext() != null)
            secondLast = secondLast.getNext();

        secondLast.setNext(null);
        return data;

    }

//    MyNode<T> temp = head;
//    while (temp.getNext() != tail) {
//        temp = (MyNode<T>) temp.getNext();
//    }
//    T data = tail.getKey();
//    temp.setNext(null);
//    tail = temp;
//    return data;


    protected Node<T> search(T searchData) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.getData().equals(searchData))
                return temp;
            temp = temp.getNext();
        }
        if (temp == null)
            System.out.println("Element not found!!!");
        else
            System.out.println("Element found!!!");
        return null;
    }

    protected boolean insertAfter(T searchData, T insertData) {
        if (search(searchData) != null) {
            Node<T> nextNode = search(searchData).getNext();
            Node<T> newNode = new Node<>(insertData);
            search(searchData).setNext(newNode);
            newNode.setNext(nextNode);
            return true;
        } else {
            System.out.println("Node not found unable to insert New Node ");
        }
        return false;
    }


    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
