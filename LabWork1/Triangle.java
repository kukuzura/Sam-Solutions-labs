package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] x = new double[3], y = new double[3], sides = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите координаты точки " + (i + 1));
            while(!scan.hasNextDouble()) {                             //проверка на ввод чисел
                System.out.println("Координата должна быть числом");
                scan.next();
            }
            x[i] = scan.nextDouble();
            while(!scan.hasNextDouble()) {
                System.out.println("Координата должна быть числом");
                scan.next();
            }
            y[i] = scan.nextDouble();
        }
        sides[0] = Math.sqrt(Math.pow(x[1] - x[0], 2) + Math.pow(y[1] - y[0], 2));    //расчет длин сторон
        sides[1] = Math.sqrt(Math.pow(x[2] - x[1], 2) + Math.pow(y[2] - y[1], 2));
        sides[2] = Math.sqrt(Math.pow(x[0] - x[2], 2) + Math.pow(y[0] - y[2], 2));
        double perimeter=sides[0]+sides[1]+sides[2];
        double semiperimeter=perimeter/2;
        double area=Math.sqrt(semiperimeter*(semiperimeter-sides[0])*(semiperimeter-sides[1])*(semiperimeter-sides[2]));
        System.out.printf("Периметр треугольника: %.2f %n",perimeter);
        System.out.printf("Площадь треугольника: %.2f %n",area);
    }
}
