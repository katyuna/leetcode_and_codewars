package redroverschool.lecture22jenerics1;

public class StringLength implements Transformer<String, Integer> {

    @Override
    public Integer transform(String element) {
        return element.length();
    }
}
