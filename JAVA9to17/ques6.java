package JAVA9to17;

import java.util.stream.IntStream;


public class ques6 {
    public static void main(String[] args) {
        IntStream
                .rangeClosed(1,10)
                .filter(e->e>7)
                .boxed()
                .findFirst()
                .stream()
                .mapMulti((number,Consumer)-> IntStream
                        .rangeClosed(1,10)
                        .forEach(e-> Consumer.accept(e*number)))
                .forEach(System.out::println);

    }
}
