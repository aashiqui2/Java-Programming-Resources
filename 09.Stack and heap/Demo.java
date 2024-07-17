class Calculator{
    int num=20;//instance variable// fields
    public int  add(int a,int b){
        // System.out.println(num);
        return a+b;
    }
}
class Demo{
    public static void main(String[] args)
    {
        int data=10;//local variable
       Calculator obj=new Calculator();
       Calculator obj1=new Calculator();
       int result=obj.add(2,4);
    //    System.out.println(result);
        obj.num=12;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}