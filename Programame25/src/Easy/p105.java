package Easy;

import java.util.Scanner;

public class p105 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String dias[] = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
		
		while (!sc.hasNext("-1")) {
			double totalCaja = 0;
			double recaudacion[] = new double[dias.length];
			
			for (int i = 0; i < dias.length; i++) {
				recaudacion[i] = Double.parseDouble(sc.nextLine());
				totalCaja += recaudacion[i];				
			}
			
			String maxCaja = MaxCaja(recaudacion, dias);
			String minCaja = MinCaja(recaudacion, dias);
			String domingo = MejorDomingo(recaudacion, totalCaja);
			
			System.out.printf("%s %s %s\n", maxCaja, minCaja, domingo);
			
		}
		sc.close();
	}
	
	public static String MaxCaja (double r[], String t[]) {
		String result = "EMPATE";
		double max = Double.MIN_VALUE;
		
		for (int j = 0; j < t.length; j++) {
			if (max == r[j])
				break;
			else if (max < r[j]) {
				result = t[j];
				max = r[j];
			}
		}
		
		return result;
	}
	
	public static String MinCaja (double r[], String t[]) {
		String result = "EMPATE";
		double min = Double.MAX_VALUE;
		
		for (int j = 0; j < t.length; j++) {
			if (min == r[j])
				break;
			else if (min > r[j]) {
				result = t[j];
				min = r[j];
			}
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

