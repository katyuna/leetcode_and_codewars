package redroverschool.lecture22jenerics2;

public class MyArray<T> {
    final private T[] array;

    public MyArray(T[] array) {
        this.array = array;
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static <T extends Comparable<T>> T findMinimum(T[] array) {
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;

    }
}
