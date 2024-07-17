// ! mobile number validation

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPracticeDemo {
    public static void main(String[] args) {
        // String mobile="06384679229";
        String mobile="956384679229";


        // Pattern p=Pattern.compile("[0-9]{10}");
        // ?test case- the first number doesn't start with 0 in 10 digit but in 11 digit first digit may be 0.
        Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m=p.matcher(mobile);
        if (m.find()) {
            System.out.println(m.group()+" IS Valid Mobile Number"); 
        }
        else{
            System.out.println(mobile+" IS Not  Valid Mobile Number"); 
        }

    }
}
