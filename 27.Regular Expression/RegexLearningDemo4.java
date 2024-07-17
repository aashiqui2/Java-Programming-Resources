import java.util.regex.*;

public class RegexLearningDemo4 {
    public static void main(String[] args) {
        String sentence="abaabbaaabbbabab";
        // ! at least one macth
        // Pattern p=Pattern.compile("a+");

        //! atleast ab one time or more
        // Pattern p=Pattern.compile("ab+");

        //! atleast a*
        // Pattern p=Pattern.compile("a*");

        //! matches the exact a in or not a 
        // Pattern p=Pattern.compile("a?");

        //! a for two times
        // Pattern p=Pattern.compile("a{2}");
        Pattern p=Pattern.compile("a{1,3}");

        Matcher m=p.matcher(sentence);
        while(m.find()){
            System.out.println(m.group()+" start at "+ m.start());
        }
    }
}
