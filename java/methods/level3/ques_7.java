package level_4;
import java.util.Arrays;

public class ques_7 {

    // Find factors
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) factors[index++] = i;

        return factors;
    }

    // Greatest factor
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Sum of factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Product of factors
    public static long productFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Product of cube of factors
    public static long productCubeFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= (long) Math.pow(f, 3);
        return product;
    }

    public static void main(String[] args) {
        int num = 12;
        int[] factors = getFactors(num);

        System.out.println("Factors of " + num + ": " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productCubeFactors(factors));
    }
}
