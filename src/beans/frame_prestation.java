package beans;

import javax.swing.JFrame;

import panel.panel_prestation;

public class frame_prestation {
	private String type_frame;
	private String nom_frame;
	private JFrame fenetre;
	
	public frame_prestation() {
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Frame Prestation");
		fenetre.setSize(300, 280);
	    fenetre.setLocationRelativeTo(null);
	    panel_prestation monPanel = new panel_prestation();
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
