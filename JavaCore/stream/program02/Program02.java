package stream.program02;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program02 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(22, 25, 21, 36, 30);

        Optional<Integer> result = numbers.stream().reduce((sum, num) -> {
            sum = num + sum;
            return sum;
        });

//        Alternative :
//        Optional<Integer> result = numbers.stream().reduce((sum, num) -> sum + num);

        System.out.println(result.get());
        System.out.println(result.get() + 10);
    }
}
