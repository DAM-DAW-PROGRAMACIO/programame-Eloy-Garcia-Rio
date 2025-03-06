package Easy;

import java.util.HashMap;
import java.util.Scanner;

public class p109 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		HashMap<String, Integer> liga = new HashMap<>();
		String partido, equipoL, equipoV, ganador = "";
		int setsL, setsV, pJugados, pNoJugados, maxPuntos; 
		
		while (!sc.nextLine().equals("FIN")) {

			liga.clear();
			pJugados = 0;
			while (!(partido = sc.nextLine()).trim().equals("FIN")) {
				
				equipoL = partido.split(" ")[0];
				setsL = Integer.parseInt(partido.split(" ")[1]);
				equipoV = partido.split(" ")[2];
				setsV = Integer.parseInt(partido.split(" ")[3]);
				
				if (!liga.containsKey(equipoL))
					liga.put(equipoL, 0);
				if (!liga.containsKey(equipoV))
					liga.put(equipoV, 0);
				
				if (setsL > setsV) {
					liga.put(equipoL, liga.get(equipoL) + 2);
					liga.put(equipoV, liga.get(equipoL) + 1);
				}
				else {
					liga.put(equipoL, liga.get(equipoL) + 1);
					liga.put(equipoV, liga.get(equipoL) + 2);
				}
				pJugados++;
			}
			pNoJugados = liga.size() * (liga.size() - 1) - pJugados;
			
			maxPuntos = 0;
			for (String equipo : liga.keySet()) {
				if (liga.get(equipo) > maxPuntos) {
					maxPuntos = liga.get(equipo);
					ganador = equipo;
				}
				else if (liga.get(equipo) == maxPuntos) {
					ganador = "EMPATE";
					break;
				}
			}
				
			System.out.printf("%s %d\n", ganador, pNoJugados);
			
		}
		sc.close();
	}
}
