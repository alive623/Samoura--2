package personnages.principaux;

import personnages.Humain;


public class Yakuzas extends Humain {
	String clan ; 
	int reputation=0;
	
	
	public Yakuzas(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}


	public String getClan() {
		return clan;
	}


	public int getReputation() {
		return reputation;
	}
	
	// Méthode extorquer
    public void extorquer(Commerçants commercant) {
        int argentExtorque = commercant.seFaireExtorquer();
        gagnerArgent(argentExtorque);
        reputation++;
        parler("J'ai extorqué " + argentExtorque + " sous de " + commercant.getNom() + ". Ha ha !");
    }
	
	public void gagnerDuel() {
        reputation++;
        parler("Victoire ! Personne ne peut me battre, moi le puissant " + getNom() + " !");
    }

    // Méthode perdre
    public int perdreDuel() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        reputation--;
        parler("J'ai perdu mon duel... quelle humiliation !");
        return argentPerdu;
    }

	
	

	

}
