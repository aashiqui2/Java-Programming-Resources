//! check if the arrya is sorted(Strictly increasing)
public class RecursionDemo3 {
    public static boolean isSorted(int arr[],int idx)
    {
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;
        }
        return isSorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        if(isSorted(arr, 0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
// Time Complexity O(n)
