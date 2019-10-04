package codeGym.com;

import java.util.Arrays;

public class MyList<E> {
    private int size =0;
    private final static int DEFAULT_CAPACITY=10;
   private Object elements[];

    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getDefaultCapacity() {
        return DEFAULT_CAPACITY;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e){
        if(size ==elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
    public E get(int i){
        if(i>=size||i<0){
            throw new IndexOutOfBoundsException("Index: " +i+",Size"+getSize());
        }
        return (E)elements[i];
    }
}
