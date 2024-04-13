import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        /**
         * Задание 1 Вариант 5 Бекмухамедов А.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        double result;
        if (x <= 1){
            System.out.print("Введите значение a: ");
            double a = scanner.nextDouble();

            result = a * Math.pow(Math.sin(x), 2) + Math.sqrt(x);
            System.out.print(result);

        } else {
            System.out.print("Введите значение b: ");
            double b = scanner.nextDouble();

            result = b * Math.pow(Math.E, Math.pow(x, 2));
            System.out.print(result);
        }
    }
}