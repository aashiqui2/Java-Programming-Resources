
 class Shop {
	 //field // non-static // Global variable
	String brand;
	int price,discount;
	Shop(){
		System.out.println("No-arguments construtor");
	}
	Shop(String brand,int price){
		// brand=brand;
		// price=price;
		// System.out.println(brand);
		// System.out.println(price);

		this.price=price;
		this.brand=brand;
	}
	Shop(String brand,int price,int discount){	
		// brand=a;
		// price=b;
		// discount=c;

        // System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);

		this.brand=brand;
		this.price=price;
		this.discount=discount;	
	}
	void buy() {
		System.out.println(brand+" "+price+" "+discount);
	}
	 
	public static void main(String[] args) {
		Shop prod1=new Shop();

		// Shop prod2=new Shop();
		// prod2.brand="ABC";
	    // prod2.price=100;

		Shop prod2=new Shop("RICE",10);

		Shop prod3=new Shop("ABC",100,10);


		Shop prod4=new Shop("PQR",150,15);
//		prod2.brand="PQR";
//		prod2.price=150;
//		prod2.discount=15;

		Shop prod5=new Shop("XYZ",200,20);
//		prod3.brand="XYZ";
//		prod3.price=200;
//		prod3.discount=20;

		System.out.println(prod2.brand);
		System.out.println(prod2.price);
		System.out.println(prod3.discount);
		System.out.println(prod4.brand);
		prod3.buy();
	
		
	}

}
