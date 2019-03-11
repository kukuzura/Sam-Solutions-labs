import java.lang.Character.*;

public class Words {
   // public int ThreeSymbolsCalculation(String str){
   //     String searchSymbols=str.substring(0,3);
   // }

    public String wordShift(String str){
        String [] words=str.split(" ");
        String temp=new String();
        for(int i=0,j=words.length-1;i<words.length/2&&j>words.length/2-1;i++,j--){
            temp=words[i];
            words[i]=words[j];
            words[j]=temp;
        }
        str=String.join(" ",words);
        return str;
    }

    public String numberWordsSort(String str){
        String[] words=str.split(" ");
        int[] numberSum=new int[words.length];
        int tempInt;
        String tempString;
        for(int i=0;i<words.length;i++) {
            tempInt = Integer.parseInt(words[i]);
            while (tempInt > 1) {
                numberSum[i] += tempInt % 10;
                tempInt /= 10;
            }
        }
            for(int i=0;i<words.length;i++){
                for(int j=words.length-1;j>0;j--){
                    if(numberSum[i]>numberSum[j]){
                       tempInt=numberSum[i];
                       numberSum[i]=numberSum[j];
                       numberSum[j]=tempInt;

                       tempString=words[i];
                       words[i]=words[j];
                       words[j]=tempString;
                    }
                }
            }

            return str=String.join(" ",words);
    }

    public int calculateNumberSum(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                sum+=Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }
}
