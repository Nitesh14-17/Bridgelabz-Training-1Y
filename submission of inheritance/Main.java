class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Tweet");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "Generic";
        a.age = 5;
        a.makeSound();

        Dog d = new Dog();
        d.name = "Max";
        d.age = 3;
        d.makeSound();

        Cat c = new Cat();
        c.name = "Kitty";
        c.age = 2;
        c.makeSound();

        Bird b = new Bird();
        b.name = "Sky";
        b.age = 1;
        b.makeSound();
    }
}
