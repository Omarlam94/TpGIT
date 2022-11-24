package metier;

import java.time.LocalDate;

public class Salon extends Console {

	public Salon(String nom, double prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Salon [getPrix()=" + getPrix() + ", getDateSortie()=" + getDateSortie() + ", getNom()=" + getNom()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
