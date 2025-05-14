
interface Payment {

    public void payAmount(double money);
}

class CreditCard implements Payment {

    @Override
    public void payAmount(double money) {
        System.out.println("you paid " + money + " through Credit card");

    }

}

class UpiPayment implements Payment {

    @Override
    public void payAmount(double money) {
        System.out.println("you paid " + money + " through UPI");

    }

}

public class Main4 {

    public static void main(String[] args) {

        CreditCard c1 = new CreditCard();
        UpiPayment u1 = new UpiPayment();

        c1.payAmount(2000);
        u1.payAmount(1000);

    }
}
