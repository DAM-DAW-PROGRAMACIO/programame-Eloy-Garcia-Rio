package Easy;

import java.util.Scanner;

class Objecte {
	
	private long a;
	private double b;
	private char c;
	private String d;
	private boolean e;
	
	Objecte (long a, double b, char c, String d, boolean e){
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
}

public class plantilla_Objectes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long casos = sc.nextLong();
		
		while (casos > 0) {

			for (long i = 0; i < casos; i++) {
				
			}
			
			casos = sc.nextLong();
		}
		sc.close();
	}
}
