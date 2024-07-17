public class ArrayLearningDemo {
    public static void main(String[] args) {
        int[] marks={100,80,90};
        System.out.println(marks);
        //[I@2f92e0f4 -->Hash Code,I for -->integer,
        //hexadecimal value -->0-15
        //0 1 2 3 4 5  6 7 8 9 A B C D E F
        System.out.println(marks.length);

        char [] name={'a','r','u','n'};
                     //0   1   2   3
        System.out.println(name.length);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        boolean[] result={true,false,true,false};
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
            
        }
        String[] str={"rajesh","aravind","vijay"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
}
