
class Printer {

    void print() {
        System.out.println("printing..");
    }

}

class InkJetPrinter extends Printer {

    void print() {
        System.out.println("printing on ink jet printer..");
    }

}

class LaserPrinter extends Printer {

    void print() {
        System.out.println("printing on Laser printer..");
    }

}

public class Sample2 {

    public static void main(String[] args) {

        InkJetPrinter ink = new InkJetPrinter();
        LaserPrinter laser = new LaserPrinter();
        Printer p1 = new Printer();

        ink.print();
        laser.print();
        p1.print();

    }
}
