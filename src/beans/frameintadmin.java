package beans;

import javax.swing.JFrame;

import panel.panelinfoadmin;

public class frameintadmin extends JFrame{


	private String type_frame;
	private String nom_frame;
	private JFrame fenetre;
	
	public frameintadmin(String nom, String id) {
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Info");
	    fenetre.setSize(330, 260);
	    fenetre.setLocationRelativeTo(null);
	    panelinfoadmin monPanel = new panelinfoadmin(nom, id, this);
	    fenetre.setContentPane(monPanel);   
		fenetre.setVisible(true);
}
	

	
	public String getTypeFrame() {
		return this.type_frame;
	}
	public void setType(String type) {
		this.type_frame = type;
	}
	public String getNom_frame() {
		return nom_frame;
	}
	public void setNom_frame(String nom_frame) {
		this.nom_frame = nom_frame;
	}
}
