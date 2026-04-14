class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}
class Car {}

import java.util.*;
class FruitBox<T extends Fruit> {
    private List<T> stuff = new ArrayList<>();
    public void add(T f) {
        stuff.add(f);
    }
    public void show() {
        for (T f : stuff) System.out.println(f.getClass().getSimpleName());
    }
}
