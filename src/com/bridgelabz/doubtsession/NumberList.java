package com.bridgelabz.doubtsession;

class Numbers<T>
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
        else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void print()
    {
        Node<T> temp = head;
        if(head == null)
        {
            System.out.println("Linked list is Empty");
        }
        while(temp != null)
        {
            System.out.print(temp.getData()+ " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public T pop()
    {
        T data = head.getData();
        head = head.getNext();
        return data;
    }
}

public class NumberList
{
    public static void main(String[] args)
    {
        System.out.println("******** : Number List : ********");
        Numbers<String> numbersObj = new Numbers<>();
        numbersObj.push("1: One");
        numbersObj.push("2: Two");
        numbersObj.push("3: Three");
        numbersObj.push("4: Four");
        numbersObj.print();
        System.out.println("Popped Element is : "+numbersObj.pop());
        numbersObj.print();
    }
}
