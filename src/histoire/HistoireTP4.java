package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {

		Humain Prof;
		Prof = new Humain("Prof", "kombucha", 54);
//		Prof.direBonjour();
//		Prof.acheter("boisson", 12);
//		Prof.boire();
//		Prof.acheter("jeu", 2);
//		Prof.acheter("Kimono", 50);

		Commercant Marco;
		Marco = new Commercant("Marco", 0);
//		Marco.direBonjour();
//		Marco.seFaireExtorquer();
//		Marco.recevoirArgent(15);
//		Marco.boire();
		
		Yakuza Yaku;
		Yaku = new Yakuza("Yaku Le Noir", "whisky",	30);
//		Yaku.direBonjour();
//		Yaku.extorquer(Marco);
		
		Ronin Roro;
		Roro = new Ronin("Roro", "shochu", 60);
//		Roro.direBonjour();
//		Roro.donner(Marco);
		
		Roro.provoquer(Yaku);
		
	}
	

		
}
