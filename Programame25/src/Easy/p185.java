package Easy;

import java.util.TreeSet;
import java.util.Scanner;

public class p185 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int casos = sc.nextInt();
		
		while (casos > 0) {
			
			String ingredienteMalo = "";
			TreeSet<String> ingredientesSi = new TreeSet<String>();
			TreeSet<String> ingredientesNo = new TreeSet<String>();

			for (int i = 0; i < casos; i++) {
				
				String acepta = sc.next();
				String comida = sc.next();
				
				while (!comida.equals("FIN")) {
					if (acepta.equals("SI:")) {
						ingredientesSi.add(comida);
					}
					else {
						ingredientesNo.add(comida);
					}
					comida = sc.next();
				}	
			}
			
			for (String ingrediente : ingredientesNo) {				
				if (!ingredientesSi.contains(ingrediente))
					ingredienteMalo += " " + ingrediente;
			}
				
			System.out.println(ingredienteMalo.trim());
			
			casos = sc.nextInt();
		}
		sc.close();
	}
}
