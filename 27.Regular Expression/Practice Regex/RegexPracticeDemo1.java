import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

public class RegexPracticeDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(
                "E:\\Programming\\2.Java Programming\\Resources\\String\\Regular Expression\\Practice Regex\\test.txt");
        Scanner sc = new Scanner(file);
        boolean linePresent = sc.hasNext();
        while (linePresent) {
            String word = sc.next();
            int i = word.lastIndexOf(":");
            String mobile = word.substring(i + 1);
            Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
            Matcher m = p.matcher(mobile);
            if (m.find()) {
                System.out.println(m.group() + " IS Valid Mobile Number");
            } else {
                System.out.println(mobile + " IS Not  Valid Mobile Number");
            }
            linePresent=sc.hasNext();
        }

    }
}
