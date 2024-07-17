import java.util.regex.*;

public class RegexLearningDemo {
    public static void main(String[] args) {
        String sentence="Thuppaarkkuth Thuppaaya Thuppaakkith Thuppaarkkuth Thuppaaya Thooum Mazhai";

        // Pattern p=new Pattern();
        //? we cannot do this because it calls the default constrictor in the parent class but in this case it is    `private`

        //? To do that we have
        Pattern p=Pattern.compile("Thuppaa");
        //! if the matcher doesn't find anything it will return exception
        Matcher m=p.matcher(sentence);
        int count=0;
        while(m.find())
        {
            count++;
            System.out.println(m.group());
            System.out.println(m.group() +" Starts "+ m.start());
            System.out.println(m.group() +" Starts "+ m.start()+ " end at "+m.end());
        }
        // System.out.println(m.group());
        // System.out.println(m.group() +" Starts "+ m.start());
        // System.out.println(m.group() +" Starts "+ m.start()+ " end at"+m.end());
        System.out.println(count);

    }


}
