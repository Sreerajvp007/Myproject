
public class Product {

    private String name = "car";
    private double price = 150;
    private int stock = 30;

    public void setName(String name) {
        this.name = name;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public void setStock(int stock) {

        this.stock = stock;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public static void main(String[] args) {

        Product p1 = new Product();

        Person one1 = new Person();

        p1.setPrice(500);
        System.out.println(p1.getPrice());
        System.out.println(one1.getAge());
    }
}
