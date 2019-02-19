package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите символ контура");
        char outlineSymbol = scan.next().charAt(0);
        System.out.println("Введите символ заливки");
        char insideSymbol = scan.next().charAt(0);
        System.out.println("Введите длину прямоугольника");
        int lenght = scan.nextInt();
        System.out.println("Введите ширину");
        int width = scan.nextInt();
        for (int i = 0; i < width-1; i++) {
            System.out.print(outlineSymbol);
        }
        System.out.println();
        for (int i = 0; i < width - 2; i++) {
            System.out.print(outlineSymbol);
            for (int j = 0; j < lenght - 2; j++) {
                System.out.print(insideSymbol);
            }
            System.out.print(outlineSymbol);
            System.out.println();
        }
        for (int i = 0; i < width-1; i++) {
            System.out.print(outlineSymbol);
        }
        System.out.println();
    }
}