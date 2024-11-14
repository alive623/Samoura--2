package personnages.personnages.secondaires;

import personnages.personnagesprincipaux.Commercant;

public class Colporteur extends Commercant {
    public Colporteur(String nom, int argent) {
        super(nom, argent);
    }

    @Override
    public int seFaireExtorquer() {
        int argentExtorque = getArgent() / 2;
        perdreArgent(argentExtorque);
        parler("Ha ha ! Je ne donne que la moitié de mon argent, l'autre moitié est cachée bien au chaud !");
        return argentExtorque;
    }
}

