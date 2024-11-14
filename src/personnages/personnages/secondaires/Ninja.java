package personnages.personnages.secondaires;

import personnages.personnagesprincipaux.Yakuza;
import java.util.Random;

public class Ninja extends Yakuza {
    private static final String[] CLANS_NINJA = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
    private String clanSecret;

    public Ninja(String nom, int argent, String boisson, String clan) {
        super(nom, argent, boisson, clan);
        this.clanSecret = genererClanSecret(clan);
    }

    private String genererClanSecret(String clan) {
        Random random = new Random();
        int index = random.nextInt(CLANS_NINJA.length); // Choisit un suffixe aléatoire
        return clan + " " + CLANS_NINJA[index];
    }

    @Override
    public void direBonjour() {
    	super.direBonjour(); // Appel de la méthode direBonjour() de la classe parente (Yakuza)
        parler("Je fais partie du clan " + getClan());
        parler("(mon clan secret est " + clanSecret + " et maintenant que tu le sais, je vais devoir te tuer)");
    }
}
