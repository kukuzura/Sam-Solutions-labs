package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите начальную сумму вклада:");
        double deposit=scan.nextDouble();
        double originalDeposit=deposit;
        System.out.println("Введите процент:");
        double percent=scan.nextDouble();
        int period = 0;
        while(deposit<2*originalDeposit){
            deposit=deposit*Math.pow((1+percent/100),period);
            period++;
        }
        System.out.println("Сумма вклада удвоится через "+ period+" месяца(ев)");
    }
}
