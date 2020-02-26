package main.java; 



public class Manager extends EmployeSalaire{
	private final int nombrepersonne; 
	
	public Manager () {
		this.nombrepersonne = 100; 
	}
	
	public double calculSalaire () {
		return calculSalaireBase()+100*nombrepersonne; 
	}

}
