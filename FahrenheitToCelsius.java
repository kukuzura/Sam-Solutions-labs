package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите тмпературу в градусах по Френгейту:");
        while(!scan.hasNextDouble()) {
            System.out.println("Введите число");
            scan.next();
        }
        double fahrenheit=scan.nextDouble();
        double celsius =(fahrenheit-23)*5/9;
        System.out.printf("Температура в градусах Цельсия: %.2f",celsius);
    }
}
