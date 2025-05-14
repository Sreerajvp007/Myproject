
abstract class Shape {

    public abstract void area(double a, double b);
}

class Circle extends Shape {

    @Override
    public void area(double radius, double pi) {
        double area = pi * (radius * radius);
        System.out.println("area of circle: " + area);
    }
}

class Square extends Shape {

    @Override
    public void area(double length, double width) {
        double area = length * width;
        System.out.println("area of square: " + area);
    }
}

public class Main2 {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Square s1 = new Square();

        c1.area(10, 3.14);
        s1.area(20, 19);

    }
}
