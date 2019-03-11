import java.lang.Character;
public class Password {

    public boolean isCryptoSecure(String str){
        int upperFlag=0,lowerFlag=0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                upperFlag=1;
            }
            if (Character.isLowerCase(str.charAt(i))){
                lowerFlag=1;
            }
            if(lowerFlag==1&&upperFlag==1)
                return true;
        }
        return false;
    }
}
