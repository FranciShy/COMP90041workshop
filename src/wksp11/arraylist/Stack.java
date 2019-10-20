package wksp11.arraylist;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }
}
