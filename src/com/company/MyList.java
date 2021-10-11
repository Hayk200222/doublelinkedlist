package com.company;

public interface MyList<T> {
    T get(int index);

    void add(T obj);

    void removeIndex(int index);

    boolean remove(T obj);

    int size();

    boolean contains( T obj);

}
