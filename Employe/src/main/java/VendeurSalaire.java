
package main.java;

public class VendeurSalaire extends EmployeSalaire {
	public final double commision;

	public VendeurSalaire(double commision, int anciennete) {
		super(anciennete);
		if (commision < 0) {
			commision = 0;
			System.out.println("commision négative - la valeur prise en compte est zéro");
		}
		this.commision = commision;
	}

	public double calculSalaire() {
		return calculSalaireBase() + commision;
	}

}
