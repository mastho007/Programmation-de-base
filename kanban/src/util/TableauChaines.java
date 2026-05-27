package util;

import java.util.Arrays;

public class TableauChaines {
	
	
	/**
	 * 
	 * @param t
	 * @param element
	 * @return
	 */
	public static String[] ajouterElement(String[] t,String element) {
		
		String[] t_nouv = Arrays.copyOf(t, t.length + 1);
		
		t_nouv[t.length] = element;
		
		return t_nouv;
		
	}
	
	
	

}
