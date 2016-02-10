import java.util.Scanner;

public class Problem_06_Base7ToDecimal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String numberToString = Integer.toString(number);

        if (numberToString.contains("7") || numberToString.contains("8") || numberToString.contains("9")){
            System.out.println("Invalid input: Input number must be to base 7!");

            return;
        }

        int numberToBaseTen = 0;
        for (int i = 0; i < numberToString.length(); i++){
            int remainder = number % 10;
             numberToBaseTen += remainder * Math.pow(7, i);
             number /= 10;
        }
        System.out.println(numberToBaseTen);
    }
}
