class StringLearningDemo{
    public static void main(String[] args){
        String s="Hi";
        s=s+5;//new object is created
        System.out.println(s);
        for(int i=0;i<10;i++){
            s=s+i;
            System.out.println(s);
        }
        StringBuffer sb=new StringBuffer("Programmer");
        // sb.append(true);
        // we can add anything to te sb like int,float,double,boolean,char,long,object,string,stringbuffer,chararray.
        sb.append(50);
        //? this method is not in string but in string buffer
        System.out.println(sb);

        sb.deleteCharAt(2);  //this method is not in string but in string buffer
        System.out.println(sb);

        sb.reverse();  //this method is not in string but in string buffer
        System.out.println(sb);

        // ? end is (n-1)
        sb.replace(0,10,"Java"); 
        System.out.println(sb);
    }
}