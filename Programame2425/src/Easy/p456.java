package Easy;

import java.util.Scanner;

public class p456 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String line = sc.nextLine();

		for (int i = Integer.parseInt(line); i > 0; i--) {
				
			line = sc.nextLine();
				
			String parts[] = line.split(" ");
				
			System.out.println(Math.round(Math.ceil((1.00 * Integer.parseInt(parts[2]) / (Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]))))));
		}
	}
}
