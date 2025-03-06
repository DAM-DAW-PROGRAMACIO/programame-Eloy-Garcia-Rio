package Easy;

import java.util.Scanner;

public class plantilla_Matrius {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int casos = sc.nextInt();
		
		while (casos > 0) {

			int matriu[][] = new int[casos][casos];
					
			for (int i = 0; i < casos; i++) {
				for (int j = 0; j < casos; j++)
					matriu[i][j] = sc.nextInt();				
			}			
			casos = sc.nextInt();
		}
		sc.close();
	}
}
