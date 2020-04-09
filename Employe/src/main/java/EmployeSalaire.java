package main.java;

public class EmployeSalaire {
	private final int anciennete;
	
	private final int SALAIRE_BASE = 1500;

	public EmployeSalaire (int anciennete) {
		
		if (anciennete <0) {
			anciennete = 0;
			System.out.println (" anciennete négative - la valeur prise en compte est zéro");
		}
		this.anciennete = anciennete;
	}

	public double calculSalaireBase() {
		return SALAIRE_BASE + 20 * anciennete;
	}

	

}
