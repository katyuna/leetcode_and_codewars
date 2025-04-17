package redroverschool.lecture22jenerics2;

public class Main {
    public static void main(String[] args) {

        Box<Integer> IntegerBox = new Box<>(123);
        Box<String> StringBox = new Box<>("123");

        Integer [] intArray = new Integer[]{1, 2, 3, 4, 5};
        String [] stringArray = new String[]{"A", "AA", "AB"};

       MyArray.printArray(intArray);
        MyArray.printArray(stringArray);

        System.out.println(MyArray.findMinimum(intArray));
        System.out.println(MyArray.findMinimum(stringArray));

        MyJenericClassArray<Integer> jenericIntegerArray = new MyJenericClassArray<>(new Integer[]{1,2,-3,4});
        System.out.println(jenericIntegerArray.findMinimum());
    }
}

