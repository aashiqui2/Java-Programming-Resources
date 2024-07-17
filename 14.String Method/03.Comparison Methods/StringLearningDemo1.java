class StringLearningDemo1{
    public static void main(String[] args){

        String s1=new String("Java");
        String s2=new String("Java");
        String s3=new String(" Java"); //we have a space at first character
        String s4=new String("java");

        Boolean result=s1.equals(s2);
        System.out.println(result);
        result=s1.equals(s3);
        System.out.println(result);

        //to ignore the case sensitive
        result=s1.equalsIgnoreCase(s4);
        System.out.println(result);
    }
}