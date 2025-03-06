package Easy;

import java.util.Scanner;

public class p682 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long casos = sc.nextLong();
		
		for (long i = 0; i < casos; i++) {
			
			long nPatos = sc.nextLong();
			
			System.out.printf("%d %d\n", nPatos, nPatos*2);	
		}
		sc.close();
	}
}
