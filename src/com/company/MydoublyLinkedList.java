package com.company;

public class MydoublyLinkedList implements MyList, MyDeque {
    Node first;
    Node last;
    int size;

    @Override
    public Object get(int index) {
        Node current = first;
        if (index < 0 || index > size() - 1) {
            throw new ArrayIndexOutOfBoundsException("INDEX OUT OF BAUNDS");
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public void addFirst(Object element) {
        Node newNode = new Node(element);
        newNode.next = first;
        first.prevous = newNode;
        first = newNode;
        size++;
    }

    @Override
    public void addLast(Object element) {
        add(element);
    }

    public void add(Object obj) {
        Node newNode = new Node(obj);
        if (first == null) {
            first = newNode;
            last = newNode;

        }
        newNode.prevous = last;
        last.next = newNode;
        last = newNode;
        size++;
    }

    @Override
    public void removeFirst() {
        removeIndex(0);
    }


    @Override
    public void removeLast() {
        removeIndex(size() - 1);
    }

    @Override
    public boolean offerFirst(Object element) {
        add(element);
        return true;
    }

    @Override
    public boolean offerLast(Object element) {
        removeLast();
        return true;
    }

    @Override
    public Object poll() {
        if (remove(get(0))) {
            return get(0);
        }
        return null;
    }


    @Override
    public void removeIndex(int index) {
        if (index < 0 || index > size() - 1) {
            throw new ArrayIndexOutOfBoundsException("INDEX OUT OF BAUNDS");
        }
        remove(get(index));
    }


    @Override
    public boolean remove(Object obj) {
        if (size() > 0) {
            if (first.value == obj) {
                first = first.next;
                size--;
                return true;
            } else {
                Node current = first;
                for (int i = 0; i < size(); i++) {
                    if (i == size() - 1) {
                        current.next = null;
                        last = current;
                        size--;
                        return true;
                    }
                    if (current.value == obj) {
                        current.prevous.next = current.next;
                        current.next.prevous = current.prevous;
                        size--;
                        return true;
                    }
                    current = current.next;
                }
            }
        }
        return false;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object obj) {
        for (int i = 0; i < size(); i++) {
            if (obj == (get(i))) {
                return true;
            }
        }
        return false;
    }

    public void printList() {
        for (int i = 0; i < size(); i++) {
            System.out.println(get(i));
        }

    }
}

class Node<T> {
    Object value;
    Node next;
    Node prevous;

    public Node(T value) {
        this.value = value;
    }


}
