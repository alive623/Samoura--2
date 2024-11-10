package histoires;

import personnages.Humain;
import personnages.personnagesprincipaux.Commercant;
import personnages.personnagesprincipaux.Ronin;
import personnages.personnagesprincipaux.Yakuza;

public class MonHistoire {
	

	public static void main(String[] args) {
		Humain humain = new Humain("Prof", 10, "Porto");
		  humain.direBonjour();
		  humain.boire();
		  Commercant commercant = new Commercant("Marchand", 35);
		  commercant.direBonjour();
		  Yakuza yakusa = new Yakuza("Yaku␣le␣noir", 42,
		                             "biere", "WarSong");
		  yakusa.direBonjour();
		  yakusa.extorquer(commercant);
		  Ronin ronin = new Ronin("Roro", 61, "sake");
		  ronin.donnerArgent(10, commercant );
		  ronin.provoquer(yakusa);
		  ronin.direBonjour();

	}

}


