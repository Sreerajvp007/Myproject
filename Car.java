
public class Car {

    String[] brand = {"tata", "bmw"};
    String[] model = {"harrier", "i3"};
    double[] price = {2100000, 1500000};

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println("brand: " + car1.brand[0] + "\nmodel: " + car1.model[0] + "\nprice: " + car2.price[0]);
        System.out.println();
        System.out.println("brand: " + car2.brand[1] + "\nmodel: " + car2.model[1] + "\nprice: " + car2.price[1]);

    }
}
