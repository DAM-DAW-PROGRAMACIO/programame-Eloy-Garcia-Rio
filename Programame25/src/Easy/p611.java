package Easy;

import java.util.Scanner;
import java.util.TreeMap;

public class p611 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String linea = sc.nextLine();
		
<<<<<<< HEAD
		while (!linea.equals(null) && !linea.equals("")) {
=======
		while (!linea.equals(null)) {
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379

			String parts[] = linea.split(" ");
			int fechaSir = Integer.parseInt(parts[0]);
			
			boolean esSir = false;
<<<<<<< HEAD
			long casos = sc.nextLong();
			TreeMap<Integer, String> obras = new TreeMap<Integer, String>();
			
			for (long i = 0; i < casos; i++)
=======
			int casos = sc.nextInt();
			TreeMap<Integer, String> obras = new TreeMap<Integer, String>();
			
			for (int i = 0; i < casos; i++)
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
				obras.put(sc.nextInt(), sc.nextLine());
			
			int counter = 0;
			for (int fecha : obras.keySet()) {
				
				esSir = fecha >= fechaSir;
				
<<<<<<< HEAD
				if (counter == 0 && esSir) {
					System.out.println("TODAS");
					break;
				}
				else if (esSir) {
=======
				if (counter == obras.size() && esSir) {
					System.out.println("TODAS");
					break;
				}
				else if (counter >= 0 && esSir) {
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
					System.out.println(obras.get(fecha).trim());
					break;
				}
				else
					counter++;
			}
			
			if (!esSir)
				System.out.println("NINGUNA");
			
			linea = sc.nextLine();
		}
		sc.close();
	}
}
