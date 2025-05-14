
class Employee {

    String name = "sreeraj";
    double salary = 25000;

}

class Manager extends Employee {

    int teamSize = 10;

}

public class Main {

    public static void main(String[] args) {
        Manager m1 = new Manager();
        System.out.println(m1.teamSize);

    }
}
