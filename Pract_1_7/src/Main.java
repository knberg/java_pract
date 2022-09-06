import java.util.Scanner;

public class Main {

    public static long fact(int N) {
        long answer = 1;
        for (int i = N; i > 0; i--) {
            answer *= i;
        }
        return answer;
    }

    public static long fact_rec(int N) {
        if (N <= 1)
            return 1;
        else
            return (fact_rec(N - 1) * N);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int numb = input.nextInt();
        System.out.println(numb + "! = " + fact_rec(numb) + " (rec)");
        System.out.println(numb + "! = " + fact(numb) + " (no rec)");
    }
}