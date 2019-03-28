import java.util.ArrayList;

public class Task6 {

    public static void notThreeOnes() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int[] numbers = {1, 2, 3, 4, 5, 6, 4, 2354, 1, 23, 3, 42, 3, 234, 23, 1, 1, 1, 1, 1,};
        int onesFlag = 0;
        int i = 0;
        while (onesFlag != 2) {
            if (numbers[i] == 1) {
                onesFlag++;
            }
            array.add(numbers[i]);
            i++;
        }

        for(int n:array){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        notThreeOnes();
    }


}
