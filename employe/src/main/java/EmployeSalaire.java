package main.java; 
public class EmployeSalaire {
	private final int age; 
	
	public EmployeSalaire() {
		this.age = 20; 
	}
	
	public double calculSalaireBase () {
		return 1500 + 20*age; 
	}

}
