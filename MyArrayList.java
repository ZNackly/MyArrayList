package src.Test;

public class MyArrayList {
    private String[] array = new String[10];
    int size = 0;

    public void add(String elem) {
        array[size] = elem;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
    }

    public void remove(String elem) {
        for (int i = 0; i < size; i++) {
            if (elem == array[i]) {
                remove(i);
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        return array[index];
    }
}
