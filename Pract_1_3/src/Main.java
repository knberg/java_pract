import java.util.Scanner;

public class Main {

    public static int sum_for(int[] array, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int sum_while(int[] array, int size) {
        int sum = 0, i = 0;
        while (i < size) {
            sum += array[i++];
        }
        return sum;
    }

    public static int sum_do_while(int[] array, int size) {
        int sum = 0, i = 0;
        do {
            sum += array[i++];
        } while (i < size);

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количство чисел: ");
        int N = input.nextInt();                         // количество чисел в массиве
        int[] array = new int[N];                        // выделение памяти под массив
        System.out.print("Введите " + N + " чисел: ");

        for (int i = 0; i < N; i++)              // заполнение массива числами
            array[i] = input.nextInt();

        System.out.println("Сумма с циклом for = " + sum_for(array, N));
        System.out.println("Сумма с циклом while = " + sum_while(array, N));
        System.out.println("Сумма с циклом do_while = " + sum_do_while(array, N));
    }
}