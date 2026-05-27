package util;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TableauChaines {
	
	
	
	
	/**
	 * Retourne une copie du tableau t avec l'élément ajouté pour faire un nouv tab
	 * @param t
	 * @param element
	 * @return
	 */
	public static String[] ajouterElement(String[] t, String element) {
		
		
		//on créé le nouv tab 
		
		String [] t_nouv = Arrays.copyOf(t, t.length + 1);
		
		t_nouv[t.length] = element;
		
		return t_nouv;
		
	}
	
	
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public static String valeurAleatoire(String[] t) {
		
		
		int nbre = Aleatoire.aleatoire(0, t.length - 1);
		
		return t[nbre];
		
		
	}
	
	
	
	
	
	
	
	

}
