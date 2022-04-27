package lesson2;

public class lesson2 {
    public static void main(String[] args) {

        System.out.println(twoIntegers(15, 20));
        examination(5);
        System.out.println(isCheckNegativeNumber(9));
        exercise4("Olga", 4);
        System.out.println(checkLeapYear(1999));
    }

    public static boolean checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean twoIntegers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void examination(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    private static boolean isCheckNegativeNumber(int a) {
        return a < 0;
    }

    public static void exercise4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}