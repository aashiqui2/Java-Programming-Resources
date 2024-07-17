public class StringLearningDemo {
    public static void main(String[] args) {
        String s=" Programming World ";
        System.out.println(s);
        System.out.println(s.toLowerCase());

        //? String are Immutable
        System.out.println(s);
        System.out.println(s.length());
        //! This is for UNICODE
        System.out.println(s.strip());
        String s2=s.strip();
        System.out.println(s2.length());
        //  all leading and trailing space removed
        //! This is for ASCII,ISO CONTROL CHARACTER
        System.out.println(s.trim());
        //? this to remove spaces from starting
        System.out.println(s.stripLeading());
        //? this to remove spaces from ending
        System.out.println(s.stripTrailing());
        System.out.println(s.repeat(3));
        System.out.println(s.indent(20));
        System.out.println(s.toCharArray());// Programming World
        char s3[]=s.toCharArray();
        System.out.println(s3);
    }
}
