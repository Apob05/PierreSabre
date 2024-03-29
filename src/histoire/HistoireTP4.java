package histoire;

import personnages.Commercant;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marcos = new Commercant("Marcos", 15);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marcos);
	}

}
