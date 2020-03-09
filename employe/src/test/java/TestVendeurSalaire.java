package test.java;

import org.junit.Test;
import main.java.VendeurSalaire;

public class TestVendeurSalaire {
	
	@Test
	public void testcalculSalaire() {

		System.out.println("testcalculSalaire");
		System.out.println("");
		VendeurSalaire vs = new VendeurSalaire(40.12,20);
     	double res =  vs.calculSalaire(); 

		System.out.println ("le salaire de base est " + res + " \n"); 
	}

	@Test
	public void testcalculSalaireNegative() {

		System.out.println("testcalculSalaireNegative");
		System.out.println("");
		VendeurSalaire vs2 = new VendeurSalaire(-40.12,-20);
		double res2 =  vs2.calculSalaire(); 

		System.out.println ("le salaire de base negative est " + res2 + " \n" ); 

	}

	@Test
	public void testcalculSalaireCommisionNegative() {

		System.out.println("testcalculSalaireCommisionNegative");
		System.out.println("");
		VendeurSalaire vs3 = new VendeurSalaire(-24.12,22);
		double res3 =  vs3.calculSalaire(); 

		System.out.println ("le salaire de base avec une commission negative est " + res3 + " \n"); 

	}

	@Test
	public void testcalculSalaireBasdNegative() {

		System.out.println("testcalculSalaireBasdNegative");
		System.out.println("");
		VendeurSalaire vs4 = new VendeurSalaire(-20.13,47);
		double res4 =  vs4.calculSalaire(); 

		System.out.println ("le salaire de base negative est " + res4 + " \n"); 

	}
}
