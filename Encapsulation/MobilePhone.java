
public class MobilePhone {

    String name = "nothing 2a";
    private int imei = 12345678;

    public int getImei() {
        return imei;
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        System.out.println(m1.getImei());

    }
}
