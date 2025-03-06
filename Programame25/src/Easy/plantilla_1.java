package Easy;

import java.util.Scanner;

public class plantilla_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String linia = sc.nextLine();
		
		while (!linia.equals("00:00")) {
			
			linia = sc.nextLine();
		}
		sc.close();
	}
}
