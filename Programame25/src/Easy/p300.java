<<<<<<< HEAD
package Easy;

import java.util.Scanner;

public class p300 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int counter = sc.nextInt();
		boolean esPenta = false;
		
		sc.nextLine();
		
		for (int i = 0; i < counter; i++) {
		
			String palabra = sc.nextLine();
			
			esPenta = palabra.contains("a") && palabra.contains("e") && palabra.contains("i") && palabra.contains("o") && palabra.contains("u");
			
			if (esPenta)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
	}
}
=======
package Easy;

import java.util.Scanner;

public class p300 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int counter = sc.nextInt();
		boolean esPenta = false;
		
		sc.nextLine();
		
		for (int i = 0; i < counter; i++) {
		
			String palabra = sc.nextLine();
			
			esPenta = palabra.contains("a") && palabra.contains("e") && palabra.contains("i") && palabra.contains("o") && palabra.contains("u");
			
			if (esPenta)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
	}
}
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
