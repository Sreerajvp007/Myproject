
public class Person {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person one = new Person();
        one.setAge(27);

        System.out.println(one.getAge());
        System.out.println("hello");
        System.out.println("hello2");
        System.out.println("hello222");
        System.out.println("hello3");

    }
}
