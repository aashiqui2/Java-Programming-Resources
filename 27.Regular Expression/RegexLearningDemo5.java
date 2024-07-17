import java.util.regex.*;
public class RegexLearningDemo5 {
    public static void main(String[] args) {
        String sentence="Programming Erode Tamil Nadu";
        String sentence2="www.google.com";
        // String[] st=sentence.split("\\s");
        // String[] st=sentence2.split("\\.");//?Argument -regex pattern
        String[] st=sentence2.split("a");
        for(String s:st){
            System.out.println(s);
        }

        // Pattern p=Pattern.compile("\\s");
        Pattern p=Pattern.compile("\\.");//regex pattern
        // Pattern p=Pattern.compile("a");

        // String[] st2=p.split(sentence);//? Argument -String
        String[] st2=p.split(sentence2);
        for(String s:st2){
            System.out.println(s);
        }
    }
}
