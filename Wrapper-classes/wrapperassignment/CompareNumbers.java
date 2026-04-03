public class CompareNumbers {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(a.equals(b));
        System.out.println("a==b is true because 100 is cached, c==d is false because 200 is not cached, equals checks value");
    }
}
