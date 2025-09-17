package level_4;
import java.util.Scanner;
class ques_6 {

    // Sum of proper divisors
    public static int sumOfDivisors(int num) {
        int sum = 1; 
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    // Perfect check
    public static boolean isPerfect(int num) {
        return sumOfDivisors(num) == num;
    }

    // Abundant check
    public static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }

    // Deficient check
    public static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }

    // Strong number check
    public static boolean isStrong(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == num;
    }

    // Factorial helper
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int num = 145;

        System.out.println("Is Perfect? " + isPerfect(num));
        System.out.println("Is Abundant? " + isAbundant(num));
        System.out.println("Is Deficient? " + isDeficient(num));
        System.out.println("Is Strong? " + isStrong(num));
    }
}

