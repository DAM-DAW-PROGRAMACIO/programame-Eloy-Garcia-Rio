package Easy;

import java.util.Scanner;

public class p608 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int casos = sc.nextInt();
		
		while (casos > 0) {

			int nAvisos = 0;
			int tAviso = 0;
			
			for (int i = 0; i < casos; i++) {
				
				int temp = sc.nextInt();
				
				if ((i == 0 && temp <= 4) || (tAviso > 0 && temp <= 4)) {
					nAvisos++;
					tAviso = 0;
				}
				else if (temp > 6)
					tAviso++;
				else
					continue;
			}
			
			System.out.println(nAvisos);		
			
			casos = sc.nextInt();
		}
		sc.close();
	}
}


