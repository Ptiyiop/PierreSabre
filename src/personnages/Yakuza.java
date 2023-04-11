package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=4;
	public Yakuza(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	public String getClan() {
		return clan;
	}
	public void setClan(String clan) {
		this.clan = clan;
	}
	public int getReputation() {
		return reputation;
	}
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() +", si tu tiens à la vie donne moi ta bourse !");
		int vol = victime.seFaireExtorquer();
		this.gagnerArgent(vol);
		parler("J’ai piqué les " +vol+ " yens de Marco, ce qui me fait " + getArgent() +" yens dans ma poche. Hi ! Hi !");
		this.reputation += 1;
	}
	
	public int perdre() {
		int arg = this.getArgent();
		this.perdreArgent(arg);
		reputation -= 1;
		parler("J’ai perdu mon duel et mes "+getArgent()+" yens, snif... J'ai déshonoré le clan de " +clan+".");
		return arg;	
	}
	
	public void gagner(int gain) {
		this.reputation +=1;
		this.gagnerArgent(gain);
		parler("J'ai gagné!");
		
	}
	
}
