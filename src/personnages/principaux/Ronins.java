package personnages.principaux;

import personnages.Humain;

public class Ronins extends Humain{
	private int honneur;

	public Ronins(String nom, int argent, String boisson,int honneur) {
		super(nom,argent,boisson);
		this.honneur = honneur;
	}

	

}
