package metier;

public class Boutique {
	private String nom;
	private Adresse adresse;
	public String getNom() {
		return nom;
	}
	
	public Boutique(String nom, Adresse adresse) {
		this.nom = nom;
        this.adresse=adresse;
	}
	public void setNom(String nom) {
	
		this.nom = nom;
	}
	public Adresse getadresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		adresse = adresse;
	}
	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", Adresse=" + adresse + "]";
	}
	
	
	

}
