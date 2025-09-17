package level_4;
import java.util.*;
class ques_4 {

    // Store digits
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Reverse array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Compare arrays
    public static boolean areEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // Check Palindrome
    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] rev = reverseArray(digits);
        return areEqual(digits, rev);
    }

    // Check Duck Number (contains zero but not starting with zero)
    public static boolean isDuck(int num) {
        String s = String.valueOf(num);
        return s.indexOf('0') > 0;
    }

    public static void main(String[] args) {
        int num = 1221;

        int[] digits = getDigits(num);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        int[] rev = reverseArray(digits);
        System.out.print("Reversed: ");
        for (int d : rev) System.out.print(d + " ");
        System.out.println();

        System.out.println("Arrays equal? " + areEqual(digits, rev));
        System.out.println("Is Palindrome? " + isPalindrome(num));
        System.out.println("Is Duck Number? " + isDuck(num));
    }
}
