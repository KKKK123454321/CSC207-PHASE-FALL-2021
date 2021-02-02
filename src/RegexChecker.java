import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChecker {


    private static Pattern pattern;
    private static Matcher matcher;


    public RegexChecker(String s) {

    }


    public static void main(String[] args){


        //match one String against one regex
        System.out.println(Pattern.matches("([.w]){2}f", "..f"));
        System.out.println(Pattern.matches("[k*]a*b", "kaaaaabx"));

        //using a Matcher object to find matching substrings
        pattern = Pattern.compile("[a-c]\\+{5}\""); //becomes \+ repeated 5 times
        matcher = pattern.matcher("a1bb\\\\c2a4\\\\b+++++\"6c89\\\\c+++++\"");
        List<String> alphaNumSequence = new ArrayList<String>();
        while(matcher.find()) {
            System.out.println(matcher.group());
            alphaNumSequence.add(matcher.group());
        }

        //using the String method "matches" to check if a String matches a regex
        String str11;
        String str22;
        str11 = "#Rio2016";
        str22 = "#Rio2020";

        boolean isSame = str11.matches("^#[a-zA-Z]*([2-9][0-9])\1{2}");
        boolean isSame2 = str22.matches("^#[a-zA-Z]*([2-9][0-9])\\1\\1");


        System.out.println(isSame);
        System.out.println(isSame2);

    }
}
