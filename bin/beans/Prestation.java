package beans;

public class Prestation {
	
	private String nom_prestation;
	private String description_presation;
	private double tarif_prestation;
	private int modificateur_tarif;
	private int tarif_global_prestation;
	
	
	public String getNom_prestation() {
		return nom_prestation;
	}
	public void setNom_prestation(String nom_prestation) {
		this.nom_prestation = nom_prestation;
	}
	public String getDescription_presation() {
		return description_presation;
	}
	public void setDescription_presation(String description_presation) {
		this.description_presation = description_presation;
	}
	public double getTarif_prestation() {
		return tarif_prestation;
	}
	public void setTarif_prestation(double tarif_prestation) {
		this.tarif_prestation = tarif_prestation;
	}
	public int getModificateur_tarif() {
		return modificateur_tarif;
	}
	public void setModificateur_tarif(int modificateur_tarif) {
		this.modificateur_tarif = modificateur_tarif;
	}
	public int getTarif_global_prestation() {
		return tarif_global_prestation;
	}
	public void setTarif_global_prestation(int tarif_global_prestation) {
		this.tarif_global_prestation = tarif_global_prestation;
	}
	

}
