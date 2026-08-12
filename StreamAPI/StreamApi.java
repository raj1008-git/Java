import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8);
        Predicate<Integer> p = (n) -> n % 2 == 0 ? true : false;

        int result = nums.stream().filter(p).map(n -> n * 2).reduce(0, (c, e) -> c + e);

        System.out.println(result);

    }
}
