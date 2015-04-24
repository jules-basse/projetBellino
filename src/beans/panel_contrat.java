package beans;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class panel_contrat extends JPanel implements ActionListener{
	private JButton jbvalider, jbquitter;
	private JTextField jtId , jtFournisseur, jtNom, jtSiret;
	JPanel panelRadio = new JPanel();
    private JRadioButton jbuser = new JRadioButton("Client");
    private JRadioButton jbadmin = new JRadioButton("Admin");
    private String nom, id;
    private String rien="";
	
	public panel_contrat()
	{
		JPanel panel_contrat=new JPanel();

		//grille champs nom et numero
		panel_contrat.setLayout(new GridLayout(6,1,0,8));
		
		// Champs ID
		panel_contrat.add(new JLabel("ID :"));
		panel_contrat.add(jtId=new JTextField());
		jtId.addActionListener(this);
		
		// Champs Fournisseur
		panel_contrat.add(new JLabel("Fournisseur : "));
		panel_contrat.add(jtFournisseur=new JTextField());
		jtFournisseur.addActionListener(this);
		
		// Champs Nom
		panel_contrat.add(new JLabel("Nom : "));
		panel_contrat.add(jtFournisseur=new JTextField());
		jtFournisseur.addActionListener(this);
				
		// Champs Siret
		panel_contrat.add(new JLabel("SIRET : "));
		panel_contrat.add(jtFournisseur=new JTextField());
		jtFournisseur.addActionListener(this);
		
		// Champs Nom 2
		panel_contrat.add(new JLabel("Nom 2 : "));
		panel_contrat.add(jtFournisseur=new JTextField());
		jtFournisseur.addActionListener(this);
						
		// Champs Siret 2
		panel_contrat.add(new JLabel("SIRET 2 : "));
		panel_contrat.add(jtFournisseur=new JTextField());
		jtFournisseur.addActionListener(this);
		
		jtId.setPreferredSize(new Dimension(120,20));
		this.add(panel_contrat);
		
        // boutons validation et quitter
        JPanel panel_contrat_button=new JPanel();
        panel_contrat_button.add(jbvalider = new JButton("Valider"));
        panel_contrat_button.add(jbquitter = new JButton("Quitter"));
		jbvalider.addActionListener(this);
		jbquitter.addActionListener(this);
		jbvalider.setPreferredSize(new Dimension(100,20));
		jbquitter.setPreferredSize(new Dimension(100,20));
		
		this.add(panel_contrat_button, BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbquitter)
		{
			System.exit(0);
		}/*
		else if(e.getSource()==jbvalider)
		{
			nom = jtnom.getText();
			id = jtid.getText();
			if(jbuser.isSelected()==true)
			{
				frameinfo info = new frameinfo(nom, id);
			}
			else if (jbadmin.isSelected()==true)
			{
				jtnom.setText(rien);
				jtid.setText(rien);
			}
		}*/
		
	}
}
