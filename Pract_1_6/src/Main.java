import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int N = 15;
        double[] array_1 = new double[N];
        double[] array_2 = new double[N];

        for (int i = 0; i < N; i++) {
            array_1[i] = (int) (Math.random() * 100);
        }

        System.out.println("Массив с помощью Math.random():");
        System.out.println(Arrays.toString(array_1));
        Arrays.sort(array_1);
        System.out.println("Сортированный массив с помощью Math.random():");
        System.out.println(Arrays.toString(array_1));

        System.out.println();

        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            array_2[i] = (int) (rand.nextDouble() * 100);
        }

        System.out.println("Массив с помощью Random():");
        System.out.println(Arrays.toString(array_2));
        Arrays.sort(array_2);
        System.out.println("Сортированный массив с помощью Random():");
        System.out.println(Arrays.toString(array_2));
    }
}