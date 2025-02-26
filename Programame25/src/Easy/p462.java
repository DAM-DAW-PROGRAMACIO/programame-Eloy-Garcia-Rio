package Easy;

import java.util.Scanner;

public class p462 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++){
			long placeholder = 0;
			long tLimpio = 0;
			long nVeces = sc.nextInt();
			String partes[] = sc.nextLine().split(":");
			
			tLimpio = (Integer.parseInt(partes[0].trim()) * 3600 + Integer.parseInt(partes[1]) * 60 + Integer.parseInt(partes[2])) * nVeces;
			
			long segundos = tLimpio % 60;
			placeholder = tLimpio / 60;
			long minutos = placeholder % 60;
			placeholder = placeholder / 60;
			long horas = placeholder % 24;
			long dias = placeholder / 24;
					
			System.out.format("%d %02d:%02d:%02d\n", dias, horas, minutos, segundos);

		}
		sc.close();
	}
}
