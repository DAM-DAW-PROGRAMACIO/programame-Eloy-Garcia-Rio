package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class p409 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			int nCastellers = sc.nextInt();
			int nColla = sc.nextInt();
			int alcades[] = new int[nColla];
			int nPisos = 0;
			
			for (int j = 0; j < nColla; j++)
				alcades[j] = sc.nextInt();
			
			Arrays.sort(alcades);
			
			int k = 0;
			while (k < nColla - (nCastellers - 1)) {
				
					if (alcades[k + (nCastellers - 1)] - alcades[k] <= 15) {
						nPisos++;
						k += nCastellers;
					}
					else k++;	
			}
			System.out.println(nPisos);
		}
		sc.close();
	}
}
