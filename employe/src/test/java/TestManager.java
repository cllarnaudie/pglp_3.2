package test.java;


import org.junit.Test;

import main.java.Manager;

public class TestManager {


	@Test
	public void testcalculSalaire() {

		System.out.println("testcalculSalaire");
		System.out.println("");
		Manager mg = new Manager(100,50);
		double res =  mg.calculSalaireBase(); 

		System.out.println ("le salaire de base est " + res + " \n"); 

	}

	@Test
	public void testcalculSalairePersonneInferieurCent() {

		System.out.println("testcalculSalairePersonneInferieurCent");
		System.out.println("");
		Manager mg2 = new Manager(90,50);
		double res2 =  mg2.calculSalaireBase(); 
	

		System.out.println ("le salaire de base inferieur a cent est " + res2 + " \n"); 
	}

	@Test
	public void testcalculSalaireBaseNegative() {

		System.out.println("testcalculSalaireBaseNegative");
		System.out.println("");
		Manager mg3 = new Manager(150,-40);
		double res3 =  mg3.calculSalaireBase(); 

		System.out.println ("le solde est negatif pour le compte bancaire de " + res3 + " \n" ); 
		
	}

}
