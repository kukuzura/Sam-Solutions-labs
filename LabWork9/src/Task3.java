import java.util.HashSet;

public class Task3 {

    public static void init() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        for (int i = 0; i < 15; i++) {
            set.add(i);
        }
        for (int i : set) {
            System.out.println(i);
        }

    }

}
