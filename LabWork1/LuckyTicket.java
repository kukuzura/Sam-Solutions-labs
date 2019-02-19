package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите номер билета");
        int ticketNumber=scan.nextInt();
        int[] numbers=getNumbers(ticketNumber);
        if(numbers[0]+numbers[1]+numbers[2]==numbers[3]+numbers[4]+numbers[5]){
            System.out.println("Билет счастливый");
        }
        else System.out.println("Билет несчастливый");
    }

    public static int[] getNumbers(int ticketNumber){
        int[] numbers=new int[6];
        for(int i=0;i<6;i++){
            numbers[i]=ticketNumber%10;
            ticketNumber/=10;
        }
        return numbers;
    }
}
