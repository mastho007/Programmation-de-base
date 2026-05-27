package shifumi;

import java.io.Console;

import util.TableauChaines;

public class Shifumi {

	private static final String[] ARMES = { "Ciseaux", "Feuille", "Pierre", "Lézard", "Spock" };

	// Dans ta classe Shifumi, à côté de ta constante ARMES
	private static final String[][] INTERACTIONS = {
			// Ligne 0 : Ciseaux (confrontés à [Ciseaux, Feuille, Pierre, Lézard, Spock])
			{ "ne font rien contre", "coupent", "sont émoussés par", "décapitent", "sont cassés par" },

			// Ligne 1 : Feuille (confrontée à [Ciseaux, Feuille, Pierre, Lézard, Spock])
			{ "est coupée par", "ne fait rien contre", "enveloppe", "est mangée par", "discrédite" },

			// Ligne 2 : Pierre (confrontée à [Ciseaux, Feuille, Pierre, Lézard, Spock])
			{ "émousse", "est enveloppée par", "ne fait rien contre", "écrase", "est vaporisée par" },

			// Ligne 3 : Lézard (confronté à [Ciseaux, Feuille, Pierre, Lézard, Spock])
			{ "est décapité par", "mange", "est écrasé par", "ne fait rien contre", "empoisonne" },

			// Ligne 4 : Spock (confronté à [Ciseaux, Feuille, Pierre, Lézard, Spock])
			{ "casse", "est discrédité par", "vaporise", "est empoisonné par", "ne font rien contre" } };

	
	/**
	 * 
	 * @param Armes
	 * @return
	 */
	public static char afficherArmes(String[] Armes) {
		
		for(String arme : Armes) {
			
			System.out.printf("%s, ", arme);
			
			
		}
		System.out.print(" ?");
		String ArmeUne = io.Console.lireString();
		
		String ArmeDeux = TableauChaines.valeurAleatoire(Armes);
		
		System.out.printf("%s contre %s \n", ArmeUne, ArmeDeux);
		
		System.out.println("(C)ontinuer, (Q)uitter ? ");
		
		char saisie = io.Console.lireChar();
		
		return saisie;
		
	}
	
	/**
	 * 
	 * @param historique
	 */
	public static void enregistrerArmes(String[][]historique, String armeJoueur, String ArmeIA) {
		
		historique[0] = TableauChaines.ajouterElement(historique[0], armeJoueur);
		
		historique[1] = TableauChaines.ajouterElement(historique[1], ArmeIA);
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		// on créé un tableau de 2 lignes
		String[][] t_manche = new String[2][];
		
		
		
		boolean quitter = false;
		
		System.out.println("JEU DU SHIFUMI");
		System.out.println();
		System.out.println();
		
		while(quitter != true) {
			
			char saisie = afficherArmes(ARMES);
			
			if(Character.toLowerCase(saisie) == 'q') {
				quitter = true;
			}
			
			
		}
		
		
		
		
		
		
		
		

	}

}
