import java.util.Scanner;

public class Problem_03_FormattingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String hexaDecimal = Integer.toHexString(a).toUpperCase();
        String binary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        System.out.format("|%-10s|%10s|%10.2f|%-10.3f|",
                hexaDecimal,
                binary,
                b,
                c);
    }
}
