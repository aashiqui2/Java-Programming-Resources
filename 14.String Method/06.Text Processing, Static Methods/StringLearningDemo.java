public class StringLearningDemo {
    public static void main(String[] args) {
        String s = new String("Programming Language Tamil Nadu");
        System.out.println(s.matches("\\w{11} \\w{8}"));
        System.out.println(s.replace("P", "s"));
        System.out.println(s.replaceAll("\\s", "@"));
        System.out.println(s.replaceFirst("\\s", "-"));
        String[] s2 = s.split(" ");
        for (String str : s2) {
            System.out.println(str);
        }
        System.out.println(s2.length);
        String[] s3 = s.split(" ", 2);
        for (String str : s3) {
            System.out.println(str);
        }

        // ! static method
        //? String.join("-","18","01","2000");
        System.out.println(String.join("-","18","01","2000"));
        System.out.println(String.join(" - ", "This", "course", "is", "awesome"));
        System.out.println(String.join(" - ", new String[]{"This","course","is","awesome"}));
        

        // ! to convert any datatypes to string we can use valueoF method
        String a=String.valueOf(5);
        System.out.println(a);
        System.out.println(a+4);
        System.out.println( s.contains("Tamil"));
        System.out.println( s.contains("English"));
       

    }
}