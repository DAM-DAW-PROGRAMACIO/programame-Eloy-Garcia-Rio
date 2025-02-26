package Easy;

import java.util.Scanner;

public class p241 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long casos = sc.nextLong();
		
		for (long i = 0; i < casos; i++) {
			
			long hojas = sc.nextLong();
			
			if (hojas < 3)
				System.out.println("IMPOSIBLE");
			else
				System.out.println(hojas % 3 );			
		}		
		sc.close();
	}
}