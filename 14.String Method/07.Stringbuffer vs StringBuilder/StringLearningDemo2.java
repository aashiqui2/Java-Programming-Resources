public class StringLearningDemo2 {
    public static void main(String[] args) {
        //! String is Immutable
        StringLearningDemo2 sd=new StringLearningDemo2();
        String[] names={"arun","harish","deva"};
        sd.joinWords(names);
    }

    private void joinWords(String[] names) {
        String sentence="";
        // ! stringBuffer is mutable
        StringBuffer sb=new StringBuffer("");
        StringBuffer sb2=new StringBuffer("raja");
        sb2.insert(1, "a");
        System.out.println(sb2);
        sb2.replace(0, 2, "ka");
        System.out.println(sb2);
        System.out.println(sb2.reverse());


        //? unidirectional loop
        for(String name:names){
            sb.append(name);
            System.out.println("String Buffer "+ sb.hashCode());
            sentence=sentence+name+" ";
            System.out.println("String class "+ sentence.hashCode());
        }
        System.out.println(sentence);
        System.out.println(sb);
       
    }
}
