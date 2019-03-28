

public class Task1 {
    public static void main(String[] args) {
        String strings[]=new String[4];

        strings[0]="1";
        strings[1]=null;
        strings[2]="2";
        strings[3]="3";

        for (int i=0;i<strings.length;i++){
            try {

                System.out.println(strings[i].hashCode());
            }
            catch (NullPointerException ex){
                System.out.println("Null pointer exсeption");
            }
        }
    }
}
