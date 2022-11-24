package test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;
import metier.Salon;

public class Test {

	public static void main(String[] args) {
		
		
		
		Client client2= new Client("Ganondorf","Dragmire");
		Client client1= new Client("Samus","Aranne");
		Console consol1 = new Salon ("consol1", 12, LocalDate.parse("2000-10-31"));
		
		Adresse adresse=new Adresse (8,"Boulevard d'europe","Bordeaux");
		Boutique boutique = new Boutique("NitendoShop",adresse);
		
		Jeu jeu1 = new Jeu("titre1",consol1, boutique);
		Jeu jeu2 = new Jeu("titre2",consol1, boutique);
		Jeu jeu3 = new Jeu("titre3",consol1, boutique);
		Jeu jeu4 = new Jeu("titre4",consol1,boutique);
		Jeu jeu5 = new Jeu("titre5",consol1,boutique);
		
		List<Jeu> jeux=new ArrayList();
		
		Collections.addAll(jeux,jeu1,jeu2,jeu3,jeu4);
		
		client1.setJeux(jeux);


	}

}
