package level_4;
import java.util.*;

public class ques_2 {

    // Count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Store digits in array
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Duck Number: contains zero but not at first position
    public static boolean isDuck(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && s.charAt(0) != '0';
    }

    // Armstrong Number
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    // Harshad Number
    public static boolean isHarshad(int num) {
        int[] digits = getDigits(num);
        int sum = 0;
        for (int d : digits) sum += d;
        return num % sum == 0;
    }

    // Palindrome Number
    public static boolean isPalindrome(int num) {
        String s = String.valueOf(num);
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    // Prime Number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Neon Number: sum of digits of square == number
    public static boolean isNeon(int num) {
        int sq = num * num;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == num;
    }

    // Spy Number: sum of digits == product of digits
    public static boolean isSpy(int num) {
        int[] digits = getDigits(num);
        int sum = 0, product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    // Automorphic Number: square ends with the number
    public static boolean isAutomorphic(int num) {
        int sq = num * num;
        return String.valueOf(sq).endsWith(String.valueOf(num));
    }

    // Buzz Number: divisible by 7 or ends with 7
    public static boolean isBuzz(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }

    // Perfect Number
    public static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num && num != 1;
    }

    // Abundant Number
    public static boolean isAbundant(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }

    // Deficient Number
    public static boolean isDeficient(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum < num;
    }

    // Strong Number: sum of factorial of digits == number
    public static boolean isStrong(int num) {
        int[] digits = getDigits(num);
        int sum = 0;
        for (int d : digits) {
            sum += factorial(d);
        }
        return sum == num;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // ====================== MAIN ======================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Digit Count: " + countDigits(num));
        System.out.println("Duck Number: " + isDuck(num));
        System.out.println("Armstrong Number: " + isArmstrong(num));
        System.out.println("Harshad Number: " + isHarshad(num));
        System.out.println("Palindrome: " + isPalindrome(num));
        System.out.println("Prime: " + isPrime(num));
        System.out.println("Neon Number: " + isNeon(num));
        System.out.println("Spy Number: " + isSpy(num));
        System.out.println("Automorphic: " + isAutomorphic(num));
        System.out.println("Buzz Number: " + isBuzz(num));
        System.out.println("Perfect Number: " + isPerfect(num));
        System.out.println("Abundant Number: " + isAbundant(num));
        System.out.println("Deficient Number: " + isDeficient(num));
        System.out.println("Strong Number: " + isStrong(num));

        sc.close();
    }
}

