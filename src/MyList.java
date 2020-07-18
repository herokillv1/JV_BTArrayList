import java.util.Arrays;
import java.util.Iterator;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }


    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index , E element){
        if (size == elements.length) {
            ensureCapa();
        }
        for (int elementsIndex = size - 1; elementsIndex >= index; elementsIndex--) {
            elements[elementsIndex + 1 ] = elements[elementsIndex];
        }
        elements[index] = element;
        size++;
    }

    public void remove(int index){
        for (int elementsIndex = index; elementsIndex < size; elementsIndex++) {
            elements[elementsIndex] = elements[elementsIndex + 1];
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    public Object clone() {
        MyList cloneList = new MyList();
        cloneList.elements = this.elements;
        cloneList.size = this.size;
        return cloneList;
    }

    public boolean isContain(E element) {
        for (int index = 0; index < size; index++) {
            if (elements[index] == element) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        for (int index = 0; index < size; index++) {
            if (elements[index] == element) {
                return index;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity){
        if (minCapacity>this.size||minCapacity<this.size) {
            System.out.println(minCapacity + " chưa phải minCapacity");
            minCapacity = this.size;
            System.out.println("minCapacity : " + minCapacity);
        }else {
            minCapacity = this.size;
            System.out.println("minCapacity : " + minCapacity);
        }

    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    public void clear() {
        for (int index = 0; index < size; index++) {
            elements[index] = null;
        }
    }

    public void display(){
        for (Object object : elements){
            System.out.println(object);
        }
    }

}
