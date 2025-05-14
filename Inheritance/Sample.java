
class Persons {

    String name = "sree";
    String address = "ponnani";

}

class Student extends Persons {

    int rollNumber = 21;
    String course = "bsc";

}

public class Sample {

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("name: " + s1.name + "\naddress: " + s1.address + "\nroll number: " + s1.rollNumber + "\ncourse: " + s1.course);

    }
}
