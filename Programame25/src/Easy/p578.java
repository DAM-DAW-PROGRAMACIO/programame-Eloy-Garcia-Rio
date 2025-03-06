package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class p578 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String casos = sc.nextLine();
		
		while (!casos.equals("0")) {

			HashSet<String> inventario = new HashSet<String>();
			
			for (long i = 0; i < Long.parseLong(casos); i++)
				inventario.add(sc.nextLine().toLowerCase());
			
			System.out.println(inventario.size());
			
			casos = sc.nextLine();
		}
		sc.close();
	}
}
