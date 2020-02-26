package test.java;

import static org.junit.Assert.*;


import org.junit.Test;

import main.java.Manager;

public class TestManager {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	/*
	 *a completer
	 */
	
	@Test
	public void testcalculSalaire () {
	
		System.out.println ("testcalculSalaire");
		System.out.println ("");
		Manager mg = new Manager ();
		//int res = 0; 
		//assertEquals(res, cpt.getSolde()); 
		
		//System.out.println ("le solde est negatif pour le compte bancaire de  " + cpt.getSolde());
		
	}
	
	@Test
	public void testcalculSalairePersonneInferieurCent () {
	
		System.out.println ("testcalculSalairePersonneInferieurCent");
		System.out.println ("");
		Manager mg2 = new Manager ();
		//int res = 0; 
		//assertEquals(res, cpt.getSolde()); 
		
		//System.out.println ("le solde est negatif pour le compte bancaire de  " + cpt.getSolde());
		
	}
	
	@Test
	public void testcalculSalaireBaseNegative () {
	
		System.out.println ("testcalculSalaireBaseNegative");
		System.out.println ("");
		Manager mg3 = new Manager ();
		//int res = 0; 
		//assertEquals(res, cpt.getSolde()); 
		
		//System.out.println ("le solde est negatif pour le compte bancaire de  " + cpt.getSolde());
		
	}

}
