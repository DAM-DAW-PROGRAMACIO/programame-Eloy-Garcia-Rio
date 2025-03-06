package Easy;

import java.util.Scanner;

public class p219 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long casos = sc.nextLong();
		

		for (long i = 0; i < casos; i++) {
			
			int nBoletos = sc.nextInt();
			int nComprados = 0;
			
			for (int j = 0; j < nBoletos; j++) {
				
				int decimo = sc.nextInt();
				
				if (decimo % 2 == 0)
					nComprados++;
			}
			
			System.out.println(nComprados);
				
		}
			
		sc.close();
	}
}
