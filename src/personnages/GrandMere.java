package personnages;

import java.util.Random;

public class GrandMere extends Humain {

	private Humain[] memoire = new Humain[5];
	private int nbConnaissances = 0;

	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}

	@Override
	protected void memoriser(Humain humain) {
		if (nbConnaissances < memoire.length) {
			memoire[nbConnaissances] = humain;
			nbConnaissances++;

		} else {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}

	private enum TypeHumain {
		RONIN("ronin"), COMMERCANT("commercant"), GRANDMERE("grand-mere"), SAMOURAI("samourai"), TRAITRE("traitre"),
		YAKUZA("yakuza");

		private String nom;

		private TypeHumain(String nom) {
			this.nom = nom;
		}

		public String toString(TypeHumain typeHumain) {
			return typeHumain.nom;
		}

	}

	String humainHasard() {
		Random objRandom = new Random();
		int longueurEnum = TypeHumain.values().length;
		int indiceRandom = objRandom.nextInt(longueurEnum);
		return TypeHumain.values()[indiceRandom].toString(TypeHumain.values()[indiceRandom]);
	}

	public void ragoter() {
		for (int i = 0; i < nbConnaissances; i++) {
			parler("Je crois que " + memoire[i].getNom() + " est un " + humainHasard());
		}
	}

}
