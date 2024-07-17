
class StaticBlock{

	public StaticBlock()
	{
		System.out.println("Hi i am from constructor");
	}
	static
	{
		System.out.println("I am from static 2 block");

	}
	static
	{
		System.out.println("I am from static 1  block");

	}
	{
		System.out.println("I am from non static block 1");
	}
	{
		System.out.println("I am from non static block 2");
	}

	public static void main(String args[])
	{
		// StaticBlock sb=new StaticBlock();
		System.out.println("Hello from main(static) method");
		StaticBlock sb=new StaticBlock();
		StaticBlock sb1=new StaticBlock();
		// sb.test();
		// StaticBlock.test();
		System.out.println(2<<1);
		System.out.println(2>>1);
		System.out.println(~6);
	}
	public static void test(){
		System.out.println("i am static method test");
	}
}
