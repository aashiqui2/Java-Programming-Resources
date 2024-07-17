import java.util.StringTokenizer;

public class RegexLearningDemo6 {
    public static void main(String[] args) {
        // String sentence="Foolish Programmer";
        // String sentence="www.foolishprogrammer.com";
        String sentence="https://www.foolishprogrammer.com";

        // StringTokenizer st=new StringTokenizer("Foolish programmer");
        // StringTokenizer st=new StringTokenizer("www.foolishprogrammer.com",".");
        // StringTokenizer st=new StringTokenizer("29-03-2024","-",true);

        // ? if we want to split the website we need to pass multiple delimeter and need to create a object for stringTokenizer
        // StringTokenizer st=new StringTokenizer("29-03-2024","-",true);


        // System.out.println("Count of Tokens "+ st.countTokens());
        // ? return boolean value
        // while(st.hasMoreTokens()){
        //     System.out.println(st.nextToken());
        //     // ? delimeter  default -space
        // }


        // ! using split method
        // String[] str=sentence.split("\\.");
        String[] str=sentence.split("\\:|\\\\|\\.");
        for(String s:str){
            System.out.println(s);
        }
    }
    
}
