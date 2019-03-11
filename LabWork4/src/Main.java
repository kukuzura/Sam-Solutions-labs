import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите строку");
        String str=scanner.nextLine();
       // Palindrome.amountOfPalindromesCalculation(str);
       // str.toUpperCase();
       // if(Palindrome.isPalindrome(str.trim())){
        //    System.out.println("палиндром");
        //}
        Words words=new Words();
        System.out.println(words.wordShift(str));

    }
}
