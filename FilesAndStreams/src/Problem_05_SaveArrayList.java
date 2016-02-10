import java.io.*;
import java.util.ArrayList;

public class Problem_05_SaveArrayList {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try
        (ObjectOutputStream outStream = new ObjectOutputStream
        (new FileOutputStream("resources\\doubles.list"))){

            ArrayList<Double> doubles = new ArrayList<>();
            doubles.add(3.14);
            doubles.add(1.66);
            doubles.add(13.37);
            doubles.add(3.33);

            outStream.writeObject(doubles);

            //proof of accurate execution:
            ObjectInputStream inputStream = new ObjectInputStream
            (new FileInputStream("resources\\doubles.list"));

            System.out.println(inputStream.readObject());
        }
    }
}
