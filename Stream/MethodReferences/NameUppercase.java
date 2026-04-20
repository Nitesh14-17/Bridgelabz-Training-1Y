import java.util.*;

public class NameUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "carol");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
