package QuestionsPractice.Questions.Question82;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
    private int[] numbers;

    public ArrayOperation(int[] numbers) {
        this.numbers = numbers;
    }

    private class Statistics {
        double mean() {
            if (numbers.length == 0) return 0;
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return (double) sum / numbers.length;
        }

        double median() {
            if (numbers.length == 0) return 0;
            int[] sorted = Arrays.copyOf(numbers, numbers.length);
            Arrays.sort(sorted);
            int mid = sorted.length / 2;
            if (sorted.length % 2 == 0) {
                return (sorted[mid - 1] + sorted[mid]) / 2.0;
            } else {
                return sorted[mid];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        ArrayOperation arrayOperation = new ArrayOperation(numbers);
        Statistics stats = arrayOperation.new Statistics();

        System.out.printf("Mean: %.2f\n", stats.mean());
        System.out.printf("Median: %.2f\n", stats.median());

        scanner.close();
    }
}
