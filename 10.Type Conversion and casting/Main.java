class Main {
    public static void main(String[] args) {
        // byte a=127;
        // int b=a;
        // a=(int)b;
        // System.out.println(a);
        // System.out.println(b);

        // byte a=127;
        // int b=257;
        // a=(byte)b;
        // System.out.println(a);

        // float f=5.6f;
        // int a=(int)f;
        // System.out.println(a);

        // int a=(int)5.6;
        // System.out.println(a);

        // int a=256;
        // long b=a;
        // System.out.println(b);

        // long a=256;
        // int b=(int)a;
        // System.out.println(b);

        // float a=3.14f;
        // double b=a;
        // System.out.println(b);

        // double a=3.14d;
        // float b=(float)a;
        // System.out.println(b);

        // char c='c';
        // int a=c;
        // System.out.println(a);

        // int a=99;
        // char b=(char)a;
        // System.out.println(b);

        // ? Type Promoting
        // byte a=10;
        // byte b=30;

        // // byte result=a*b;
        // int result=a*b;
        // System.out.println(result);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        // System.out.println(result);
        // System.out.println(f*b);
        // System.out.println(i/c);
        // System.out.println(d*s);

        double result = (f * b) + (i / c) - (d * s);

    }
}