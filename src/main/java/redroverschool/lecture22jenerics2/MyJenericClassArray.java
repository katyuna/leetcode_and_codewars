package redroverschool.lecture22jenerics2;

public class MyJenericClassArray<T extends Comparable<T>> {
    private final T[] array;

    public MyJenericClassArray(T[] array) {
        this.array = array;
    }

    public T findMinimum() {
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }

        return min;
    }
}
