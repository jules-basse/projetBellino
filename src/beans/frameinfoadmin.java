package beans;

import javax.swing.JFrame;

import panel.panelchoixadmin;
import panel.panelinfoadmin;

public class frameinfoadmin extends JFrame{
	private JFrame fenetre;
	
	public frameinfoadmin(String type){
		fenetre = new JFrame();
		String nom ="";
		String id= "";
		fenetre.setTitle("Info");
	    fenetre.setSize(330, 260);
	    fenetre.setLocationRelativeTo(null);
	    
	    
	    panelchoixadmin monPanel = new panelchoixadmin(type);
	    fenetre.setContentPane(monPanel);   
		fenetre.setVisible(true);
	}
	
	public void getinfo(String nom)
	{
		String titre = "Liste " + nom;
		fenetre.setTitle(titre);
	}

}
