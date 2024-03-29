package histoire;

import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("Yaku le Noir", "whisky", 15, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		roro.provoquer(yaku);

	}

}
