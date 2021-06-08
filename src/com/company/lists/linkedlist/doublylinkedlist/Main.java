package com.company.lists.linkedlist.doublylinkedlist;

import com.company.lists.linkedlist.singlylinkedlist.EmployeeLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones", 123);
        Employee johnDoe = new Employee("John","Doe", 4567);
        Employee marySmith = new Employee("Mary","Smith", 22);
        Employee mikeWilson = new Employee("Mike","Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);

        System.out.println(list.getSize());
        list.printList();
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();

    }

}
