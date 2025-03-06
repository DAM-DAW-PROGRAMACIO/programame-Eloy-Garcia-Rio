package Easy;

import java.util.Scanner;

public class p164 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long x1 = sc.nextLong();
		long y1 = sc.nextLong();
		long x2 = sc.nextLong();
		long y2 = sc.nextLong();
		
		while (x1 <= x2 && y1 <= y2) {
			
			System.out.println((x2 - x1) * (y2 - y1));
			
			x1 = sc.nextLong();
			y1 = sc.nextLong();
			x2 = sc.nextLong();
			y2 = sc.nextLong();
		}
		sc.close();
	}
}
