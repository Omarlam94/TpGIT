package metier;

import java.time.LocalDate;

public class Hybride extends Console {

	public Hybride(String nom, double prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hybride [getPrix()=" + getPrix() + ", getDateSortie()=" + getDateSortie() + ", getNom()=" + getNom()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
