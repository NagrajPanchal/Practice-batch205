package com.bridgelabz.doubtsession;

public class LinkedListMain
{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1=new LinkedList<>();
        System.out.println("********* : Linked List using Push : Element Add from head : **********");
        linkedList1.push(70); // Add Node from head
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();  // Display Node Elements

        LinkedList<Integer> linkedList2=new LinkedList<>();
        System.out.println("\n******** : Linked List using Append : Element add from tail : *********");
        linkedList2.append(70); // Add node from tail
        linkedList2.append(30);
        linkedList2.append(56);
        linkedList2.display(); // Display Node elements

        LinkedList<Integer> linkedList3=new LinkedList<>();
        System.out.println("\n******** : Insert a node in between : *********");
        linkedList3.append(56);
        linkedList3.append(70);
        System.out.println("********** : Display linked list without insert : *********");
        linkedList3.display(); // Display Node elements
        System.out.println("******** : Display linked list insert a node in between : *******");
        linkedList3.insertAfter(56,30);
        linkedList3.display(); // Display Node elements

        LinkedList<Integer> linkedList4=new LinkedList<>();
        System.out.println("********* : Delete a Node from head using pop method : **********");
        linkedList4.push(70);
        linkedList4.push(30);
        linkedList4.push(56); // Head Node Delete
        System.out.println("********** : Display linked list without delete : *********");
        linkedList4.display();  // Display Node Elements
        System.out.println("********** : Display linked list after delete the element : *********");
        System.out.println("Popped element : "+linkedList4.pop()); // Delete a head node
        linkedList4.display(); // Display Node Elements

        LinkedList<Integer> linkedList5=new LinkedList<>();
        System.out.println("********* : Delete a Node from tail using popLast method : **********");
        linkedList5.push(70); // Tail Node Delete
        linkedList5.push(30);
        linkedList5.push(56);
        System.out.println("********** : Display linked list without delete : *********");
        linkedList5.display();  // Display Node Elements
        System.out.println("********** : Display linked list after delete the element : *********");
        System.out.println("Popped Elements : "+linkedList5.popLast());
        linkedList5.display(); // Display Node Elements

        LinkedList<Integer> linkedList6=new LinkedList<>();
        System.out.println("********* : Display the Linked List Elements for Search operation : **********");
        linkedList6.push(70);
        linkedList6.push(30); // Search a node
        linkedList6.push(56);
        linkedList6.display();  // Display Node Elements
        if(linkedList6.search(30) == null)
            System.out.println("Searched element not found!!!");
        else System.out.println("Searched element found! in the Linked List");


        LinkedList<Integer> linkedList7=new LinkedList<>();
        System.out.println("\n******** : Insert a node After the element in between : *********");
        linkedList7.append(56);
        linkedList7.append(30); // Insert Node after 30 Node
        linkedList7.append(70);
        System.out.println("********** : Display linked list without insert After Node : *********");
        linkedList7.display(); // Display Node elements
        System.out.println("******** : Display linked list insert After a node in between : *******");
        linkedList7.insertAfter(30,40);
        linkedList7.display(); // Display Node elements

        LinkedList<Integer> linkedList8=new LinkedList<>();
        System.out.println("****** : Delete a Node in-between searched node the linked List : *******");
        linkedList8.push(70);
        linkedList8.push(40); // Pop
        linkedList8.push(30);
        linkedList8.push(56);
        System.out.println("********** : Display linked list without delete : *********");
        linkedList8.display();  // Display Linked List
        System.out.println("********** : Display linked list after delete the element : *********");
        System.out.println("Popped Elements : "+linkedList8.popSearchNode(40));
        linkedList8.display(); // Display Node Elements

        LinkedList<Integer> linkedList9=new LinkedList<>();
        System.out.println("****** : Ascending ordered linked List : *******");
        linkedList9.push(70); // Sort all elements
        linkedList9.push(40);
        linkedList9.push(30);
        linkedList9.push(56);
        System.out.println("********** : Display linked list without order : *********");
        linkedList9.display();  // Display Linked List
        System.out.println("********** : Display linked list after Ascending order : *********");
        int[] arr = {56,30,40,70};
        linkedList9.ascendingOrderSort(arr);
        linkedList9.printSort(arr);
    }
}
