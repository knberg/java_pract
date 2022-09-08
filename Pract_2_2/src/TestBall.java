public class TestBall {

    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball("FootBall", "Black-and-white", 22);
        Ball b3 = new Ball("BasketBall", "Brown", 19);
        Ball b4 = new Ball("BaseBall", "Purple", 7);
        Ball b5 = new Ball("TennisBall", "Yellow", 6);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println(b4.getType());

        System.out.println(b5.getColor());
        b3.setColor("Black-and-white");
        System.out.println(b5.getColor());
    }
}