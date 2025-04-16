package redroverschool.lecture22jenerics;

public class HowManyLetterE implements Transformer<String, Integer> {
    @Override
    public Integer transform(String element) {
        int result = 0;
        for (char c : element.toCharArray()) {
            if (c == 'е') {
                result++;
            }
        }
        return result;
    }
}
