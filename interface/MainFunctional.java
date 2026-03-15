import java.util.function.Predicate;
import java.util.function.Function;
class MainFunctional {
    public static void main(String[] args) {
        Predicate<Double> p = t -> t > 30;
        System.out.println(p.test(35.0));
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("hello"));
        Runnable r = () -> System.out.println("Job running");
        r.run();
    }
}