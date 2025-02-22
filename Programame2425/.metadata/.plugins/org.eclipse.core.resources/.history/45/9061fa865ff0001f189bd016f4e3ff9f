package Easy;

import java.util.Scanner;

public class p245 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long line = sc.nextLong();

		while (line != 0) {

			boolean esDalton = false;
			long start = sc.nextLong();
			long next = sc.nextLong();
			long counter = 2;

			while (counter < line) {
				esDalton = start < next;

				if (!esDalton) {
					esDalton = false;
					break;
				}

				start = next;
				next = sc.nextLong();
				counter++;
			}

			if (esDalton) {
				System.out.println("DALTON");
				line = sc.nextLong();
			} else {
				System.out.println("DESCONOCIDOS");
				sc.nextLine();
				line = sc.nextLong();
			}
		}
		sc.close();
	}
}
