package wksp10.innerclass;

import wksp7.Student;

import java.util.Iterator;

public class StackBuffer implements Iterable {
    private Object[] stream;

    // we just use shallow copy here
    public StackBuffer(Object[] stream) {
        this.stream = stream;
    }

    @Override
    public Iterator iterator() {
        return this.new BufferIterator();
    }

    private class BufferIterator implements Iterator {
        int count = stream.length;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Object next() {
            return stream[--count];
        }
    }

    public static void main(String[] args) {
        Object[] array = {"Tony Stark", new Student("Tony Stark", "Iron Man"), 47, 33.33};
        StackBuffer stack = new StackBuffer(array);
        for (Object o: stack) {
            System.out.println(o);
        }
    }
}
