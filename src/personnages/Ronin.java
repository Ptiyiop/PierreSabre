package personnages;

public class Ronin extends Humain {

	private int honneur = 1;

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}

	public void donner(Commercant commercant) {
		int argent = getArgent();
		int a_donner = argent / 10;

		perdreArgent(a_donner);

		honneur += 1;
		parler(commercant.getNom() + " prend ces " + a_donner + " yens.");

		commercant.recevoirArgent(a_donner);

	}

	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		
		if (honneur * 2 > adversaire.getReputation()) {
			parler("Je t'ai eut petit yakuza !");
			gagnerArgent(adversaire.getArgent());
			adversaire.perdreArgent(adversaire.getArgent());
			honneur += 1;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			int ar = getArgent();
			adversaire.gagnerArgent(ar);
			perdreArgent(ar);
			honneur -= 1;
		}
	}
}