
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        switch (args[0]) {
            case "task1":
                task1();
                break;
            case "task2":
                task2();
                break;
            case "task3":
                task3();
                break;
            case "task4":
                task4();
                break;
            case "task5":
                task5();
                break;
            case "task6":
                task6();
                break;
            case "task7":
                task7();
                break;
            case "task8":
                task8();
                break;
            case "task9":
                task9();
                break;
        }
    }

    public static void task1() {
        int[] Array=new int[100];
        int i=0,element=13;
        while(i<100){
            if(element%13==0^element%17==0){
                Array[i]=element;
                i++;
            }
            element++;
        }
        for(int j:Array){
            System.out.println(j);
        }

    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);
        int lenght=scan.nextInt();
        int[] Array=new int[lenght];
        for(int i=0;i<lenght;i++){
            Array[i]=(int)Math.round(100*Math.random());
        }
        int maxElement=Array[0],
                minElement=Array[0],
                maxIndex=0,minIndex=0;
        for(int i=0;i<lenght;i++){
            if(Array[i]>maxElement){
                maxElement=Array[i];
                maxIndex=i;
            }
            if(Array[i]<minElement){
                minElement=Array[i];
                minIndex=i;
            }
            i++;
        }

        if(maxIndex<minIndex){
            int temp;
            temp=minIndex;
            minIndex=maxIndex;
            maxIndex=minIndex;
        }
        int sum=0;
        for(int i=minIndex;i<maxIndex;i++){
            sum+=Array[i];
        }
        for(int i:Array){
            System.out.println(i);
        }
        System.out.println("sum:"+sum);

    }

    public static void task3() {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int flag=0;
        for(int i=2;i<number/2&&flag==0;i++){
            if(number%i==0){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Simple Number");
        }
        else {
            System.out.println("Not Simple Number");
        }
    }

    public static void task4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input rows amount");
        int rows=scan.nextInt();
        System.out.println("Input columns amount");
        int columns=scan.nextInt();
        System.out.println("Input number for search");
        int number=scan.nextInt();
        System.out.println("Input delta");
        int delta=scan.nextInt();

        int[][] Array=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                Array[i][j]=(int)Math.round(100*Math.random());
            }
        }
        int[] coordinates=new int[rows];
        int[] iterationAmount=new int[rows];
        Arrays.fill(coordinates,-1);
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(Array[i][j]==number) {
                    coordinates[i]=columns;
                    iterationAmount[i]=j+1;
                    break;
                }
                iterationAmount[i]=j+1;
            }
        }

        int notIntervalNumbersAmount=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(Array[i][j]>(number-delta)|Array[i][j]<(number+delta)){
                    notIntervalNumbersAmount++;
                    continue;
                }
            }
        }

        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(Array[i][j]);
            }
            System.out.println();
        }
            OUTER: for (int i=0;i<rows;i++){
            if(coordinates[i]==0){i++;}
            System.out.println("координаты "+ i+" "+coordinates[i]+"количество итераций"+iterationAmount);
            }
        System.out.println("Not interval number amount"+notIntervalNumbersAmount);

    }

    public static void task6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rows amount");
        int rows = scan.nextInt();
        int columns = rows;
        int[][] Array = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                Array[i][j] = 0;
            }
        }


        for (int i = 0; i < rows / 2 + 1; i++) {
            for (int j = i; j < columns; j++) {
                Array[i][j] = 1;
            }
            columns--;
        }
        columns = rows;

        for (int i = rows - 1; i > rows / 2 - 1; i--) {
            for (int j = rows - i - 1; j < columns; j++) {
                Array[i][j] = 1;
            }
            columns--;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(Array[i][j]);
            }
            System.out.println();
        }

        for (int i=0;i<rows;i++){
            for (int j=0;j<rows;j++){
                if(Array[i][j]==1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }


    }

    public static void task5() {
        int[] array = new int[4];
        int i = 0;
        int RandomNumber;
        while (i < 4) {
            RandomNumber = (int) (Math.random() * 90 + 10);
            array[i] = RandomNumber;
            i++;
        }
        System.out.println(Arrays.toString(array));
        int[] sortArray;
        sortArray = Arrays.copyOf(array, 4);
        Arrays.sort(sortArray);
        int flag = 0;
        if (!Arrays.equals(array, sortArray)) {
            flag = 1;
        }
        if (flag == 0) {
            System.out.println("Strictly increasing sequence");
        } else System.out.println(" Not strictly increasing sequence");

    }

    public static void task7() {

        int[] array = new int[4];
        int i = 0;
        int RandomNumber;
        while (i < 4) {
            RandomNumber = (int) (Math.random() * 90 + 10);
            array[i] = RandomNumber;
            i++;
        }
        System.out.println(Arrays.toString(array));

        i = 0;
        int flag=0;
        while (i + 1 < 4&flag==0) {
            if (array[i] < array[i + 1]) {
                flag=1;
            }
            i++;
        }
        if (flag==1){
            System.out.println("Strictly increasing sequence");
        } else System.out.println(" Not strictly increasing sequence");
    }

    public static void task8() {

        int[] array = new int[4];
        int i = 0;
        int RandomNumber;
        while (i < 4) {
            RandomNumber = (int) (Math.random() * 90 + 10);
            array[i] = RandomNumber;
            i++;
        }
        System.out.println(Arrays.toString(array));

        i = 0;
        int flag=0;
        do {
            if (array[i] < array[i + 1]) {
                flag=1;
            }
            i++;
        }while (i + 1 < 4&flag==0);
        if (flag==1){
            System.out.println("Strictly increasing sequence");
        } else System.out.println(" Not strictly increasing sequence");
    }

    public static void task9()
    {
        //String[] cardName=new String[13];
        String[] cardName={"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
        String[] cardSuit={"Hearts","Spades","Clubs","Diamonds"};
        int randNameIndex,randSuitIndex;
        randNameIndex=(int)(Math.random()*(13-1)+1);
        randSuitIndex=(int)(Math.random()*(4-1)+1);
        System.out.println(cardName[randNameIndex]+" of "+cardSuit[randSuitIndex]);
     }
}
