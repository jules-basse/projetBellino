package beans;

import java.util.ArrayList;

public class Contrat extends Prestation{

	private int id_contrat;
	private ArrayList<Prestation> listPrestation;
	
	public int getId_contrat() {
		return id_contrat;
	}
	
	public void setId_contrat(int id_contrat) {
		this.id_contrat = id_contrat;
	}
	
	public ArrayList<Prestation> getListPrestation() {
		return listPrestation;
	}
	
	public void setListPrestation(ArrayList<Prestation> listPrestation) {
		this.listPrestation = listPrestation;
	}
	
	
	//toString à faire avec la classe Prestation de Jules
	
	public double calculTarif(){
		
		double tarifFinal = this.getTarif_prestation() - this.getModificateur_tarif();
		return tarifFinal;
		
	}
	
	
	
}
