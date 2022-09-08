public class TestShape {

    public static void main(String[] args) {

        Shape s1 = new Shape("Circle");
        Shape s2 = new Shape("Triangular");
        Shape s3 = new Shape("Circle", "red");
        Shape s4 = new Shape("Square", "blue");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());

        System.out.println(s1.getColor());
        s1.setColor("white");
        System.out.println(s1.getColor());
    }
}
