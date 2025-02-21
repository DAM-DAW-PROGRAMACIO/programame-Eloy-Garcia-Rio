package Easy;

import java.util.Scanner;

public class p345 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int line = sc.nextInt();
		
		for (int i = 0; i < line; i++) {
			
			int rows = 9;
			int cols = 9;
			int sudoku[][] = new int[rows][cols];
			
			for (int j = 0; j < rows; j++) {
				
				int k = 0;
				for (k = 0; k < cols; k++) {
					
					sudoku[j][k] = sc.nextInt();
				}
			}
			int counterY = 0;
			int counterX = 0;
			while (counterY < sudoku.length && counterX < sudoku.length) {
				
				
			}
		}
	}
}
