package redroverschool.lecture22jenerics1;

public class IsEven implements  Transformer<Integer, Boolean>{

    @Override
    public Boolean transform(Integer element) {

        return (element % 2) == 0;
    }
}
