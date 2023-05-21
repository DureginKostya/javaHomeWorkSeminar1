public class Decision {
    public void printSimpleNumbers() {
        for (int i = 2; i < 1000; i++) {
            if (getSimpleNumber(true, i)) {
                System.out.println(i);
            }
        }
    }
    private boolean getSimpleNumber(boolean flag, int number) {
        for (int i = 2; i <= (int)Math.pow(number, 0.5); i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}