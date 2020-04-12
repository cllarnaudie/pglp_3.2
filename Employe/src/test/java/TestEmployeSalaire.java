package test.java;

import org.junit.Test;
import main.java.EmployeSalaire;

public class TestEmployeSalaire {

	@Test
	public void testcalculSalaireBase() {

		System.out.println("testcalculSalaireBase");
		System.out.println("");
		EmployeSalaire sb = new EmployeSalaire(20);
		double res =  sb.calculSalaireBase(); 

		System.out.println ("le salaire de base est " + res + " \n"); 
	}

	@Test
	public void testcalculSalaireBaseAgeInferieurVingt() {

		System.out.println("testcalculSalaireBaseAgeInferieurVingt");
		System.out.println("");
		EmployeSalaire sb2 = new EmployeSalaire(19);
		double res2 =  sb2.calculSalaireBase(); 

		System.out.println ("le salaire de base si age est inferieur a vingt est " + res2 + " \n"); 

	}

	@Test
	public void testcalculSalaireBaseAgeSuperieurCinquanteSix() {

		System.out.println("testcalculSalaireBaseAgeSuperieurCinquanteSix");
		System.out.println("");
		EmployeSalaire sb4 = new EmployeSalaire(57);

		double res3 =  sb4.calculSalaireBase(); 
		System.out.println ("le salaire de base si age est inferieur a vingt est " + res3 + " \n" ); 

	}

	@Test
	public void testcalculSalaireBaseAgeValeurNegative() {

		System.out.println("testcalculSalaireBaseAgeValeurNegative");
		System.out.println("");
		EmployeSalaire sb5 = new EmployeSalaire(-24);

		double res4 =  sb5.calculSalaireBase(); 
		System.out.println ("le salaire de base si age a une valeur negative est " + res4 + " \n"); 

	}

}
