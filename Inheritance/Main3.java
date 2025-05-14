
class Bird {

    void fly(int speed) {
        System.out.println("hey!!! iam  flyingg " + speed + " per hour speeed");
    }
}

class Parrot extends Bird {

    String name = "parrot";

}

class Eagle extends Bird {

    String name = "Eagle";

}

public class Main3 {

    public static void main(String[] args) {
        Parrot p1 = new Parrot();
        Eagle e1 = new Eagle();
        System.out.println(p1.name);
        p1.fly(54);
        System.out.println(e1.name);
        e1.fly(77);
    }
}
