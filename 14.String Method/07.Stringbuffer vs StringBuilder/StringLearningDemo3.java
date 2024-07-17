public class StringLearningDemo3 {
    public static void main(String[] args) {
        //! String is Immutable
        StringLearningDemo3 bui=new StringLearningDemo3();
        String[] names={"arun","harish","deva"};
        bui.joinWords(names);
    }

    private void joinWords(String[] names) {
        String sentence="";
        // ! StringBuilder is mutable
        StringBuilder bui=new StringBuilder("");
        StringBuilder bui2=new StringBuilder("raja");
        bui2.insert(1, "a");
        System.out.println(bui2);
        bui2.replace(0, 2, "ka");
        System.out.println(bui2);
        System.out.println(bui2.reverse());

        //? unidirectional loop
        for(String name:names){
            bui.append(name);
            System.out.println("String Buffer "+ bui.hashCode());
            sentence=sentence+name+" ";
            System.out.println("String class "+ sentence.hashCode());
        }
        System.out.println(sentence);
        System.out.println(bui);
       
    }
}
