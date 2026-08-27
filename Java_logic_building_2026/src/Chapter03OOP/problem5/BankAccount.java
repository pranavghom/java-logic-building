package Chapter03OOP.problem5;

public class BankAccount {
	String accountHolder;
	int accountNumber;
	int balance;
	
 void setData(String accountHolder,int accountNumber, int balance) {
	 this.accountHolder= accountHolder;
	 this.accountNumber= accountNumber;
	 this.balance= balance;
	 
 }
 void deposit(int deposit) {
	 if(deposit>0) {
		 balance = balance+deposit;
	
	 }else {
		 System.out.println("Enter Valid Amount");
	 }
	 
	 
 }
 void withdraw(int withdrow){
	 if(withdrow <=0) {
		 System.out.println("Enter valid Amount");
		
	 }
	 
	 else if(withdrow <= balance) {
		balance = balance- withdrow;
	 }
	 else {
		 System.out.println("Insufficent balance");
	 }
	 
 }
 void display() {
	 System.out.println("Account Holder :"+accountHolder);
	 System.out.println("Account Number :"+accountNumber);
	 System.out.println("Balance :"+balance+"rs");
 }
	
}
