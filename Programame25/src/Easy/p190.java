package Easy;

import java.util.Scanner;

public class p190 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x >= y) {
			
			int factoriales[] = new int[x-y];
			
			for (int i = 1; i <= x; i++) {
				
				if (i <= y)
					continue;
				else
					factoriales[i - (y+1)] = i;
			}
			
			long resultado = 1;
			
			for (int j = 0; j < factoriales.length; j++)
				resultado = resultado * factoriales[j];
			
			System.out.println(resultado);
			
			x = sc.nextInt();
			y = sc.nextInt();
				
		}
		sc.close();
	}
}
