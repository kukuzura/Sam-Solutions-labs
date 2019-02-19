package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        while(!scan.hasNextInt()){
            System.out.println("Это не целое число");
            scan.next();
        }
        int firstNumber=scan.nextInt();
        System.out.println("Введите второе  число");
        while(!scan.hasNextInt()){
            System.out.println("Это не целое число");
            scan.next();
        }
        int secondNumber=scan.nextInt();
        for(int i=firstNumber+1;i<secondNumber;i++){
            for(int j=0;j<i;j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
