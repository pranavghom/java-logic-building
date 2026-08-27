package Chapter03OOP.problem5;



public class Main {

	public static void main(String[] args) {
	BankAccount ba= new BankAccount();
	BankAccount ba1= new BankAccount();
	BankAccount ba2= new BankAccount();
	
	ba.setData("Pranav", 10101010, 10);
	ba.display();
	ba.deposit(8);
	
	ba.withdraw(10);
	ba.display();
	
	
	ba1.setData("pratik", 2020202020, 11);
	ba1.display();
	ba1.deposit(40);
	
	ba1.withdraw(17);
	ba1.display();
	
	ba2.setData("jayesh", 30303030, 112);
	ba2.display();
	ba2.deposit(201);
	
	ba2.withdraw(120);
	ba2.display();
		
	}

}
