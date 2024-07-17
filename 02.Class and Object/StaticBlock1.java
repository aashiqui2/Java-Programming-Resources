class Mobile{

	// instance variable
	String brand;
	int price;
	static String name;

	public void show(){
		System.out.println(brand+" "+price+" "+name);
	}
	public static void show1(Mobile ob1){
		// System.out.println(brand+" "+price+" "+name);
		//!error -non-static variable brand cannot be referenced from a static context

		System.out.println(ob1.brand+" "+ob1.price+" "+name);

	}
}

 class StaticBlock1{
	public static void main(String[] args){
		Mobile ob1=new Mobile();
		ob1.brand="Apple";
		ob1.price=1500;
		ob1.name="smartphone";

		Mobile ob2=new Mobile();
		ob2.brand="samsung";
		ob2.price=1200;
		ob2.name="smartphone";

		// ob1.name="phone";
		Mobile.name="Phone";

		ob1.show();
		ob2.show();
		Mobile.show1(ob1);
	}

}