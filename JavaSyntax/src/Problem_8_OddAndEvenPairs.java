import java.util.Scanner;

public class Problem_8_OddAndEvenPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        if (numbers.length % 2 != 0){
            System.out.println("Invalid length");
            return;
        }

        EvaluatePairs(numbers);
    }

    private static void EvaluatePairs(int[] numbers) {
        for (int i = 1; i < numbers.length; i+=2) {
            if (numbers[i - 1] % 2 == 0 && numbers[i] % 2 == 0){
                System.out.printf("%d, %d -> both are even", numbers[i - 1], numbers[i]);
                System.out.println();
            }else if (numbers[i - 1] % 2 != 0 && numbers[i] % 2 != 0) {
                System.out.printf("%d, %d -> both are odd", numbers[i - 1], numbers[i]);
                System.out.println();
            }else{
                System.out.printf("%d, %d -> different", numbers[i - 1], numbers[i]);
                System.out.println();
            }
        }
    }
}
