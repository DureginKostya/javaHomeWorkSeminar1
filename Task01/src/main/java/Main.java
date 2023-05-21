// Задание №1: Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        String number = scanner.next();
        try {
            int userValue = Integer.parseInt(number);
            Decision decision = new Decision();
            int resultArithmeticProgression = decision.getArithmeticProgression(userValue);
            System.out.printf("Сумма чисел от 1 до %d равна %d\n", userValue, resultArithmeticProgression);
            int resultFactorial = decision.getFactorial(userValue);
            System.out.printf("%d! = %d", userValue, resultFactorial);
        } catch (NumberFormatException e) {
            System.out.println("Введено неправильное значение");
        }
    }
}