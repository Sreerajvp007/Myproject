
interface Playable {

    public void play();
}

class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("you are playing Piano");
    }
}

class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("you are playing Guitar");
    }
}

public class Main3 {

    public static void main(String[] args) {

        Piano p1 = new Piano();
        Guitar g1 = new Guitar();

        p1.play();
        g1.play();

    }
}
