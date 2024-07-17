class StringLearningDemo3{
    public static void main(String[] args)
    {
        String s1=new String("java");
        String s2=new String("Java");
        Boolean result=s1.startsWith("j");
        System.out.println(result);
        result=s1.endsWith("java");
        System.out.println(result);


        // we can also search from the specified condition 
        String s3=new String("phpjava");
        result=s3.startsWith("java",3);
        System.out.println(result);     
            
    }
}