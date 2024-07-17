package tamilnadu.salem;
import tamilnadu.erode.Branch_Office;
public class  B_Branch_Office extends Branch_Office{
    public static void main(String[] args) {
        B_Branch_Office objoffice=new B_Branch_Office();
        objoffice.celebrate_local_function();//child
        objoffice.recruit();//office method-->parent 
          
    }
    
}
