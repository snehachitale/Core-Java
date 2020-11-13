public class Date{
	
	private int day;
	private int month;
	private int year;
	
	public Date(){
		this.day = 26;
		this.month = 1;
		this.year = 1999;
	}
	
	public Date(int day, int month, int year){
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay(){
		return this.day;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	public int getMonth(){
		return this.month;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public static void swap(Date d1, Date d2){
		Date temp = d1;
		d1 = d2;
		d2 = temp;	
		System.out.println("After swapping:");
		d1.print();
		d2.print();
	}
	
	public void print(){
		System.out.println("Date = " +day+ "/" + month + "/" + year);
	}
	
	public static void main(String[] args){
		Date d1 = new Date();
		d1.print();
		Date d2 = new Date(27,8,1998);
		d2.print();
		Date.swap(d1,d2);
				
	}
}
