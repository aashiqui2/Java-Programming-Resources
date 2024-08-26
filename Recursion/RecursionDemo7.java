//! Print  all the unique subsequence of a string

import java.util.HashSet;

public class RecursionDemo7 {
    public static void subsequence(String str, int idx, String newString,HashSet<String> set) {
        if (idx == str.length()) {
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currchar = str.charAt(idx);
        // to be
        subsequence(str, idx + 1, newString + currchar,set);
        // not to be
        subsequence(str, idx + 1, newString,set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set=new HashSet<>();
        subsequence(str, 0, "",set);

    }
}
