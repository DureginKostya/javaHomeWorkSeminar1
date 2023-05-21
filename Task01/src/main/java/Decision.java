public class Decision {
    public int getArithmeticProgression(int n) { // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        int sumNumber = 0;
        for (int i = 1; i <= n ; i++) {
            sumNumber += i;
        }
        return sumNumber;
    }
    public int getFactorial(int n) { // n! (произведение чисел от 1 до n)
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}