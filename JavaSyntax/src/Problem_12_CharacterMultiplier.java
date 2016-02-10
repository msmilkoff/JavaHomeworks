import java.util.Scanner;

public class Problem_12_CharacterMultiplier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] inputArgs = scanner.nextLine().split(" ");

        String firstMultiple = inputArgs[0];
        String secondMultiple = inputArgs[1];

        System.out.println(multiplyChars(firstMultiple, secondMultiple));
    }

    private static int multiplyChars(String firstMultiple, String secondMultiple) {

        int sum = 0;
        for (int i = 0; i < firstMultiple.length(); i++) {
            sum += firstMultiple.charAt(i) * secondMultiple.charAt(i);
        }

        if (firstMultiple.length() > secondMultiple.length()) {
            String remainingChars = firstMultiple.substring(secondMultiple.length());

            for (int i = 0; i < remainingChars.length(); i++) {
                sum += remainingChars.charAt(i);
            }
        }else if (secondMultiple.length() > firstMultiple.length()){
            String remainingChars = secondMultiple.substring(firstMultiple.length());

            for (int i = 0; i < remainingChars.length(); i++) {
                sum += remainingChars.charAt(i);
            }
        }

        return sum;
    }
}
