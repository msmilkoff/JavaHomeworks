import java.util.Random;
import java.util.Scanner;

public class Problem_07_RandomizeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i <= Math.abs(n-m); i++) {
            System.out.print(getRandom(n, m) + " ");
        }
    }

    private static int getRandom(int n, int m) {

        if (n < m){
            return n + new Random().nextInt(Math.abs(n - m));
        } else if (n == m){
            return n;
        }
            return n - new Random().nextInt(Math.abs(n - m));
    }
}
