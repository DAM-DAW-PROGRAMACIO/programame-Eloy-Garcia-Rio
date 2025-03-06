<<<<<<< HEAD
package Easy;

import java.util.Scanner;

public class p407 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String line = sc.nextLine();
		
		while (!line.equals("0 0 0")) {
			
			int resultado = 0;
			
			String parts[] = line.split(" ");
			
			resultado = (Integer.parseInt(parts[1]) + Integer.parseInt(parts[2]));
			
			if (resultado > Integer.parseInt(parts[0]))
				resultado = Integer.parseInt(parts[0]) - (resultado - Integer.parseInt(parts[0]));
			
			System.out.println(resultado);
			
			line = sc.nextLine();
		}
		sc.close();
	}
}
=======
package Easy;

import java.util.Scanner;

public class p407 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String line = sc.nextLine();
		
		while (!line.equals("0 0 0")) {
			
			int resultado = 0;
			
			String parts[] = line.split(" ");
			
			resultado = (Integer.parseInt(parts[1]) + Integer.parseInt(parts[2]));
			
			if (resultado > Integer.parseInt(parts[0]))
				resultado = Integer.parseInt(parts[0]) - (resultado - Integer.parseInt(parts[0]));
			
			System.out.println(resultado);
			
			line = sc.nextLine();
		}
		sc.close();
	}
}
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
