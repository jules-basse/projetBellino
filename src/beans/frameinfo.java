package beans;

import javax.swing.JFrame;

public class frameinfo extends JFrame{
	
	private String type_frame;
	private String nom_frame;
	private JFrame fenetre;
	
	public frameinfo(String nom, String id) {
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Info");
		fenetre.setSize(300, 180);
	    fenetre.setLocationRelativeTo(null);
	    panelinfo monPanel = new panelinfo(nom, id, this);
	    fenetre.setContentPane(monPanel); 
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
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
