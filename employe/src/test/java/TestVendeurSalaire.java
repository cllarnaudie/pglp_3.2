package test.java;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.EmployeCoordonnees;
//import static org.junit.Assert.assertEquals;
import main.java.VendeurSalaire;


public class TestVendeurSalaire {

	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	/*
	 * a completer
	 */
	

	@Test
	public void testcalculSalaire () {
	
		System.out.println ("testcalculSalaire");
		System.out.println ("");
		VendeurSalaire vs = new VendeurSalaire ();
		//int res = 0; 
		//assertEquals(res, cpt.getSolde()); 
		
		//System.out.println ("le solde est negatif pour le compte bancaire de  " + cpt.getSolde());
		
	}
	
	@Test
	public void testcalculSalaireNegative () {
	
		System.out.println ("testcalculSalaireNegative");
		System.out.println ("");
		VendeurSalaire vs2 = new VendeurSalaire ();
		//int res = 0; 
		//assertEquals(res, cpt.getSolde()); 
		
		//System.out.println ("le solde est negatif pour le compte bancaire de  " + cpt.getSolde());
		
	}

	
	@Test
	public void testcalculSalaireCommisionNegative () {
	
		System.out.println ("testcalculSalaireCommisionNegative");
		System.out.println ("");
		VendeurSalaire vs3 = new VendeurSalaire ();
		//int res = 0; 
		//assertEquals(res, cpt.getSolde()); 
		
		//System.out.println ("le solde est negatif pour le compte bancaire de  " + cpt.getSolde());
		
	}
	
	@Test
	public void testcalculSalaireBasdNegative () {
	
		System.out.println ("testcalculSalaireBasdNegative");
		System.out.println ("");
		VendeurSalaire vs4 = new VendeurSalaire ();
		//int res = 0; 
		//assertEquals(res, cpt.getSolde()); 
		
		//System.out.println ("le solde est negatif pour le compte bancaire de  " + cpt.getSolde());
		
	}
}
