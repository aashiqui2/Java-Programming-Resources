package Exception;

public class ArrayIndex {
  public static void main(String[] args) {
	  int a[]= {1,2,3,4,5};
	  int len=a.length;
	  
	  try {
		  
		  for(int i=0;i<=len;i++) {
			  System.out.println(a[i]);
		  }
	  }
	  catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println(e);
	  }
	  finally {
		  System.out.println("Program Ends");
	  }
  }
}
