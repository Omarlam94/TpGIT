package metier;

import java.util.ArrayList;
import java.util.List;

public class Client {

	
	private String nom;
	private String prenom;
	private List<Jeu> jeux=new ArrayList();
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public Client(String nom, String prenom, List<Jeu> jeux) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.jeux = jeux;
	}
	public List<Jeu> getJeux() {
		return jeux;
	}
	public void setJeux(List<Jeu> jeux) {
		this.jeux = jeux;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", jeux=" + jeux + "]";
	}
	
}
