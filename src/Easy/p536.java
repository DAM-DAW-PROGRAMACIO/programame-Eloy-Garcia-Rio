package Easy;

import java.util.Scanner;

class Huerto implements Comparable<Huerto> {

	private int id;
	private int area;
	private int abono;
	private int agua;
	private int distancia;
	private String nombre;

	Huerto(int id, int area, int abono, int agua, int distancia, String nombre) {

		this.id = id;
		this.area = area;
		this.abono = abono;
		this.agua = agua;
		this.distancia = distancia;
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Huerto o) {
		int resultado = 0;

		if (this.area == o.area) {
			if (this.agua == o.agua) {
				if (this.distancia == o.distancia) {
					if (this.abono == o.abono)
						resultado = Integer.compare(-1 * this.id, -1 * o.id);
					else
						resultado = Integer.compare(-1 * this.abono, -1 * o.abono);
				} else
					resultado = Integer.compare(-1 * this.distancia, -1 * o.distancia);
			} else
				resultado = Integer.compare(-1 * this.agua, -1 * o.agua);
		} else
			resultado = Integer.compare(this.area, o.area);

		return resultado;
	}

	public String getNombre() {

		return this.nombre;
	}
}

public class p536 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String linea = sc.nextLine();

		while (true) {

<<<<<<< HEAD
			if (linea.equals("") || Integer.parseInt(linea) <= 0)
=======
			if (linea.equals("") || linea.equals("0"))
>>>>>>> branch 'main' of https://github.com/DAM-DAW-PROGRAMACIO/programame-Eloy-Garcia-Rio
				break;
			else {
				
				int iterador = Integer.parseInt(linea);
				Huerto mejorTerreno = null;
				Huerto lista[] = new Huerto[iterador];

				for (int i = 0; i < iterador; i++)
					lista[i] = new Huerto(i, sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextLine());

				for (int j = 0; j < iterador; j++) {

					if (j == 0)
						mejorTerreno = lista[j];

					if (iterador == 1)
						break;
					else if (j > 0 && mejorTerreno.compareTo(lista[j]) == -1)
						mejorTerreno = lista[j];
				}

				System.out.println(mejorTerreno.getNombre().trim());
				
				linea = sc.nextLine();
			}
		}
		sc.close();
	}
}
