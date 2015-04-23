package beans;

import javax.swing.JFrame;

public class frameinfoadmin extends JFrame{
	private JFrame fenetre;
	
	public frameinfoadmin(){
		fenetre = new JFrame();
		String nom ="";
		String id= "";
		fenetre.setTitle("Info");
	    fenetre.setSize(330, 260);
	    fenetre.setLocationRelativeTo(null);
	    panelinfoadmin monPanel = new panelinfoadmin(nom, id, this);
	    fenetre.setContentPane(monPanel);   
		fenetre.setVisible(true);
	}
	
	public void getinfoclient()
	{
		fenetre.setTitle("Liste client");
	}

}
