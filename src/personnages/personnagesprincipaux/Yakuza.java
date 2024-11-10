package personnages.personnagesprincipaux;

import personnages.Humain;


public class Yakuza extends Humain {
	String clan ; 
	int reputation=0;
	
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
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
    public void extorquer(Commercant commercant) {
        int argentExtorque = commercant.seFaireExtorquer();
        gagnerArgent(argentExtorque);
        reputation++;
        parler("J'ai extorqué " + argentExtorque + " sous de " + commercant.getNom() + ". Ha ha !");
    }
    
    
 // Méthode perdre
    public int perdreDuel() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        reputation--;
        parler("J'ai perdu mon duel... quelle humiliation !");
        return argentPerdu;
    }
	
	public void gagnerDuel() {
        reputation++;
        parler("Victoire ! Personne ne peut me battre, moi le puissant " + getNom() + " !");
    }
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier d'appartenir au clan " + clan + " !");
	}
	
	

    

	
	

	

}
