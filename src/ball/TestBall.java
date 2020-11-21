package ball;

public class TestBall {

    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(30, 20 );
        b1.setXY(330, 100);
        b2.move(-10, 40);
        System.out.println(b1.toStr());
        System.out.println(b2.toStr());
    }
}
