package level_4;
import java.util.*;
class ques_5 {

    // Prime check
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Neon check
    public static boolean isNeon(int num) {
        int sq = num * num;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == num;
    }

    // Spy number check
    public static boolean isSpy(int num) {
        int sum = 0, prod = 1;
        int temp = num;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            prod *= d;
            temp /= 10;
        }
        return sum == prod;
    }

    // Automorphic check
    public static boolean isAutomorphic(int num) {
        int sq = num * num;
        return String.valueOf(sq).endsWith(String.valueOf(num));
    }

    // Buzz check
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        int num = 7;

        System.out.println("Is Prime? " + isPrime(num));
        System.out.println("Is Neon? " + isNeon(num));
        System.out.println("Is Spy? " + isSpy(num));
        System.out.println("Is Automorphic? " + isAutomorphic(num));
        System.out.println("Is Buzz? " + isBuzz(num));
    }
}
