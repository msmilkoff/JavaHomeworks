import java.util.Scanner;

public class Problem_05_DecimalToBase7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(Integer.toString(number, 7));
    }
}
