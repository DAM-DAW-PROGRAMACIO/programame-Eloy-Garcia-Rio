package Easy;

import java.util.Scanner;
import java.util.TreeMap;

public class p611 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String linea = sc.nextLine();
		
		while (!linea.equals(null)) {

			String parts[] = linea.split(" ");
			int fechaSir = Integer.parseInt(parts[0]);
			
			boolean esSir = false;
			int casos = sc.nextInt();
			TreeMap<Integer, String> obras = new TreeMap<Integer, String>();
			
			for (int i = 0; i < casos; i++)
				obras.put(sc.nextInt(), sc.nextLine());
			
			int counter = 0;
			for (int fecha : obras.keySet()) {
				
				esSir = fecha >= fechaSir;
				
				if (counter == obras.size() && esSir) {
					System.out.println("TODAS");
					break;
				}
				else if (counter >= 0 && esSir) {
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
