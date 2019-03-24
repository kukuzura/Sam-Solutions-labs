import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str=new String("dgfffffklgldkfgjggggg");

        Palindrome.amountOfPalindromesCalculation(str);
        str.toUpperCase();
        if(Palindrome.isPalindrome(str.trim())){
            System.out.println("палиндром");
        }
        Words words=new Words();
        System.out.println(words.wordShift(str));

        System.out.println(words.threeSymbolsCalculation(str));

    }
}
