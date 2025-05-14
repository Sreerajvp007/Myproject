
public class Hello {

    void greet() {
        System.out.println("hello!!");
    }

    void greet(String name) {
        System.out.println("Hello " + name + "!!");

    }

    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.greet();
        obj.greet("sreeraj");
    }
}
