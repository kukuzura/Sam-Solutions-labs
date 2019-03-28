import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Task4 {
    public static void main(String[] args) {
        File file;
        try {
            file = new File("text.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.readLine() != null) {
                System.out.println("line");
            }
            bufferedReader.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
