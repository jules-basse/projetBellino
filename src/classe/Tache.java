package classe;

public class Tache {
	private String nom, date;
	private boolean estpaye;
	private double prix, prixHT;
	private int quantite;
	
	public Tache()
	{
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isEstpaye() {
		return estpaye;
	}
	public void setEstpaye(boolean estpaye) {
		this.estpaye = estpaye;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getPrixHT() {
		return prixHT;
	}
	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	

}
