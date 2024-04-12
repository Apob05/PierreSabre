package histoire;

import personnages.Commercant;
import personnages.GrandMere;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);
		grandMere.faireConnaissancesAvec(akimoto);
		grandMere.faireConnaissancesAvec(yaku);
		grandMere.faireConnaissancesAvec(masako);
		grandMere.faireConnaissancesAvec(kumi);
		grandMere.faireConnaissancesAvec(marco);
		grandMere.faireConnaissancesAvec(chonin);
		grandMere.ragoter();

	}

}
