package tamilnadu.erode;
import tamilnadu.chennai.Office;

public class Branch_Office_2 extends Office {
    public static void main(String[] args) {
       Branch_Office_2 objBranch_Office_2=new Branch_Office_2();
       objBranch_Office_2.celebrate_local_function(); 
       objBranch_Office_2.work();
       objBranch_Office_2.recruit();
       objBranch_Office_2.wtf();
       System.out.println(objBranch_Office_2.salary);
    }
    public void celebrate_local_function(){
        System.out.println("Celebrating");
    }
    public void pongal(){
        System.out.println("Happy Pongal");
    }
    
}
