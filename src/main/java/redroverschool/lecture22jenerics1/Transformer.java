package redroverschool.lecture22jenerics1;

public interface Transformer<T, U> {
    U transform (T element);
}
