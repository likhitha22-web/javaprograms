public class Array {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        System.out.println("Array elements:");

        for (int number : numbers) {
            System.out.println(number);
            sum = sum + number;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / numbers.length);
    }
}