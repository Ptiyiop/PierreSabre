package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return argent;
	}

	public void recevoirArgent(int gain) {
		this.gagnerArgent(gain);
		parler( gain+" yens ! Je te remercie généreux donateur!");
	}
	
	
	
}
