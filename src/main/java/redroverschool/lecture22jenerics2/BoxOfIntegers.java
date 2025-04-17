package redroverschool.lecture22jenerics2;

public class BoxOfIntegers {
   private final Integer value;

    public BoxOfIntegers(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BoxOfIntegers{" +
                "value=" + value +
                '}';
    }
}

