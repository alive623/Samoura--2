package personnages.personnagesprincipaux;

public class Samourai extends Ronin{
	String seigneur;

	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	@Override
    public void direBonjour() {
        super.direBonjour();
        parler("Je sers mon seigneur " + seigneur + ".");
    }

    // Surcharge de la méthode boire
    public void boire(String boisson ) {
        parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
    }
    
    public static void main(String[] args) {
    	Samourai musashi = new Samourai("Musashi", 150 ,"thé", "Miyamoto");
        System.out.println("Test avec un objet Samourai :");
        musashi.direBonjour();  // Appel de direBonjour() redéfini dans Samourai
        musashi.boire();        // Appel de boire() de Humain (hérité sans redéfinition)
        musashi.boire("bière"); // Appel de boire(String boisson) surchargé dans Samourai
    	
    	
    }
	
	
	
	
	

}
