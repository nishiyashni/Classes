
public class Storeb {
	  // instance fields
	  String productType;
	  int inventoryCount;
	  double inventoryPrice;
	  
	  // constructor method
	  public Storeb(String product, int count, double price) {
	    productType = product;
	    inventoryCount = count;
	    inventoryPrice = price;
	  }
	  
	  // main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Storeb cookieShop = new Storeb("cookies", 12, 3.75);
	    System.out.println(cookieShop.productType);
	    System.out.println(cookieShop.inventoryCount);
	    System.out.println(cookieShop.inventoryPrice);

	}

}
