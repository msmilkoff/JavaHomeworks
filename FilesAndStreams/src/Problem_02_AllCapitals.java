import java.io.*;

public class Problem_02_AllCapitals {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(
        new FileReader("resources\\text.txt"));

        String fullText = "";
        String temp;

        while ((temp = bufferedReader.readLine()) != null) {
            fullText += temp.toUpperCase() + "\r\n";
        }

        PrintWriter printWriter = new PrintWriter(
        new BufferedWriter(
        new FileWriter("resources\\text.txt")));

        printWriter.write(fullText);

        printWriter.flush();
        bufferedReader.close();
        printWriter.close();
       }
    }

