package redroverschool.lecture22jenerics2;

public class BoxOfStrings {
    private final String value;

    public BoxOfStrings(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BoxOfIntegers{" +
                "value=" + value +
                '}';
    }
}
