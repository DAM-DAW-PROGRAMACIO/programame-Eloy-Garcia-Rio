package Easy;

import java.util.Scanner;

public class p520 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int nCubos = sc.nextInt();
		int posBolita = sc.nextInt();
		
		while (nCubos > 0 && posBolita > 0) {
			
			int pos1 = sc.nextInt();
			int pos2 = sc.nextInt();
			
			while (pos1 > 0 && pos2 > 0) {
				
				if (pos1 == posBolita)
					posBolita = pos2;
				else if (pos2 == posBolita)
					posBolita = pos1;
				
				pos1 = sc.nextInt();
				pos2 = sc.nextInt();
			}
			
			System.out.println(posBolita);
			sc.nextLine();
			nCubos = sc.nextInt();
			posBolita = sc.nextInt();
		}
		sc.close();
	}
}
