package metier;

import java.time.LocalDate;

public class Portable extends Console {

	public Portable(String nom, double prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Portable [getPrix()=" + getPrix() + ", getDateSortie()=" + getDateSortie() + ", getNom()=" + getNom()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
	
}
