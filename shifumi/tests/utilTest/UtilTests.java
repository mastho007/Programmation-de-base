package utilTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.TableauChaines;

class UtilTests {
	
	//Tests pour AjouterElement()
	@Test
	void siLajoutEstBon() {
		
		String[] tTest = {"Ciseaux", "Feuille", "Pierre", "Lézard", "Spock"};
		
		String [] tAttendu = {"Ciseaux", "Feuille", "Pierre", "Lézard", "Spock", "Puit"};
		
		String element = "Puit";
		
		
		
		assertArrayEquals(tAttendu, TableauChaines.ajouterElement(tTest, element));
	}

	
	// Tests pour valeurAleatoire()
	@Test
	void retourneDesvaleursDifferentsParfois() {
		
		String[] tTest = {"Ciseaux", "Feuille", "Pierre", "Lézard", "Spock"};
		
		String resultat1 = TableauChaines.valeurAleatoire(tTest);
		String resultat2 = TableauChaines.valeurAleatoire(tTest);
		String resultat3 = TableauChaines.valeurAleatoire(tTest);

		assertTrue(resultat1 != resultat2 || resultat1 != resultat3);
		
		
		
	}
	

	
	
	
	
	
	
}
