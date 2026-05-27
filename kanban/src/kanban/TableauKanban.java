package kanban;

import java.io.Console;

import util.TableauChaines;

public class TableauKanban {

	/**
	 * 
	 * @param intitules
	 * @param colonnes
	 */
	public static void afficherTableauKanban(String[] intitules, String[][] colonnes) {

		for (int i = 0; i < intitules.length; i++) {

			System.out.printf("%s : \n", intitules[i]);
		
			if(colonnes[i].length == 0) {
				
				System.out.print("(vide)");
			}else {
				for(int j = 0; j < colonnes[i].length; j++) {
				
		
				System.out.printf("- %s\n", colonnes[i][j]);
				
			}
				
			}
			
			System.out.println();
			System.out.println();


		}

	}
	
	
	
	
	/**
	 * 
	 * @param intitules
	 * @return
	 */
	public static String[]encoderIntitule(String[]intitules){
		
		int i = 1;
		while(true) {
			
			System.out.printf("Etape #%d ('Entrée pour terminer) ? ", i);
			String saisie = io.Console.lireString();
			
			if(saisie.isEmpty()) {
				break;
			}else {
				
				intitules = TableauChaines.ajouterElement(intitules, saisie.toUpperCase());
			}
			
			i++;
		}
		

		return intitules;
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// Déclarer le tableau D'intitulé des colonnes (une ligne au début)
		String[] intitules = new String[0];

		
		
		//encoder les intitules et les taches à faire 
		String[]intituleRempli = encoderIntitule(intitules);
		
		// Déclarer le tableau des Taches (ligne par intitule)
		String[][] taches = new String[intituleRempli.length][0];
		
		
		System.out.println();
		System.out.println();
		
		System.out.print("Tache à ajouter ? ");
		String saisieTache = io.Console.lireString();
		
		taches[0] = TableauChaines.ajouterElement(taches[0], saisieTache);
		
		
		afficherTableauKanban(intituleRempli, taches);
		
		
		
		

	}
	
	
	
	

}
