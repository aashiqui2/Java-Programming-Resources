import java.util.regex.*;

public class RegexLearningDemo3 {
    public static void main(String[] args) {
        // String sentence="Tamil Tamilan TamilNadu 638002 #@!$%^&*()";
        // ?for group 
        String sentence="TamilTamilan TamilNadu 638002_ #@!$%^&*()";

        //!to print the space in the sentence 
        // Pattern p=Pattern.compile("\\s");

        //! except spaces it print all the character includeing special character but not spaces
        // Pattern p=Pattern.compile("\\S");

        // ! only print the digit 
        // Pattern p=Pattern.compile("\\d");

        //! except the digit it will print the spaces and character, special character
        // Pattern p=Pattern.compile("\\D");

        //! only  charcter , number and   ( _underscore) but not special character and spaces
        // Pattern p=Pattern.compile("\\w");

        //! Only Special Character and spaces
        // Pattern p=Pattern.compile("\\W");

        //! boundry means starting of a word matches
        // ? matches the word which is exactly start  at tamil but ends with anything
        // Pattern p=Pattern.compile("\\bTamil");
        // ? matches the word which is exactly ends at tamil but starts with anything
        // Pattern p=Pattern.compile("Tamil\\b");

        //! print the specific(exact) word
        // Pattern p=Pattern.compile("\\bTamil\\b");

        //! non-word boundary. (only for word)
        //? matches the word which not ends at tamil but start at tamil
        // Pattern p=Pattern.compile("Tamil\\B");

        //! word boundary. (only for word) 
        //!  Previous macth ending
        //?(group)
        // Pattern p=Pattern.compile("\\GTamil");

        //! print everything
        Pattern p=Pattern.compile(".");

        Matcher m=p.matcher(sentence);
        while(m.find()){
            System.out.println(m.group()+" start at "+ m.start());
        }
    }
}
