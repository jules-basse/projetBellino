package beans;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	private String type_frame;
	private String nom_frame;
	
	public Frame() {
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Projet");
	    fenetre.setSize(300, 350);
	    fenetre.setLocationRelativeTo(null);
	    panel_utilisateur monPanel = new panel_utilisateur();
	    fenetre.setContentPane(monPanel); 
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		fenetre.setVisible(true);

	}
	public String getTypeFrame() {
		return this.type_frame;
	}
	public void setType(String type) {
		this.type_frame = type_frame;
	}
	public String getNom_frame() {
		return nom_frame;
	}
	public void setNom_frame(String nom_frame) {
		this.nom_frame = nom_frame;
	}
	
	
	
}
