package level_3;
import java.util.Arrays;

public class ques_10 {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000; // ensures 4 digit
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.println("Random Numbers: " + Arrays.toString(numbers));

        double[] results = findAverageMinMax(numbers);
        System.out.println("Average = " + results[0] + ", Min = " + results[1] + ", Max = " + results[2]);
    }
}

