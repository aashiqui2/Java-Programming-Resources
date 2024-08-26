//! Print Keypad combination
public class RecursionDemo8 {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String str,int idx,String combination)
    {
        if(idx==str.length())
        {
            System.out.println(combination);
            return;
        }
        char currchar=str.charAt(idx);
        String mapping=keypad[currchar-'0'];
        for(int i=0;i<mapping.length();i++)
        {
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="4";
        printComb(str, 0, "");
    }
}
// Time Complexity :O(4^n)
