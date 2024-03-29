package histoire;

import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marcos = new Commercant("Marcos", 15);
		Yakuza yaku = new Yakuza("Yaku la Noir", "Whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yaku.extorquer(marcos);
	}

}
