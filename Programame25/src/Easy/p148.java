package Easy;

import java.util.Scanner;

public class p148 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String linea = sc.nextLine();
		
		while (!linea.equals("00:00")) {
 
			String parts[] = linea.split(":");
			
			int horas = Integer.parseInt(parts[0]);
			int minutos = Integer.parseInt(parts[1]);
			
			int resultado = 1440 - (horas * 60 + minutos);
			
			System.out.println(resultado);
			
			linea = sc.nextLine();
		}
		sc.close();
	}
}
