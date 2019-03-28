import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file=null;
        try {
            file = new FileInputStream("C:\\test.txt");
            file.read();
            file.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
        catch (IOException ex){
            System.out.println("input output");
        }
    }


}
