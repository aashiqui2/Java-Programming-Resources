class Demo{
    public static void main(String[] args)
    {
    //    literals
    int num=0b101;//binary format
    num=0x7E;
    // num=10_00_00_000;
    System.out.println(num);
    float num1=3.14f;
    //the Java compiler will treat it as a double by default
    System.out.println(num1);

    double num2=3.14;
    System.out.println(num2);

    // Boolean a=1;//error
    Boolean a=true;
    System.out.println(a);

    char c='e';
    System.out.println(c);
    c++;
    System.out.println(c);
    }
}