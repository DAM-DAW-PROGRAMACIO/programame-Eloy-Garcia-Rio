<<<<<<< HEAD
package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class p345 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int line = sc.nextInt();
		
		for (int i = 0; i < line; i++) {
			
			int counter = 0;
			int rows = 9;
			int cols = 9;
			int sudoku[][] = new int[rows][cols];
			
			for (int j = 0; j < rows; j++) {
				HashSet<Integer> fila = new HashSet<Integer>();
				for (int k = 0; k < cols; k++) {
					if (!fila.add(sc.nextInt()))
						break;
					fila.add(sc.nextInt());
				}
				
				for (int casilla : fila) {
					sudoku[j][counter] = casilla;
					counter++;
				}
			}
			
			
				
				
		}
	}
}

=======
package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class p345 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int line = sc.nextInt();
		
		for (int i = 0; i < line; i++) {
			
			int counter = 0;
			int rows = 9;
			int cols = 9;
			int sudoku[][] = new int[rows][cols];
			
			for (int j = 0; j < rows; j++) {
				HashSet<Integer> fila = new HashSet<Integer>();
				for (int k = 0; k < cols; k++) {
					if (!fila.add(sc.nextInt()))
						break;
					fila.add(sc.nextInt());
				}
				
				for (int casilla : fila) {
					sudoku[j][counter] = casilla;
					counter++;
				}
			}
			
			
				
				
		}
	}
}

>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
