package Chapter03OOP.problem11;

public class Main {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		ba.setAccountHolder("Paranav Ghom");
		ba.setAccountNunmber(1010);
		
		ba.display();
		ba.depositeMoney(100);
		ba.display();

	}

}
