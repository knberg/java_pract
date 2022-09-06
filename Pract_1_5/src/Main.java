import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        DecimalFormat dF = new DecimalFormat( "#.###" );
        for (int i = 1; i <= 10; i++)
        System.out.println(dF.format(1. / i) + " ");

    }
}