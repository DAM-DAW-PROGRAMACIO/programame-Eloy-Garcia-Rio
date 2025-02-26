package Easy;

import java.util.Scanner;

public class p154 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String matricula = sc.nextLine();

		while (!matricula.equals("9999 ZZZ")) {

			String parts[] = matricula.split(" ");
			
			int numerales = Integer.parseInt(parts[0]);
			String letras = parts[1];
			
			if (numerales + 1 == 10000 ) {
				if (letras.endsWith("ZZ")) {
					if ((letras.charAt(0) + 1) == 'A' || (letras.charAt(0) + 1) == 'E' || (letras.charAt(0) + 1) == 'I' || (letras.charAt(0) + 1) == 'O' || (letras.charAt(0) + 1) == 'U')
						letras = (char)(letras.charAt(0) + 2) + "BB";
					else
						letras = (char)(letras.charAt(0) + 1) + "BB";
				}
				else if (letras.endsWith("Z")) {
					
					if ((letras.charAt(1) + 1) == 'A' || (letras.charAt(1) + 1) == 'E' || (letras.charAt(1) + 1) == 'I' || (letras.charAt(1) + 1) == 'O' || (letras.charAt(1) + 1) == 'U')
						letras = letras.substring(0,1) + ((char)(letras.charAt(1) + 2)) + "B";
					else
						letras = letras.substring(0,1) + ((char)(letras.charAt(1) + 1)) + "B";
				}
				else if ((letras.charAt(2) + 1) == 'A' || (letras.charAt(2) + 1) == 'E' || (letras.charAt(2) + 1) == 'I' || (letras.charAt(2) + 1) == 'O' || (letras.charAt(2) + 1) == 'U')
					letras = letras.substring(0,2) + (char)(letras.charAt(2) + 2);
				else
					letras = letras.substring(0,2) + (char)(letras.charAt(2) + 1);
				
				numerales = 0000;
			}
			else
				numerales++;
			
			System.out.printf("%04d %s\n", numerales, letras);
			
			matricula = sc.nextLine();
		}
		sc.close();
	}
}
