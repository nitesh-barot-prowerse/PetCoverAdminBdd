package utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class GenericArray<E> {

    private final E[] arr;
    public final int length;

    public GenericArray(Class<E> type, int length) {
        this.arr = (E[]) Array.newInstance(type,length);
        this.length = length;
    }

    public E get(int index) {
        return arr[index];
    }

    public void set(int index , E element) {
        arr[index] = element;
    }

    public List<E> toList() {
        return Arrays.asList(arr);
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
