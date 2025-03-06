<<<<<<< HEAD
package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p117 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int num = Integer.parseInt(line);
		
		for (int i = 0; i < num; i++) {
			
			line = br.readLine();
			String parts[] = line.split(" ");
			
			System.out.println("Hola, " + parts[1] + ".");
		}
	}
}
=======
package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p117 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int num = Integer.parseInt(line);
		
		for (int i = 0; i < num; i++) {
			
			line = br.readLine();
			String parts[] = line.split(" ");
			
			System.out.println("Hola, " + parts[1] + ".");
		}
	}
}
>>>>>>> f02d0a2a8e45d5632a5418d9440059d380dd1379
