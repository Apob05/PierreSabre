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

}
