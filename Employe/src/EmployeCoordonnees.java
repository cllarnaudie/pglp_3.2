
public class EmployeCoordonnees {
	
	private final String nom; 
	private final String adresse; 
	
	public EmployeCoordonnees () {
		this.nom= "inconnu"; 
		this.adresse = "inconnu"; 
		
	}

    
	public void afficheCoordonnees () {
		System.out.println (nom + "" + adresse); 
	}

}
