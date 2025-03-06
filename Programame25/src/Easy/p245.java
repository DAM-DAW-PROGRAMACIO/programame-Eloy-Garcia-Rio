<<<<<<< HEAD
package Easy;

import java.util.Scanner;

public class p245 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();

		while (line != 0) {

			long daltons[] = new long[line];
			
			for (int i = 0; i < line; i++)
				daltons[i] = sc.nextLong();
			
			if (!EsDaltonAsc(daltons) && !EsDaltonDesc(daltons)) {
				System.out.println("DESCONOCIDOS");
				sc.nextLine();
				line = sc.nextInt();
				} else {
					System.out.println("DALTON");
					line = sc.nextInt(); 
				}
		}
		sc.close();	
	}
	
	public static boolean EsDaltonAsc(long t[]) {
		
		boolean result = false;
		
		for (int i = 1; i < t.length; i++) {
			
			result = t[i-1] < t[i];
			if (!result)
				break;
		}
		
		return result;
	}
	
	public static boolean EsDaltonDesc(long t[]) {
		
		boolean result = false;
		
		for (int i = 1; i < t.length; i++) {
			
			result = t[i-1] > t[i];
			if (!result)
				break;
		}
		
		return result;
	}
}
=======
package Easy;

import java.util.Scanner;

public class p245 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();

		while (line != 0) {

			long daltons[] = new long[line];
			
			for (int i = 0; i < line; i++)
				daltons[i] = sc.nextLong();
			
			if (!EsDaltonAsc(daltons) && !EsDaltonDesc(daltons)) {
				System.out.println("DESCONOCIDOS");
				sc.nextLine();
				line = sc.nextInt();
				} else {
					System.out.println("DALTON");
					line = sc.nextInt(); 
				}
		}
		sc.close();	
	}
	
	public static boolean EsDaltonAsc(long t[]) {
		
		boolean result = false;
		
		for (int i = 1; i < t.length; i++) {
			
			result = t[i-1] < t[i];
			if (!result)
				break;
		}
		
		return result;
	}
	
	public static boolean EsDaltonDesc(long t[]) {
		
		boolean result = false;
		
		for (int i = 1; i < t.length; i++) {
			
			result = t[i-1] > t[i];
			if (!result)
				break;
		}
		
		return result;
	}
}
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
