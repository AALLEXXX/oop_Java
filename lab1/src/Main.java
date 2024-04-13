import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       	/**
	* Лаб 1 Бекмухамедов 5 вариант
	*/
	Scanner scanner = new Scanner(System.in);


        System.out.print("Введите значение а: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение c: ");
        double c = scanner.nextDouble();

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        double first_part = Math.sqrt(Math.pow(Math.E, a * x) + (x * x)) * Math.log(x * x) + b * x + 10;
        double second_part = Math.sin(c * x) + 4.2;
        double result = first_part / second_part;
        System.out.print(Math.round(result));
    }
    }
