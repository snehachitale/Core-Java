class BankAccount
{
	private int number;
	private String name;
	protected double balance;
	
	public BankAccount(int number, String name, double balance)
	{
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
}

class CurrentAccount extends BankAccount{
	
	private double amount;
	
	public CurrentAccount(int number, String name, double balance, double amount)
	{
		super(number, name, balance);
		this.amount = amount;
	}
	
	public void withdraw(double amount)
	{
		if(this.balance > amount )
		{
			this.balance -= amount;
			System.out.println("Balance for Current account = " + getCBalance());

		}
		else{
			System.out.println("Low balance!");
		}
	}
	public double getCBalance()
	{
		return this.balance;
	}
	
	
}

class SavingsAccount extends BankAccount{
	
	private double amount;
	public SavingsAccount(int number, String name, double balance, double amount)
	{
		super(number, name, balance);
		this.amount = amount;
	}
	
	public void deposite(double amount)
	{
		this.balance += amount;
		System.out.println("Balance for Current account = " + getSBalance());

	}
	public double getSBalance()
	{
		return this.balance;
	}
		
}

public class Bank
{
	public static void main(String[] args)
	{
		BankAccount b[] = new BankAccount[2];
				
		b[0] = new CurrentAccount(1, "ABC", 10000, 1000);
		b[1] = new SavingsAccount(2, "EFG", 5000, 500);
			
	}
	 
}