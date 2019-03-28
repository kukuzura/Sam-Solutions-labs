import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task3 {
    public static void task3() {
        FileInputStream file = null;
        try {
            file = new FileInputStream("C:\\test.txt");
            file.read();
            file.close();
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }
}
