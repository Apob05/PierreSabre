package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		/*
		 * marco.faireConnaissancesAvec(roro); marco.faireConnaissancesAvec(yaku);
		 * marco.faireConnaissancesAvec(chonin); marco.faireConnaissancesAvec(kumi);
		 * marco.listerConnaissances(); roro.listerConnaissances();
		 * yaku.listerConnaissances();
		 */
		akimoto.faireConnaissancesAvec(marco);
		akimoto.listerConnaissances();
		akimoto.boire("thé");
	}

}
