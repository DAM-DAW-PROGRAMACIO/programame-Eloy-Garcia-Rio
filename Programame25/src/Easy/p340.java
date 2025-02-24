package Easy;

import java.util.Scanner;

public class p340 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long casos = sc.nextLong();
		
		for (long i = 0; i < casos; i++) {
			
			long x = sc.nextLong();
			long y = sc.nextLong();
			
			long result = x * (x+1) + y * (y+1);
			
			System.out.println(result);
			
		}
		sc.close();
	}
}
