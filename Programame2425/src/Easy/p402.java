package Easy;

import java.util.Scanner;

public class p402 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String line = sc.nextLine();
		
		while (line != null && !line.startsWith("0")) {
			int result = 0;
			
			for (int i = 1; i <= Integer.parseInt(line) / 2; i++) {
				if (Integer.parseInt(line) % i == 0 && result <= Integer.parseInt(line) / i)
					result = i;
			}
			
			System.out.println(result);
			line = sc.nextLine();
		}
	}
}
