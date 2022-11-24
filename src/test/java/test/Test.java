package test;


import java.time.LocalDate;

import metier.Client;
import metier.Console;
import metier.Jeu;
public class Test {

	public static void main(String[] args) {
		Client client2= new Client("Ganondorf","Dragmire");
		Client client1= new Client("Samus","Aranne");
		Console consol1 = new Console("consol1", 12, LocalDate.parse("2000-10-31"));
		
		Jeu jeu1 = new Jeu("titre1",consol1);
		Jeu jeu2 = new Jeu("titre2",consol1);
		Jeu jeu3 = new Jeu("titre3",consol1);
		Jeu jeu4 = new Jeu("titre4",consol1);
		Jeu jeu5 = new Jeu("titre5",consol1);

		
	}

}
