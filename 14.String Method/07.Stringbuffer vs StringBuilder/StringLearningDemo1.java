public class StringLearningDemo1 {
    public static void main(String[] args) {
        //! String is Immutable
        StringLearningDemo1 sd=new StringLearningDemo1();
        String[] names={"arun","harish","deva"};
        sd.joinWords(names);
    }

    private void joinWords(String[] names) {
        String sentence="";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //? unidirectional loop
        for(String name:names){
            sentence=sentence+name+" ";
            System.out.println(sentence);
        }
       
    }
}
