package level_4;
import java.util.*;
class ques_3 {

    // Method to count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits in an array
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Method to sum digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Method to sum squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += (int)Math.pow(d, 2);
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshad(int num) {
        int[] digits = getDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int num) {
        int[] freq = new int[10];
        while (num > 0) {
            freq[num % 10]++;
            num /= 10;
        }
        int count = 0;
        for (int f : freq) if (f > 0) count++;

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 1729;

        System.out.println("Count of digits: " + countDigits(num));

        int[] digits = getDigits(num);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad? " + isHarshad(num));

        int[][] freq = digitFrequency(num);
        System.out.println("Digit Frequency:");
        for (int[] f : freq) {
            System.out.println("Digit " + f[0] + " -> " + f[1] + " times");
        }
    }
}
