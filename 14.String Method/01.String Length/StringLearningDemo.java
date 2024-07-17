public class StringLearningDemo
{
    public static void main(String[] args)
    {
        String s1=new String("Muthu");//5
        String s3=" ";
        String s4="";
        System.out.println(s1.length());
        System.out.println(s3.isBlank());//this will return true if the string has whitespace and "" empty
        System.out.println(s4.isEmpty());//if the length is 0 it will return true else fasle
      
    }
}