
public class Rectangle {

    private double length = 54;
    private double width = 10;

    private double area() {
        return length * width;

    }

    public void setLength(double length) {
        this.length = length;

    }

    public void setWidth(double width) {

        this.width = width;

    }

    public double getArea() {
        return area();
    }

    public static void main(String[] args) {

        Rectangle obj = new Rectangle();
        obj.setLength(45);
        obj.setWidth(20);
        System.out.println(obj.getArea());

    }
}
