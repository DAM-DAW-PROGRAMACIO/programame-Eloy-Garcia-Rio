package Easy;

import java.util.Scanner;

public class p576 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		while (!sc.hasNext("0")) {
			
			long tDefinicion = sc.nextLong();	
			long totalSegundos = 0;
			
			while (!sc.hasNext("0"))
				totalSegundos += sc.nextLong() * tDefinicion;
			
			long segundos = totalSegundos % 60;
			totalSegundos = totalSegundos / 60;
			long minutos = totalSegundos % 60;
			long horas = totalSegundos / 60;
			
			System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
<<<<<<< HEAD
			sc.nextLong();	
=======
			sc.nextLine();	
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
		}
		sc.close();
	}
}
