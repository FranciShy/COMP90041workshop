package wksp11.arraylist;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> list;

    public Queue() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        return list.remove(0);
    }
}
