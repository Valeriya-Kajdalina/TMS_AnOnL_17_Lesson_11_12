import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private T[] list;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Выбран неверный размер массива");
        } else {
            this.list = (T[]) new Object[capacity];
        }
    }

    public MyArrayList() {
        this.list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T element) {
        ensureCapacity();
        list[size++] = element;
    }

    public void add(int index, T element) {
        ensureCapacity();
        for (int i = size; i >= index; i--) {
            list[i] = list[i - 1];
        }
        size++;

    }

    private void ensureCapacity() {
        if (size <= list.length) {
            int newCapacity = list.length * 2;
            list = Arrays.copyOf(list, newCapacity);
        }
    }

    public void delite(int index) {
        ensureCapacity();
        for (int i = index; i <= size; i++) {
            list[i] = list[i + 1];
        }
        size--;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list,size));
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        return (T) list[index];
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
        size = 0;
    }
    public boolean containsElements(T element) {
        for (int i = 0; i <= list.length; i++) {
            if (list[i] == element) {
                return true;
            }
        }
        return false;
    }
}