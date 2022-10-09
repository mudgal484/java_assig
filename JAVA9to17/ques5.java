package JAVA9to17;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ques5 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list
                .stream()
                .filter(e->e>5)
                .findFirst()
                .ifPresentOrElse(System.out::println, ()-> System.out.println("Value is not Present"));
        list
                .stream()
                .filter(e->e>50)
                .findFirst()
                .or(()-> Optional.of(-1))
                .ifPresent(System.out::println);
        list
                .stream()
                .filter(e->e>50)
                .findFirst()
                .orElseThrow();
    }
}
