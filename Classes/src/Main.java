import belarus.Belarus;
import util.Utility;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        switch (args[0]){
            case "task1":
              Belarus bel=new Belarus();
                System.out.println(bel.districts.brest);
                bel.districts=null;
                System.out.println(bel.districts.brest);
                System.out.println(bel.shortInfo());
                break;
            case "task2":
                Utility ut=new Utility();
                Scanner scan=new Scanner(System.in);
                int moneyAmount=scan.nextInt();
                System.out.println(ut.formatMoney(moneyAmount));

                int year=(int)(2000+Math.round(100*Math.random()));
                System.out.println(year+" "+ut.isLeapYear(year));
                break;
        }
    }
}
