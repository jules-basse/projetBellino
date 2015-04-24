package beans;

import javax.swing.JFrame;

import panel.panel_contrat;

public class frame_contrat extends JFrame{
	
	private String type_frame;
	private String nom_frame;
	private JFrame fenetre;
	
	public frame_contrat() {
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Info");
		fenetre.setSize(300, 280);
	    fenetre.setLocationRelativeTo(null);
	    panel_contrat monPanel = new panel_contrat();
	    fenetre.setContentPane(monPanel); 
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		fenetre.setVisible(true);
		fenetre.setResizable(false);
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
