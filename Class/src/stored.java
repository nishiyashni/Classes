
public class stored {
	  // instance fields
	  String productType;
	  
	  // constructor method
	  public stored(String product) {
	    productType = product;
	  }
	  
	  // main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stored lemonadeStand = new stored("lemonade");
	    System.out.println(lemonadeStand.productType);

	}

}
