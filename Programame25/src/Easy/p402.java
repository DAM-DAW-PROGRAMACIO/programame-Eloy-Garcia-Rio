<<<<<<< HEAD
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
=======
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
				if (!(nPiezas % i == 0 && result <= nPiezas / i)) continue;
				else result = i;		
			}
			System.out.println(result);
			nPiezas = sc.nextLong();
		}
		sc.close();
	}
}
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
