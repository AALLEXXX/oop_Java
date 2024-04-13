import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        /**
         * Задание 2 Вариант 5 Бекмухамедов А.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число иттераций:");
        int n = scanner.nextInt();
        System.out.println("Введите число x ");
        double x = scanner.nextDouble();
        double res = 0;

        for (double i = 0; i < n; i++) {
            res += Math.pow(2, (i/2)) * Math.cos(Math.PI * i / 4) * Math.pow(x, i) / getFactorial(i);
        }
        System.out.println(res);

    }

    public static double getFactorial(double n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
