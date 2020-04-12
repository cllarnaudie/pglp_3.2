package main.java;

public class Manager extends EmployeSalaire {
	private final int nombrepersonne;

	public Manager(int nombrepersonne, int anciennete) {
		super(anciennete); 
		if (nombrepersonne < 0) {
			nombrepersonne = 0;
			System.out.println(" nombrepersonne négative - la valeur prise en compte est zéro");
		}
		this.nombrepersonne = nombrepersonne;
	}

	public double calculSalaire() {
		return calculSalaireBase() + 100 * nombrepersonne;
	}
}
