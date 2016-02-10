import java.util.Scanner;

public class Problem_09_HitTheTarget {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = scanner.nextInt();

        int[] addends = new int[20];
        for (int i = 0; i < 20; i++){
            addends[i] = i + 1;
        }

        hitTheTarget(sum, addends);
    }

    private static void hitTheTarget(int sum, int[] addends) {
        for (int i = 0; i < addends.length; i++) {
            int first = addends[i];
            for (int j = 0; j < addends.length; j++) {
                int second = addends[j];

                if ((first + second) == sum){
                    System.out.printf("%d + %d = %d\n", first, second, sum);
                }
                if ((first - second) == sum){
                    System.out.printf("%d - %d = %d\n", first, second, sum);
                }
            }
        }
    }
}
