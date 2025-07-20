

class Animal {
    void sound() {
        System.out.println("Makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Barks loudly...");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meows quietly...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound(); // should print: Barks loudly...
        Cat c1 = new Cat();
        c1.sound();
    }
}
