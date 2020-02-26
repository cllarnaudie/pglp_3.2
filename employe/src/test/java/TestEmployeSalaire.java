package test.java; 
//import static org.junit.Assert.*;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import main.java.EmployeSalaire;

public class TestEmployeSalaire {

	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	/*
	 * a completer
	 */
	
	@Test
	public void testcalculSalaireBase () {
		
		System.out.println ("testcalculSalaireBase");
		System.out.println ("");
		EmployeSalaire sb = new EmployeSalaire ();
		int res = 0; 
	//	assertEquals(res, cpt.getSolde()); 
		
		//System.out.println ("le solde est negatif pour le compte bancaire de  " + cpt.getSolde());
		
	}

	@Test
	public void testcalculSalaireBaseAgeInferieurVingt () {
		
	    System.out.println ("testcalculSalaireBaseAgeInferieurVingt");
		System.out.println ("");
		EmployeSalaire sb2 = new EmployeSalaire ();
	
	}
	
	@Test
	public void testcalculSalaireBaseAgeSuperieurCinquanteSix () {
		
	    System.out.println ("testcalculSalaireBaseAgeSuperieurCinquanteSix");
		System.out.println ("");
		EmployeSalaire sb4 = new EmployeSalaire ();
		
	}
	
	
	
	@Test
	public void testcalculSalaireBaseAgeValeurNegative () {
		
	    System.out.println ("testcalculSalaireBaseAgeValeurNegative");
		System.out.println ("");
		EmployeSalaire sb5 = new EmployeSalaire ();
		
	}
	
}
