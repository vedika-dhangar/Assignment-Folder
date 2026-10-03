package except;


import java.util.Scanner;

public class Account {
	protected int accountNumber;
	protected double balance;
	
	public Account(int accountNumber, double balance) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void withDraw(double amount)throws InsufficientBalanceException {
		if(balance<amount) throw new 
		InsufficientBalanceException("Withdrawal denied due to insufficient balance");
		{
			System.out.println("Withdrawal successful");
		}	
		
		balance = balance - amount;
	}
	
}
class SavingsAccount extends Account{

	public SavingsAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
		
	}

	@Override
	public void withDraw(double amount) throws InsufficientBalanceException {
		double remainingBalance  = balance-amount;

		
		if(remainingBalance < 500) { 
			throw new InsufficientBalanceException("Withdrawal denied due to insufficient balance");
			} 
			
	
		balance = remainingBalance;
		
	}
	
	
	
	
}

class CurrentAccount extends Account{
	
	public CurrentAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
		
	}

	@Override
	public void withDraw(double amount)throws InsufficientBalanceException {
		double remainingBalance  = balance-amount;
		
		if(remainingBalance < 0) {throw new InsufficientBalanceException("Withdrawal denied due to insufficient balance"); 
	  }
		
			balance = remainingBalance;
		
	}
	
	

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int accountNumber = sc.nextInt();
	double balance = sc.nextDouble();
	String accountType = sc.next();
	double withdrawAmount = sc.nextDouble();
	Account account;
	
	
	
			
			if(accountType.equalsIgnoreCase("Savings")) {
				account = new SavingsAccount(accountNumber,balance);
			}
			else {
			      account = new CurrentAccount(accountNumber,balance);
			}
			try{
			

		     	account.withDraw(withdrawAmount);
		     	System.out.println("Withdrawal Successful");
		
			System.out.println(account.accountNumber);
			//account.withDraw(withdrawAmount);
			System.out.println("Remaining balance :"+account.balance);
			
		
	}catch(InsufficientBalanceException e) 
	  {
		System.out.println(e.getMessage());
    	// e.printStackTrace();
			
		
	}
	
	
	
	sc.close();
  }
  
}












