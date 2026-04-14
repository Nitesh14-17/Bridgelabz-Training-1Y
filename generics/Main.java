public class Main {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(42);
        System.out.println(b1.get());
        Box<String> b2 = new Box<>();
        b2.set("hi");
        System.out.println(b2.get());
        Box<Double> b3 = new Box<>();
        b3.set(3.14);
        System.out.println(b3.get());

        Pair<String, Integer> p = new Pair<>("Amol", 20);
        System.out.println(p.getFirst() + " " + p.getSecond());

        System.out.println(Util.isEqual(5, 5));
        System.out.println(Util.isEqual("a", "b"));

        System.out.println(Util.maximum(2, 7, 4));
        System.out.println(Util.maximum("cat", "bat", "rat"));

        FruitBox<Fruit> fb = new FruitBox<>();
        fb.add(new Apple());
        fb.add(new Mango());
        fb.show();
        // FruitBox<Car> cb = new FruitBox<>(); // won't compile
    }
}
