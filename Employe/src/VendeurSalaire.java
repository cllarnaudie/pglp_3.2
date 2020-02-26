
public class VendeurSalaire extends EmployeSalaire{
	public final double commision; 
	
	public VendeurSalaire() {
		this.commision = 0.0; 
	}
	
	
	public double calculSalaire() {
		return calculSalaireBase()+ commision; 
	}

}
