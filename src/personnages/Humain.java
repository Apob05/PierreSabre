package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissances = 0;
	protected Humain[] memoire = new Humain[30];

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ")- " + texte);
	}

	public void direBonjour() {
		parler("Bonjour! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'o rir une " + bien + " à " + prix + " sous");
			argent -= prix;
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'o ffrir un " + bien + " à "
					+ prix + " sous");
		}
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public void faireConnaissancesAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);

	}

	protected void memoriser(Humain humain) {
		if (nbConnaissances < memoire.length) {
			memoire[nbConnaissances] = humain;
			nbConnaissances++;

		} else {
			for (int i = 0; i < nbConnaissances - 1; i++) {
				memoire[i] = memoire[i + 1];
			}
			memoire[nbConnaissances - 1] = humain;
		}
	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);

	}

	public void listerConnaissances() {
		String connues = "";
		for (int i = 0; i < nbConnaissances; i++) {
			connues += memoire[i].getNom();
			if (i < nbConnaissances - 1) {
				connues += ", ";

			}

		}
		parler("Je connais beaucoup de monde dont : " + connues);

	}

}
