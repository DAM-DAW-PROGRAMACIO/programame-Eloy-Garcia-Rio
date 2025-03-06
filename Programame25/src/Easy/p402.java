package Easy;

import java.util.Scanner;

public class p402 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long nPiezas = sc.nextLong();
		
		while (nPiezas > 0) {
			long result = 0;
			
			for (long i = 1; i <= nPiezas / 2; i++) {
				if (nPiezas % i == 0 && result <= nPiezas / i)
					result = i;
			}
			System.out.println(result);
			nPiezas = sc.nextLong();
		}
		sc.close();
	}
}
