package test.java;

import org.junit.Test;



import main.java.EmployeCoordonnees;

public class TestEmployeCoordonnees {


	@Test
	public void testafficheCoordonnees() {

		System.out.println("testafficheCoordonnees");
		System.out.println("\n");

		EmployeCoordonnees coord = new EmployeCoordonnees("Camille", "Desmoulins");
		coord.afficheCoordonnees();

	}

	@Test
	public void testafficheCoordonneesVide() {

		System.out.println("testafficheCoordonneesVide");
		System.out.println("");
		EmployeCoordonnees coord2 = new EmployeCoordonnees(" ", " ");
		coord2.afficheCoordonnees();

	}

	@Test
	public void testafficheCoordonneesManqueNom() {

		System.out.println("testafficheCoordonneesManqueNom");
		System.out.println(" ");
		EmployeCoordonnees coord3 = new EmployeCoordonnees(" ", "Versailles");
		coord3.afficheCoordonnees();

	}

	@Test
	public void testafficheCoordonneesManqueAdresse() {

		System.out.println("testafficheCoordonneesManqueAdresse");
		System.out.println(" ");
		EmployeCoordonnees coord4 = new EmployeCoordonnees("Louise"," ");
		coord4.afficheCoordonnees();

	}

}
