import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class RegularExpression {

    public boolean isValidPhoneNumber(String str) {
        Pattern pattern = Pattern.compile("^([+]?(8|375)?)?(\\d\\d)?[\\d]{7}");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public String tagsRemove(String str) {
        str.replaceAll("<[^>]*>", "tag");
        return str;
    }

    public static void main(String[] args) {
        String str1 = new String("<p> fgdfgdfgdf </p>");
        RegularExpression expression = new RegularExpression();
        expression.tagsRemove(str1);

    }
}