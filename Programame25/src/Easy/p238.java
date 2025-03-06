package Easy;

import java.util.Scanner;

public class p238 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int nBilletes = sc.nextInt();
		int nVillanos = sc.nextInt();
		
		while (nBilletes > 0 && nVillanos > 0) {

			int botin[] = new int[nBilletes];
			int reparto[][] = new int[nVillanos][nBilletes];
			int counterV = 0;
			
			for (int i = 0; i < nBilletes; i++) {
				
				int billete = sc.nextInt();
				botin[i] = billete;
				reparto[counterV][i] = billete;
				if (counterV >= nVillanos-1)
					counterV = 0;
				else
					counterV++;
			}
			
			for (int j = 0; j < nVillanos; j++) {
				String output = "";
				StringBuilder sb = new StringBuilder(output);
				int total = 0;
				for (int k = 0; k < nBilletes; k++) {
					if (reparto[j][k] > 0) {
						sb.append(" ");
						sb.append(reparto[j][k]);
					}
					total += reparto[j][k];
				}
				output = total + ":" + sb.toString();
				System.out.println(output);
			}
			
			System.out.println("---");
			nBilletes = sc.nextInt();
			nVillanos = sc.nextInt();
		}
		sc.close();
	}
}
