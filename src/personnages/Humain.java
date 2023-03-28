package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;

	public Humain(String nom, String boissonFavorite, int argent) {
		super();
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

	public String getBoissonFavorite() {
		return boissonFavorite;
	}

	public void setBoissonFavorite(String boissonFavorite) {
		this.boissonFavorite = boissonFavorite;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return ("(" + nom + ")");
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + " et j’aime boire du " + boissonFavorite);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + getBoissonFavorite() + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("Je possède " + getArgent() + " yens, je peux donc vous acheter ce" + bien + " !");
			this.setArgent(argent - prix);
		}

		else {
			parler("Je n'ai plus que " + 40 + " sous en poche. Je ne peux même pas m'offrir un" + bien + " à " + prix
					+ " yens!");

		}

	}

	public void gagnerArgent(int gain) {
		if (gain >= 0) {
			this.setArgent(argent + gain);
			parler("J'ai maintenant " + getArgent() + " yens!");
		}

	}

	public void perdreArgent(int perte) {
		if (perte >= 0) {
			if (perte > getArgent()) {
				this.setArgent(0);
				parler("Je n'ai plus aucun argent!");
			}

			else {
				this.setArgent(argent - perte);
				parler("Il me reste uniquement " + getArgent() + " yens!");
			}
		}
	}

}
