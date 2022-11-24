package metier;

import java.time.LocalDate;

public class Achat {

	Jeu jeu;
	LocalDate date;
	Double prix;
	public Jeu getJeu() {
		return jeu;
	}
	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Achat(Jeu jeu, LocalDate date, Double prix) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + "]";
	}
	
	
	
}
