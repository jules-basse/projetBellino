package beans;

import javax.swing.JFrame;

import panel.panel_utilisateur;

public class Frame extends JFrame{
	
	private String type_frame;
	private String nom_frame;
	private JFrame fenetre;
	
	public Frame() {
		fenetre = new JFrame();
		fenetre.setTitle("Projet");
	    fenetre.setSize(300, 180);
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
