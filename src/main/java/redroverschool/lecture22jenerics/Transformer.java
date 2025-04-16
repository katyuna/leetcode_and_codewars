package redroverschool.lecture22jenerics;

public interface Transformer<T, U> {
    U transform (T element);
}
