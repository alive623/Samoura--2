package personnages.personnagesprincipaux;

import personnages.Humain;

public class Ronin extends Humain{
	private int honneur=1;

	public Ronin(String nom, int argent, String boisson) {
		super(nom,argent,boisson);
	}
	
	

    // Méthode pour donner de l'argent à un commerçant
    public void donnerArgent(int montant,Commercant commercant) {
        if (montant <= getArgent()) {
            perdreArgent(montant);
            commercant.recevoir(montant);
            parler("Voici " + montant + " sous, cher " + commercant.getNom() + ".");
        } else {
            parler("Je n'ai pas assez d'argent pour cette transaction.");
        }
    }

    // Méthode pour provoquer un Yakuza en duel
    public void provoquer(Yakuza yakuza) {
        if (honneur * 2 > yakuza.getReputation()) {
            // Ronin gagne
            int argentGagne = yakuza.perdreDuel();
            gagnerArgent(argentGagne);
            honneur++;
            parler("J'ai gagné le duel contre " + yakuza.getNom() + "! Honneur et justice triomphent !");
        } else {
            // Yakuza gagne
            honneur--;
            yakuza.gagnerDuel();
            parler("J'ai perdu contre " + yakuza.getNom() + "... Mon honneur en souffre.");
        }
    }
	
	

	

}
