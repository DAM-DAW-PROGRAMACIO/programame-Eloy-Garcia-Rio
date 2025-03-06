package Easy;

import java.util.Scanner;
import java.util.Stack;

public class p141 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		while (sc.hasNext()) {
			
			String linia = sc.nextLine();
			int popCounter = 0;
			Stack<Character> parentesis = new Stack<Character>();
			
			for (int i = 0; i < linia.length(); i++) {
				
				char simbolo = linia.charAt(i);
				
				if (simbolo == '(' || simbolo == '[' || simbolo == '{')
					parentesis.push(simbolo);
				
				if (!parentesis.isEmpty()) {
					
					boolean parentesisCerrado = simbolo == ')' && parentesis.lastElement() == '(';
					boolean corcheteCerrado = simbolo == ']' && parentesis.lastElement() == '[';
					boolean claudatorCerrado = simbolo == '}' && parentesis.lastElement() == '{';

					if (parentesisCerrado || corcheteCerrado || claudatorCerrado) {
						parentesis.pop();
						popCounter++;
					}
				}
			}
			
			if (parentesis.isEmpty() && popCounter > 0)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		sc.close();
	}
}
