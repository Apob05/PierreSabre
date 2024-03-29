package personnages;

public class Ronin extends Humain {

	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentDonner = getArgent() * 10 / 100;
		perdreArgent(argentDonner);
		parler(beneficiaire.getNom() + " prend ces " + argentDonner + " sous");
		beneficiaire.recevoir(argentDonner);
	}

	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		if (force >= adversaire.getReputation()) {
			int argentGaner = adversaire.perdre();
			gagnerArgent(argentGaner);
			honneur++;
			parler("J'ai gagne " + argentGaner + " sous en battent le Yakuza " + adversaire.getNom());
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			honneur--;
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
		}

	}
}
