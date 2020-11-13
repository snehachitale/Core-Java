class Employee
{
	private int empid;
	private String emp_name;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(int empid, String emp_name, double Salary) {
		this.empid = empid;
		this.emp_name = emp_name;
		this.salary = salary;
	}
	public double getSalary(){
		return this.salary;
	}
	
}

class Manager extends Employee
{
	private double incentive;
	
	public Manager(int empid, String emp_name, double salary, double incentive)
	{
		super(empid, emp_name, salary);
		this.incentive = incentive;
	}
	public double getSalary()
	{
		return super.getSalary() + this.incentive;
	}
	
}

class Labour extends Employee
{
	private double overtime;
	
	public Labour(int empid, String emp_name, double salary, double overtime)
	{
		super(empid, emp_name, salary);
		this.overtime = overtime;
	}
	public double getSalary()
	{
		return super.getSalary() + this.overtime;
	}
	
}

public class EmployeeTest
{
	public static double getTotalSalary(Employee e[]){
		double totalsal = 0.0;
		for(int i =0; i<e.length; i++)
		{
			totalsal += e[i].getSalary();
		}
		return totalsal;
	}
	
	public static void main(String[] args){
		Employee e[] = new Employee[2];
		
		e[0] = new Manager(1, "ABC", 50000, 5000);
		e[1] = new Labour(2, "EFG", 10000, 2000);
		
		System.out.println("Total salry of all employees = " + getTotalSalary(e));
		
	}
}