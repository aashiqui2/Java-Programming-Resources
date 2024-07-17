import java.util.regex.*;

public class RegexLearningDemo1 {
    public static void main(String[] args) {
        String str="Tamil is the oldest language";
        // Pattern p=Pattern.compile("Tamil");

        //! to check whether the "Tamil is starting at first"
        // Pattern p=Pattern.compile("^Tamil");

        // ! to check whether the "Tamil is ending at last"
        // Pattern p=Pattern.compile("language$");

        //! to check whether the "Ta" two character present or not"
        Pattern p=Pattern.compile("T|a");
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
            System.out.println(m.group()+ " It start at "+m.start()+" and it ends at "+m.end());
            // ? end will retrun index+1;

        }

    }
}
