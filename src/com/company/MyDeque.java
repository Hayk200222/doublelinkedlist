package com.company;

public interface MyDeque {
    void addFirst(Object element);

    void addLast(Object element);

    void add(Object element);

    void removeFirst();

    void removeLast();

    boolean offerFirst(Object element);

    boolean offerLast(Object element);

    Object poll();


}
