public class Palindrome {

    public static boolean isPalindrome(String word) {
        for (int i = 0, j = word.length()-1; i < word.length() / 2 && j > word.length() / 2-1; i++, j--) {
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
        }
        return true;
    }

   public static void amountOfPalindromesCalculation(String str){
        int wordsAmount=0;
        int palindromesAmount=0;
        double palindromesPercent;
        for(String word: str.split(" ")){
            if(isPalindrome(word)){
                palindromesAmount++;
            }
            wordsAmount++;
        }
        palindromesPercent=(double) palindromesAmount/wordsAmount;
       System.out.println("количество палиндромов:  "+palindromesAmount);
       System.out.println ("процент палиндромов:  "+palindromesPercent);
   }

}
