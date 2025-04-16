package redroverschool.lecture22jenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = List.of(
                "В",
                "лесу",
                "родилась",
                "елочка"
        );

        System.out.println(transformList(strings, new StringLength()));
        System.out.println(transformList(strings, new HowManyLetterE()));
        System.out.println(transformList(List.of(1,2,4,6,7,9), new IsEven()));


        //только четные числа
        System.out.println(filter(List.of(1, 2, 3,4), new IsEven()));

     /*
     //способ имплементации через анонимный внутренний класс
     System.out.println(transformList(strings, new Transformer<String, Integer>(){
                    @Override
                    public Integer transform(String element) {
                        return element.length();

                    }));

      */


    }

    //Метод превращает один список в другой
    public static <IN, OUT> List<OUT> transformList(List<IN> elements, Transformer<IN, OUT> transformer) {
        List<OUT> result = new ArrayList<>();
        for (IN element : elements) {
            OUT calculatedResult = transformer.transform(element);
            result.add(calculatedResult);
        }

        return result;
    }


//метод, который фильтрует
    public static <T> List<T> filter(List<T> inputList, Transformer<T, Boolean> predicate){
        List<T> result = new ArrayList<>();
        for (T element : inputList) {
          if(predicate.transform(element))
            result.add(element);
        }

        return result;

    }
}
