import java.util.Scanner;



//jjhgjhgjhgjhgjhgjhg
//jhkjhkjhkjhkjhk


    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.print("Введите операцию (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                result = num1 / num2;
            } else {
                System.out.println("Неверная операция!");
                return;
            }

            System.out.println("Результат: " + result);
        }
    }

