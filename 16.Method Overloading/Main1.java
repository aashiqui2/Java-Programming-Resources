class Calculator {
    public void add(int a, int b) {
        System.out.println("Addition of two integers: " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Addition of three integers: " + (a + b + c));
    }

    public void add(double a, double b) {
        System.out.println("Addition of two doubles: " + (a + b));
    }
    
    public void add(String a, String b) {
        System.out.println("Concatenation of two strings: " + (a + b));
    }
    public int sub(int a,int b){
        return a-b;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5, 3);
        calc.add(5, 3, 2);
        calc.add(2.5, 3.5);
        calc.add("Hello ", "world");
        int result=calc.sub(5,3);
        System.out.println(result);
    }
}
