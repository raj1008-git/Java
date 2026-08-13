import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raj", "Singh", "John", "Kishor");
        Optional<String> name = names.stream().filter(str -> str.contains("x")).findFirst();
        System.out.println(name.orElse("Not Found"));
    }
}
