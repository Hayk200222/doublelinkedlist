package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        MydoublyLinkedList list = new MydoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.removeFirst();
        list.removeLast();
        list.printList();

    }
}
