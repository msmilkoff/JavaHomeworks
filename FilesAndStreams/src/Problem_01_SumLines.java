import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem_01_SumLines {

    public static void main(String[] args) throws FileNotFoundException {

        try
        (BufferedReader bufferedReader = new BufferedReader
        (new FileReader("resources\\text.txt"))){

            String line = bufferedReader.readLine();
            while (line != null){

                int charSum = 0;
                for (int i = 0; i < line.length(); i++) {
                    charSum += line.charAt(i);
                }

                System.out.println(charSum);

                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
