import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

    public String InputCommand() {
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        try {

            String str = breader.readLine();
            return str;

        } catch (IOException ex) {
            System.out.println("IO Exeption");
        }
        return null;
    }

    public String[] checkAndSplit() {
        String str = InputCommand();
        if (str != null) {
            String[] words = str.split(" ");
                return words;
        }
        return null;
    }
}


