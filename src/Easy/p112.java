package Easy;

import java.util.Scanner;

public class p112 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double distancia, velMax, tiempo, velMedia;
		
        while (true) {
            distancia = sc.nextInt();
            velMax = sc.nextInt();
            tiempo = sc.nextInt();

            if (distancia == 0 && velMax == 0 && tiempo == 0) {
                break;
            }

            if (distancia <= 0 || velMax <= 0 || tiempo <= 0) {
                System.out.println("ERROR");
            } 
            else {
                velMedia = (distancia / 1000) / (tiempo / 3600);
                if (velMax >= velMedia) {
                    System.out.println("OK");
                } 
                else if (velMedia < velMax * 1.2) {
                    System.out.println("MULTA");
                } 
                else {
                    System.out.println("PUNTOS");
                }
            }
        }
		sc.close();
	}
}
