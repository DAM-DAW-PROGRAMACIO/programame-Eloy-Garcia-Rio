<<<<<<< HEAD
package Easy;

import java.util.Scanner;

public class p335 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String line = sc.nextLine();
		
		for(int i = 0; i< Integer.parseInt(line); i++){
			int files = sc.nextInt();
			int total = 0;
			
			for(int j = 1; j <= files; j++) {
				total = total + ((j*(j+1))/2);
			}
			System.out.println(total);
		}
	}
}
=======
package Easy;

import java.util.Scanner;

public class p335 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String line = sc.nextLine();
		
		for(int i = 0; i< Integer.parseInt(line); i++){
			int files = sc.nextInt();
			int total = 0;
			
			for(int j = 1; j <= files; j++) {
				total = total + ((j*(j+1))/2);
			}
			System.out.println(total);
		}
	}
}
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
