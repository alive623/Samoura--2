package histoires;

import personnages.Humain;
import personnages.personnages.secondaires.*;
import personnages.personnagesprincipaux.*;


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
		  
		  
		  
		  Commercant commercant1 = new Commercant("Taro", 50);
		  Commercant commercant2 = new Commercant("Hana", 30);
	      Ronin ronin1 = new Ronin("Musashi", 20, "thé");
	      Samourai samourai = new Samourai("Akimoto", 30, "saké", "Seigneur Matsudaira");
	      Traitre traitre = new Traitre("Kenshin", 15, "whisky", "Seigneur Nobunaga");
	      GrandMere grandMere = new GrandMere("Mamie Suzume", 100);
	      Colporteur colporteur = new Colporteur("Yoshi", 100);
	      Ninja ninja = new Ninja("Colibri", 0, "cyanure", "Long Fangs");

	      // La grand-mère fait connaissance avec différents personnages
	      grandMere.faireConnaissanceAvec(commercant1);
	      grandMere.faireConnaissanceAvec(commercant2);
	      grandMere.faireConnaissanceAvec(ronin1);
	      grandMere.faireConnaissanceAvec(samourai);
	      grandMere.faireConnaissanceAvec(traitre);

	      // Le traître extorque de l'argent à un commerçant
	      traitre.extorquer(commercant1);
	      traitre.extorquer(commercant2);
	        
	      // Le traître essaie d'augmenter son niveau de traîtrise au maximum
	      traitre.extorquer(commercant1); // Niveau de traîtrise = 3 après cette extorsion
	      traitre.extorquer(commercant2); // Devrait afficher un message d'impossibilité d'extorsion

	      // Le traître tente de réduire son niveau de traîtrise en faisant un don
	      traitre.faireLeGentil(commercant1, 10);

	      // La grand-mère commence à ragoter sur ses connaissances
	      grandMere.ragoter();
	      
	   // Tester l'extorsion du colporteur
	      System.out.println("Avant extorsion, argent du colporteur : " + colporteur.getArgent());
	      traitre.extorquer(colporteur);
	      System.out.println("Après extorsion, argent du colporteur : " + colporteur.getArgent());

	    // Le ninja se présente
	       ninja.direBonjour();
	        

	        
	    }


}


