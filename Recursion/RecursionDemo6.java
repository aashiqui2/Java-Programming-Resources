//! Print  all the subsequence of a string
public class RecursionDemo6 {
    public static void subsequence(String str,int idx,String newString)
    {
        if(idx==str.length())
        {
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        //to be
        subsequence(str, idx+1, newString+currchar);
        //not to be
        subsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        subsequence(str, 0, "");
        
    }
}
//Time complexity: O(2^n)
