package Easy;

import java.util.Scanner;
<<<<<<< HEAD
=======
import java.util.TreeMap;
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379

public class p105 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
<<<<<<< HEAD
		String dias[] = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
		
		while (!sc.hasNext("-1")) {
			double totalCaja = 0;
			double recaudacion[] = new double[dias.length];
			
			for (int i = 0; i < dias.length; i++) {
				recaudacion[i] = Double.parseDouble(sc.nextLine());
				totalCaja += recaudacion[i];				
=======
		String cajaDia = sc.nextLine();
		String dias[] = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
		double recaudacion[] = new double[6];
		double totalCaja = 0;
		
		while (!cajaDia.equals("-1")) {
			
			for (int i = 0; i < 6; i++) {
				
				recaudacion[i] = Double.parseDouble(cajaDia);
				
				if (i < 5)
					totalCaja += Double.parseDouble(cajaDia);
				
				cajaDia = sc.nextLine();
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
			}
			
			String maxCaja = MaxCaja(recaudacion, dias);
			String minCaja = MinCaja(recaudacion, dias);
			String domingo = MejorDomingo(recaudacion, totalCaja);
			
<<<<<<< HEAD
			System.out.printf("%s %s %s\n", maxCaja, minCaja, domingo);
			
=======
			System.out.println(maxCaja + " " + minCaja + " " + domingo);
			
			cajaDia = sc.nextLine();
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
		}
		sc.close();
	}
	
	public static String MaxCaja (double r[], String t[]) {
		String result = "EMPATE";
		double max = Double.MIN_VALUE;
		
<<<<<<< HEAD
		for (int j = 0; j < t.length; j++) {
			if (max == r[j])
				break;
			else if (max < r[j]) {
				result = t[j];
				max = r[j];
			}
=======
		for (int j = 0; j < 6; j++) {
			if (max == r[j])
				break;
			else if (max < r[j]) {	
				result = t[j];
				max = r[j];
			}
			else
				continue;
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
		}
		
		return result;
	}
	
	public static String MinCaja (double r[], String t[]) {
		String result = "EMPATE";
		double min = Double.MAX_VALUE;
		
<<<<<<< HEAD
		for (int j = 0; j < t.length; j++) {
=======
		for (int j = 0; j < 6; j++) {
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
			if (min == r[j])
				break;
			else if (min > r[j]) {
				result = t[j];
				min = r[j];
			}
<<<<<<< HEAD
		}
	
=======
			else
				continue;
		}
		
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
		return result;
	}
	
	public static String MejorDomingo (double r[], double caja) {
		String result = "NO";
	
		if (r[5] > caja)
			result = "SI";
		
		return result;
	}
	
}
<<<<<<< HEAD

=======
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
