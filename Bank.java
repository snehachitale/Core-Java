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
		}
		else{
			System.out.println("Low balance!");
		}
	}
	public double getBalance()
	{
		return this.balance;
	}
	
	public void print(){
		System.out.println("Balance for Current account = " + getBalance());
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
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void print(){
		System.out.println("Balance for Current account = " + getBalance());
	}
		
}

public class Bank
{
	public static void main(String[] args)
	{
		BankAccount b[] = new BankAccount[2];
		CurrentAccount c = new CurrentAccount();
		SavingsAccount s = new SavingsAccount();
		
		b[0] = new CurrentAccount(1, "ABC", 10000, 1000);
		b[1] = new SavingsAccount(2, "EFG", 5000, 500);
		
		c.print();
		s.print();

		
	}
	 
}