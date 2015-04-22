package beans;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class panel_utilisateur extends JPanel implements ActionListener{
	private JButton jbvalider, jbquitter;
	private JTextField jtnom, jtid;
	//private ArrayList<String> MonZoo = new ArrayList<String>();
	JPanel panelRadio = new JPanel();
    //Definition des boutons Commercial, Employe, Temporaire
    private JRadioButton jbuser = new JRadioButton("Client");
    private JRadioButton jbadmin = new JRadioButton("Admin");
    private JTextField jtinfonom, jtinfoid;
    private String nom, id;
    private String rien="";
	
	public panel_utilisateur()
	{


		//setLayout(null);
		//panel des statistique
		JPanel panelzoo=new JPanel();
		panelzoo.setLayout(new GridLayout(4, 2));
		panelzoo.add(new JLabel("nom :"));
		panelzoo.add(jtnom=new JTextField());
		panelzoo.add(new JLabel("numero : "));
		panelzoo.add(jtid=new JTextField());
		jtnom.addActionListener(this);
		jtid.addActionListener(this);
		/*Dimension size = panelzoo.getPreferredSize();
		panelzoo.setBounds(10, 10, size.width, size.height);*/
		this.add(panelzoo, BorderLayout.NORTH);
		
		//ajout des boutons au JPanel panel
        panelRadio.add(jbuser);
        panelRadio.add(jbadmin);
        //on ajoute chaque bouton au même groupe
        ButtonGroup group = new ButtonGroup();
        group.add(jbuser);
        group.add(jbadmin);
        jbuser.isSelected();
        //on ajoute le addActionListener sur chaque bouton
        jbuser.addActionListener(this);
        jbadmin.addActionListener(this);
        //GridLyout pour l'organisation des boutons
        panelRadio.setLayout(new GridLayout(1,3,5,5));
        //design sous forme de grille
        this.setLayout(new GridLayout(5,2,5,5));
        this.add(panelRadio, BorderLayout.NORTH);
		
		JPanel panelzoobutton=new JPanel();
		panelzoobutton.setLayout(new GridLayout(3, 3, 5, 5));
		panelzoobutton.add(jbvalider = new JButton("Valider"));
		panelzoobutton.add(jbquitter = new JButton("Quitter"));
		jbvalider.addActionListener(this);
		jbquitter.addActionListener(this);
		this.add(panelzoobutton, BorderLayout.SOUTH);
		/*Dimension size2 = panelzoobutton.getPreferredSize();
		panelzoobutton.setBounds(10,130, size2.width, size2.height);*/
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbquitter)
		{
			System.exit(0);
		}
		else if(e.getSource()==jbvalider)
		{
			nom = jtnom.getText();
			id = jtid.getText();
			if(jbuser.isSelected()==true)
			{
				
				frameinfo info = new frameinfo(nom, id);
				
				/*jtnom.setText(nom);
				jtid.setText(id);*/
				
			}
			else if (jbadmin.isSelected()==true)
			{
				jtnom.setText(rien);
				jtid.setText(rien);
			}
		}
		
	}

}
