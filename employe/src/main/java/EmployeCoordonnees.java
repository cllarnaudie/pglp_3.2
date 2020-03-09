package main.java;

public class EmployeCoordonnees {

	private final String nom;
	private final String adresse;

	public EmployeCoordonnees(String nom, String adresse) {
		if (nom.equals("")  ) {
			nom = "inconnue";
			
			}
		if (adresse.equals ("") ) {
			adresse = "inconnue";
			}
		
		this.nom = nom;
		this.adresse = adresse; 

	}


	public void afficheCoordonnees() {
		System.out.println(nom + "  " + adresse + " \n");
	}

}
