package beans;

public class Entreprise {

	private int id_entreprise;
	private String siret_client;
	private String raison_sociale_client;
	private String adresse_client;
	private String telephone_client;
	
	
	
	
	public Entreprise(int id_entreprise, String siret_client,
			String raison_sociale_client, String adresse_client,
			String telephone_client) {
		
		super();
		this.id_entreprise = id_entreprise;
		this.siret_client = siret_client;
		this.raison_sociale_client = raison_sociale_client;
		this.adresse_client = adresse_client;
		this.telephone_client = telephone_client;
	}

	public int getId_entreprise() {
		return id_entreprise;
	}
	
	public void setId_entreprise(int id_entreprise) {
		this.id_entreprise = id_entreprise;
	}
	public String getSiret_client() {
		return siret_client;
	}
	
	public void setSiret_client(String siret_client) {
		this.siret_client = siret_client;
	}
	
	public String getRaison_sociale_client() {
		return raison_sociale_client;
	}
	
	public void setRaison_sociale_client(String raison_sociale_client) {
		this.raison_sociale_client = raison_sociale_client;
	}
	
	public String getAdresse_client() {
		return adresse_client;
	}
	
	public void setAdresse_client(String adresse_client) {
		this.adresse_client = adresse_client;
	}
	
	public String getTelephone_client() {
		return telephone_client;
	}
	
	public void setTelephone_client(String telephone_client) {
		this.telephone_client = telephone_client;
	}
	
	
	
}
