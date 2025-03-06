package Easy;

import java.util.Scanner;

public class p337 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long casos = sc.nextLong();
		
		for (int i = 0; i < casos; i++) {
			
			int superior[] = new int[6];
			int inferior[] = new int [6];

			for (int j = 0; j < 6; j++) {
				
				superior[j] = sc.nextInt();
			}
			
			for (int k = 0; k < 6; k++) {
				
				inferior[k] = sc.nextInt();
			}
			
			int dDientes = 0;
			boolean perfectos = true;
			
			for (int l = 0; l < 6; l++) {
					
				if (l == 0)
					dDientes = superior[l] + inferior[l];
				
				if (l > 0 && dDientes != superior[l] + inferior[l]) {
					perfectos = false;
					break;
				}		
			}
			
			if (perfectos == true)
				System.out.println("SI");
			else
				System.out.println("NO");

		}
		sc.close();
	}
}
