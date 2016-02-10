import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_10_ExtractWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("([a-zA-Z]+)");
        Matcher m = pattern.matcher(text);

        while (m.find()){
            System.out.print(m.group(1) + " ");
        }
    }
}
