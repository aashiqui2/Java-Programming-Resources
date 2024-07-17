import java.util.regex.*;;
public class RegexLearningDemo2 {
    public static void main(String[] args) {
        String sentence="abcBcacabaaabbc12345 !@#$%^&*()";
        // ! searches the string  [ a or b or c ]
        // Pattern p=Pattern.compile("[abc]");
        
        //! exclude the stirng use like this( speicial character and space also)
        // Pattern p=Pattern.compile("[^ab]");

        //! to print all string from a-z use like this
        // Pattern p=Pattern.compile("[a-z]");

        //! to print all string from A-Z use like this
        // Pattern p=Pattern.compile("[A-Z]");

        //! to print all string from a-zA-Z use like this
        // Pattern p=Pattern.compile("[a-zA-Z]");

        //! to print all string from 0-9 use like this
        // Pattern p=Pattern.compile("[0-9]");

        //! to print all string from a-zA-Z0-9 use like this
        // Pattern p=Pattern.compile("[a-zA-Z0-9]");

        //! to print all string from special charcter which include spaces use like this
        // Pattern p=Pattern.compile("[^a-zA-Z0-9]");

        // !the first chaaracter must start with a-zA-Z
        Pattern p=Pattern.compile("^[a-zA-Z]");

        Matcher m=p.matcher(sentence);
        while(m.find()){
            System.out.println(m.group()+" starts at "+ m.start());

        }
    }
}
