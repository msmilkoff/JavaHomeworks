import java.util.Scanner;

public class Problem_01_RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();

        int area = sideA * sideB;
        System.out.println(area);
    }
}
