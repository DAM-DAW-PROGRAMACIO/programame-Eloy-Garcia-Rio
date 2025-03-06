package Easy;

import java.util.Scanner;

public class p458 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int casos = sc.nextInt();
		
		while (casos > 0) {
			
			long nums[] = new long[casos];
			long maxMult = Long.MIN_VALUE;
			
			for (int i = 0; i < casos; i++)
				nums[i] = sc.nextInt();
			
			for (int j = 0; j < casos; j++) {
				for (int k = 0; k < casos; k++) {
					if (j != k && nums[j] * nums[k] > maxMult)
						maxMult = nums[j] * nums[k];
				}
			}
			System.out.println(maxMult);
			casos = sc.nextInt();
		}
		sc.close();
	}
}
