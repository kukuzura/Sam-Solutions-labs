package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] ones, tens, hundreds;
        ones = new String[]{"один", " два", " три", " четыре", " пят", " шест",
                " сем", " восем",
                " девять"};
        tens = new String[]{"двадцать", " тридцать", " сорок", " пятьдесят", "шесть",
                " семь", " восемь", " девяносто"};
        hundreds = new String[]{"сто ", "двести ", "триста ", "четыреста ",
                "пятьсот ", "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "};
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];     //массив для цифр числа
        System.out.println("Введите число от 100 до 999");
        while(!scan.hasNextInt() ){     //проверка на ввод чисел
            System.out.println("Это не число");
            scan.next();
        }
        int number = scan.nextInt();
        while(number<100 || number>999){
            System.out.println("Число от 100 до 999");
            number = scan.nextInt();
        }
        for (int i = 2; i >= 0; i--) {
            numbers[i] = number % 10;
            number = number / 10;
        }
        System.out.print(hundreds[numbers[0] - 1]);

        if (numbers[1] == 1) {                   //если от 10 до 19
            switch (numbers[2]) {
                case 0:
                    System.out.print(" десять");
                    break;
                case 1:
                    System.out.print(" одинадцать");
                    break;
                case 2:
                    System.out.print(" двенадцать");
                    break;
                case 4:
                    System.out.print(" четырнадцать");
                    break;
                default:
                    System.out.print(ones[numbers[2] - 1] + "надцать");
            }
        } else {
            if (numbers[1] != 0)
                System.out.print(tens[numbers[1] - 2]);
            if (numbers[2] != 0)
                System.out.print(ones[numbers[2] - 1]);
        }
    }
}
