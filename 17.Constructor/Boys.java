public class Boys {
	String name;//fields//global variable
	int amount;
	Boys(){
		System.out.println("Welcome to our Hostal");
	}

	static public void main(String[] attck) {
		// TODO Auto-generated method stub
		Boys boy=new Boys();
		boy.name="Raja";
		boy.amount=1000;//object specific value
		boy.gotoShop();
		Boys.provide_chocolate();
		//System.out.println(this.name);

	}
	 static void provide_chocolate() {
		 //Cannot use this in the static context
		// System.out.println(this.name);
		System.out.println("Distributed chocalte");
	}
	void gotoShop(){
		int amount=50;
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this.amount-amount);
		System.out.println(amount);
	}

	

}
