package tamilnadu.chennai;
public class Office// javac -d . Office.java(to compile)
{// java tamilnadu.chennai.Office(to run)
  public  int salary = 25000;
  public Office() {
    System.out.println("no-arg constructor in office");
  }
  public static void main(String args[]) {
    Office objoffice = new Office();
    objoffice.work();
    System.out.println(objoffice.salary);
  }
  public void work() {
    System.out.println("Working in office");
  }
  public void wtf() {
    System.out.println("Work from Home");
  }
  public void recruit() {
    System.out.println("Recruitment");
  }
  void get_travel_allowance()// package-priavate cannot be accessed outside the package
  {
    System.out.println("Rs.100 TA");
  }
  protected void do_business_plans() {
    System.out.println("Business plans");
  }

}