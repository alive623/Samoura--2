package personnages.personnages.secondaires;

import personnages.Humain;
import personnages.personnagesprincipaux.*;

public class Traitre extends Samourai {
    private int niveauTraitrise = 0;

    public Traitre(String nom, int argent,  String boisson,String seigneur) {
        super(nom,argent,boisson, seigneur);
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        parler("Je suis un traître avec un niveau de traîtrise de " + niveauTraitrise + ".");
    }

    public void extorquer(Commercant commercant) {
        if (niveauTraitrise < 3) {
            int argentExtorque = commercant.seFaireExtorquer();
            this.gagnerArgent(argentExtorque);
            niveauTraitrise++;
            parler(getNom() + " extorque " + commercant.getNom() + " et augmente son niveau de traîtrise à " + niveauTraitrise + ".");
        } else {
            parler(getNom() + " a atteint le niveau maximal de traîtrise et ne peut plus extorquer.");
        }
    }

    public void faireLeGentil(Humain humain, int montantDon) {
        if (montantDon <= getArgent()) {
            this.perdreArgent(montantDon);
            humain.gagnerArgent(montantDon);
            int reductionTraitrise = montantDon / 10;
            niveauTraitrise -= reductionTraitrise;
            if (niveauTraitrise < 0) niveauTraitrise = 0;
            parler(getNom() + " fait ami-ami avec " + humain.getNom() + " en lui offrant " + montantDon + " sous, ce qui réduit son niveau de traîtrise à " + niveauTraitrise + ".");
        } else {
            parler(getNom() + " n'a pas assez d'argent pour faire un don de " + montantDon + " sous.");
        }
    }
}
