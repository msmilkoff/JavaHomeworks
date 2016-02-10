import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem_04_CopyJPGFile {

    public static void main(String[] args) throws FileNotFoundException {

        String source = "resources\\evil-pigeon.jpg";
        String target = "resources\\my-copied-picture.jpg";

        try
        (FileInputStream inputStream = new FileInputStream(source)) {
            FileOutputStream outputStream = new FileOutputStream(target);

            byte[] buffer = new byte[1024];

            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
