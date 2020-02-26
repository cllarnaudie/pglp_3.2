package test.java; 
import static org.junit.Assert.*;
import org.junit.Test;

//import static org.junit.Assert.assertEquals;
import main.java.EmployeCoordonnees;



public class TestEmployeCoordonnees {
/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
*/
/*
 * a completer
 */
	
	@Test
	public void testafficheCoordonnees () {
	
		System.out.println ("testafficheCoordonnees");
		System.out.println ("");
		EmployeCoordonnees coord = new EmployeCoordonnees ();
		//int res = 0; 
		//assertEquals(res, cpt.getSolde()); 
		
		//System.out.println ("le solde est negatif pour le compte bancaire de  " + cpt.getSolde());
		
	}
	
	@Test
	public void testafficheCoordonneesVide () {
	
		System.out.println ("testafficheCoordonneesVide");
		System.out.println ("");
		EmployeCoordonnees coord2 = new EmployeCoordonnees ();
	
		
	}
	
	@Test
	public void testafficheCoordonneesManqueNom () {
	
		System.out.println ("testafficheCoordonneesManqueNom");
		System.out.println ("");
		EmployeCoordonnees coord3 = new EmployeCoordonnees ();
	
		
	}
	
	@Test
	public void testafficheCoordonneesManqueAdresse () {
	
		System.out.println ("testafficheCoordonneesManqueAdresse");
		System.out.println ("");
		EmployeCoordonnees coord4 = new EmployeCoordonnees ();
	
		
	}

}
