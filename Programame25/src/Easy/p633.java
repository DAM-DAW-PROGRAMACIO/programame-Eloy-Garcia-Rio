package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class p633 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int casos = sc.nextInt();
		
		while (casos > 0) {

			HashSet<String> arca = new HashSet<String>();
			int repetidos = 0;
			int parejas = 0;
			int libres = 0;
			
			for (int i = 0; i < casos; i++) {
				
				if (!arca.add(sc.next()))
					repetidos++;
			}			
			
			for (String animal : arca) {
				String pareja = "";
				
				if (animal.endsWith("a")) {
					pareja = (animal.substring(0, animal.length()-1)) + "o";
					if (arca.contains(pareja))
						parejas++;
					else
						libres++;
				}
				else if (animal.endsWith("o")) {
					pareja = (animal.substring(0, animal.length()-1)) + "a";
					if (arca.contains(pareja))
						parejas++;
					else
						libres++;
				}
			}
			System.out.printf("%d %d %d\n", parejas/2, libres, repetidos);
			
			casos = sc.nextInt();
		}
		sc.close();
	}
}

