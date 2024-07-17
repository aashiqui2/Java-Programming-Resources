class StringLearningDemo4{
    public static void main(String[] args){
        String s1=new String("JAVA");
        String s2=new String("JAVA");
        StringBuffer s4=new StringBuffer("JAVA");
        
        boolean result=s1.contentEquals(s4);
        //?true if this String represents the same sequence of characters as the specified StringBuffer, false otherwise
        System.out.println(result);

        //! String Buffer is mutable class
        StringBuffer str=new StringBuffer("Hello");
        str.reverse();//olleH
        str.append(" ");
        str.append("World");
        str.append("!");
        System.out.println(str);
    }
}