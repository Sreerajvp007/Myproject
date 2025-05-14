
public class Dog {

    String name = "tony";
    String breed = "bulldog";

    public void bark() {
        System.out.println("Woof!");
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.bark();

    }
}
