
abstract class Animal {

    public abstract void makeSound();
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow...meow");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("boww..boww");
    }
}

public class Main {

    public static void main(String[] args) {

        Cat c1 = new Cat();
        Dog d1 = new Dog();

        c1.makeSound();
        d1.makeSound();

    }
}
