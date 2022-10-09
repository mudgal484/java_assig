package JAVA9to17;
import java.util.stream.IntStream;
public class ques4 {
    public static void main(String[] args) {
        IntStream
                .iterate(0, i->i<=10, i->i+1)
                .boxed()
                .forEach(System.out::println);
    }
}
