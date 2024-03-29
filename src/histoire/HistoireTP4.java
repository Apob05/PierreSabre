package histoire;

import personnages.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marcos = new Commercant("Marcos", 20);
		marcos.direBonjour();
		marcos.seFaireExtorquer();
		marcos.recevoir(15);
		marcos.boire();
	}

}
