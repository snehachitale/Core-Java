abstract class Persistence {

	public abstract void persist();
	
}

class FilePersistence extends Persistence {
	
	public void persist() 
	{
		System.out.println("Data persisted into file.");
	}
}

class DatabasePersistence extends Persistence {
	
	public void persist() 
	{
		System.out.println("Data persisted into database.");
	}
}

public class Client {

	public static void main(String[] args) {
		
		Persistence p1, p2;
		
		p1 = new FilePersistence();
		p1.persist();
		
		p2 = new DatabasePersistence();
		p2.persist();
	}
}