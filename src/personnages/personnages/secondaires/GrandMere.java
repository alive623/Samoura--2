package personnages.personnages.secondaires;

import personnages.Humain;
import personnages.personnagesprincipaux.*;
import java.util.Random;

public class GrandMere extends Humain {
    private Humain[] memoire = new Humain[30];
    private int nbConnaissances = 0;

    public GrandMere(String nom, int argent) {
        super(nom, argent, "tisane"); // La grand-mère boit uniquement de la tisane
    }

    // Méthode pour faire connaissance avec un autre humain
    public void faireConnaissanceAvec(Humain humain) {
        if (nbConnaissances < memoire.length) {
        	memoire[nbConnaissances] = humain;
        	nbConnaissances++;
            parler(getNom() + " fait connaissance avec " + humain.getNom() + ".");
        } else {
            parler(getNom() + " ne peut plus faire de nouvelles connaissances. Mémoire pleine !");
        }
    }

    // Méthode pour ragoter sur les humains connus
    public void ragoter() {
        parler(getNom() + " commence à ragoter sur les humains qu'elle connaît...");
        for (int i = 0; i < nbConnaissances; i++) {
            Humain humain = memoire[i];
            if (humain != null) {
                if (humain instanceof Traitre) {
                    System.out.println("Je sais que " + humain.getNom() + " est un traître !");
                } else {
                    String type = humainHasard(); // Génère un type aléatoire pour les autres
                    System.out.println("Je crois que " + humain.getNom() + " est un " + type + ".");
                }
            }
        }
    }

    // Méthode privée pour générer un type aléatoire d'humain
    private String humainHasard() {
        Random random = new Random();
        int type = random.nextInt(4); // Génère un nombre entre 0 et 3
        return switch (type) {
            case 0 -> "Commerçant";
            case 1 -> "Ronin";
            case 2 -> "Samouraï";
            case 3 -> "Yakuza";
            default -> "Inconnu"; // Cas de sécurité
        };
    }
}
