class A {
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	boolean g;
	char h;
	String i;
	//fields,instance variable,global variable,non-static variable
	public A() {
		System.out.println("hi");
	}
}
public class Main {

	public static void main(String[] args) {
		
		A obj = new A();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
		System.out.println(obj.f);
		System.out.println(obj.g);
		System.out.println(obj.h);
		System.out.println(obj.i);	
	}
}
