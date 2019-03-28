import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Task7 {

    public static void printWithoutLoops() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++) {
            array.add(i);
        }

        Iterator<Integer> iter = array.iterator();
        print(iter);

    }

    public static void print(Iterator<Integer> iter){
        if(iter.hasNext()) {
            System.out.println(iter.next());
            print(iter);
        }
    }

    public static void main(String[] args) {
        printWithoutLoops();
    }


}
