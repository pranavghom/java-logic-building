package Chapter03OOP.problem11;

public class BankAccount {
	
	
private int accountNunmber;
private String accountHolder;
private int balance;



public int getAccountNunmber() {
	return accountNunmber;
}
public void setAccountNunmber(int accountNunmber) {
	this.accountNunmber = accountNunmber;
}
public String getAccountHolder() {
	return accountHolder;
}
public void setAccountHolder(String accountHolder) {
	this.accountHolder = accountHolder;
}
public int getBalance() {
	return balance;
}


public void display() {
	System.out.println("Name = "+accountHolder);
	System.out.println(" Acc Num = "+accountNunmber);
	System.out.println("Blance = "+balance);
	
	
}
  void depositeMoney(int depositeAmount) {
	  if(depositeAmount >0 ) {
	balance +=  depositeAmount;
	System.out.println("Deposit money sucsessfully");
	  }
	  else {
	  System.out.println("Enter The Valid Amount");
	  }
	 
  }
  
  void withdraw(int withdrawAmount) {
	  if(withdrawAmount<=balance && withdrawAmount>0) {
		  balance = balance-withdrawAmount;
		  System.out.println("Withdraw money sucsessfully");
	  }
	  else {
		  System.out.println("Enter The Valid Amount");
	  }
	  
  }
}
