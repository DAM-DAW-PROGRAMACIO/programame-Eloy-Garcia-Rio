<<<<<<< HEAD
package Easy;

import java.util.Scanner;

public class p239 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String line = sc.nextLine();
		
		while (!line.equals("0 0")) {
			
			String parts[] = line.split(" ");
			
			long placeholder = 0;
			long resultado = Long.parseLong(parts[0]) * 24 * 6 * Long.parseLong(parts[1]);
			
			long segundos = resultado % 60;
			placeholder = resultado / 60;
			long minutos = placeholder % 60;
			placeholder = placeholder / 60;
			long horas = placeholder % 24;
			long dias = placeholder / 24;
			
			System.out.format("%d:%02d:%02d:%02d\n", dias,  horas, minutos, segundos);
			
			line = sc.nextLine();
		}
		sc.close();
	}
}
=======
package Easy;

import java.util.Scanner;

public class p239 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String line = sc.nextLine();
		
		while (!line.equals("0 0")) {
			
			String parts[] = line.split(" ");
			
			long placeholder = 0;
			long resultado = Long.parseLong(parts[0]) * 24 * 6 * Long.parseLong(parts[1]);
			
			long segundos = resultado % 60;
			placeholder = resultado / 60;
			long minutos = placeholder % 60;
			placeholder = placeholder / 60;
			long horas = placeholder % 24;
			long dias = placeholder / 24;
			
			System.out.format("%d:%02d:%02d:%02d\n", dias,  horas, minutos, segundos);
			
			line = sc.nextLine();
		}
		sc.close();
	}
}
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
