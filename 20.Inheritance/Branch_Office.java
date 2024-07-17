package tamilnadu.erode;
import tamilnadu.chennai.Office;
public class Branch_Office extends Office {
  int salary = 20000;
  public static void main(String[] args) {
    Branch_Office objBranch_Office = new Branch_Office();
    objBranch_Office.celebrate_local_function();
    // sub class cannot access package private
    // objBranch_Office.get_travel_allowance();
    // objBranch_Office.do_business_plans();//it is protected
    objBranch_Office.work();
    objBranch_Office.recruit();
    objBranch_Office.wtf();
    System.out.println(objBranch_Office.salary);
    // Office objBranch_Office2=new Office();
    // System.out.println(objBranch_Office2.salary);
    // System.out.println(super.salary);//error
  }

  public void celebrate_local_function() {
    System.out.println(super.salary);//super refers to a specific instance's superclass
    System.out.println("Celebrating");
  }

}
