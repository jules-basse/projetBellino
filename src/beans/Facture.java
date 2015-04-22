package beans;

public class Facture {

	private int id_facture;
	private String description_role;
	
	
	
	public Facture(int id_facture, String description_role) {
		super();
		this.id_facture = id_facture;
		this.description_role = description_role;
	}
	
	
	public int getId_facture() {
		return id_facture;
	}
	public void setId_facture(int id_facture) {
		this.id_facture = id_facture;
	}
	public String getDescription_role() {
		return description_role;
	}
	public void setDescription_role(String description_role) {
		this.description_role = description_role;
	}
	
	
}
