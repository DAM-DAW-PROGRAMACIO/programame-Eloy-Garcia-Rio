package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class p416 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long casos = sc.nextLong();
		
		while (casos > 0) {
			
			HashSet<String> fechas = new HashSet<String>();
			boolean cumpleCompartido = false;

			for (long i = 0; i < casos; i++) {
				
				String parts[] = sc.next().split("/");
				String cumple = parts[0] + "/" + parts[1];
				
				if (!fechas.add(cumple)) {
					cumpleCompartido = true;
					break;
				}		
			}
			
			if (!cumpleCompartido)
				System.out.println("NO");
			else {
				System.out.println("SI");
				sc.nextLine();
			}
				
			
			casos = sc.nextLong();
		}
		sc.close();
	}
}
