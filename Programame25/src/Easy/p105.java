package Easy;

import java.util.Scanner;
import java.util.TreeMap;

public class p105 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
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
			}
			
			String maxCaja = MaxCaja(recaudacion, dias);
			String minCaja = MinCaja(recaudacion, dias);
			String domingo = MejorDomingo(recaudacion, totalCaja);
			
			System.out.println(maxCaja + " " + minCaja + " " + domingo);
			
			cajaDia = sc.nextLine();
		}
		sc.close();
	}
	
	public static String MaxCaja (double r[], String t[]) {
		String result = "EMPATE";
		double max = Double.MIN_VALUE;
		
		for (int j = 0; j < 6; j++) {
			if (max == r[j])
				break;
			else if (max < r[j]) {	
				result = t[j];
				max = r[j];
			}
			else
				continue;
		}
		
		return result;
	}
	
	public static String MinCaja (double r[], String t[]) {
		String result = "EMPATE";
		double min = Double.MAX_VALUE;
		
		for (int j = 0; j < 6; j++) {
			if (min == r[j])
				break;
			else if (min > r[j]) {
				result = t[j];
				min = r[j];
			}
			else
				continue;
		}
		
		return result;
	}
	
	public static String MejorDomingo (double r[], double caja) {
		String result = "NO";
	
		if (r[5] > caja)
			result = "SI";
		
		return result;
	}
	
}
