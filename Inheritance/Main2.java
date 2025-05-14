
class Vehicle {

    void drive() {
        System.out.println("you are driving me");

    }
}

class Car extends Vehicle {

    String name = "tata";

}

class Bike extends Vehicle {

    String name = "hunter";

}

public class Main2 {

    public static void main(String[] args) {
        Car c1 = new Car();

        Bike b1 = new Bike();
        System.out.println(c1.name);
        c1.drive();
        System.out.println(b1.name);
        b1.drive();

    }
}
