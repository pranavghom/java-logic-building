package Chapter03OOP.Problem9;

public class Product {
	
	String productName;
	double price;
	int quantity;
	
	Product(){
		
	}
	Product(String productName){
		this.productName = productName;
		
	}
	Product(String productName, double price, int quantity){
		this.productName= productName;
		this.price=price;
		this.quantity= quantity;
	
	}

	void display(){
			System.out.println("PrductName="+productName);
			System.out.println("price="+price);
			System.out.println("quantity="+quantity);
		
	}

}
