public class RecursionDemo1 {
    public static void towerOfHonai(int n,String src,String helper,String dest)
    {
        if(n==1)
        {
            System.out.println("transfer disk "+ n+ " from "+ src+" to "+dest);
            return;
        }

        towerOfHonai(n-1,src,dest,helper);//use source as a helper and helper a source
        System.out.println("transfer disk "+ n+ " from "+ src+" to "+dest);
        towerOfHonai(n-1, helper, src, dest);
    }
    public static void printReverse(String s,int idx)
    {
        if(idx==0)
        {
            System.out.print(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        printReverse(s, idx-1);
    }
    public static void main(String[] args) {
        //! Tower of Hanoi
        //! Rules
        /* 1.Only one disk transfered in 1 step
          2. smaller disk are kept at on top of large disks */
        //   int n=3;
        //   towerOfHonai(n," S", "H", "D");

        String s="ABCD";
        printReverse(s, s.length()-1);
        //Time Complexity:
        // O(n) -n is length of the string

    }
}
