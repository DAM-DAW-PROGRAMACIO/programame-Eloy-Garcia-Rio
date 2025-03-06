package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p605 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String linea = br.readLine();
		
		while (!linea.equals(".")) {
						
			int verano = 0;
			int invierno = 0;
			
			for (int i = 0; i < linea.length() - 1; i++) {
				
				char prenda = linea.charAt(i);
				
				if(prenda == 'V')
					verano++;
				else if (prenda == 'I')
					invierno++;
			}
			
			if (verano > invierno)
				System.out.println("VERANO");
			else if (verano < invierno)
				System.out.println("INVIERNO");
			else
				System.out.println("EMPATE");
			
			linea = br.readLine();
			
		}
		br.close();
	}
}
