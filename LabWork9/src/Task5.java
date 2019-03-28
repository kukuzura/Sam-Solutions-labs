import java.util.ArrayList;

public class Task5 {

    public static void init(){
        ArrayList<ArrayList<Integer>> array= new ArrayList<>();

        for (int j=0;j<3;j++) {
            ArrayList<Integer> list=new ArrayList<Integer>();
            for (int i = 0; i < 4; i++) {
                list.add(i);
            }
            array.add(list);
        }

        for(ArrayList<Integer> rows:array){
            for (int i=0;i<4;i++){
                System.out.println(rows.get(i));
            }
        }
    }

}
