package panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class panel_facture extends JPanel implements ActionListener{
	private JButton jbvalider, jbquitter;
	private JTextField jtId , jtFournisseur, jtClient1, jtClient2;
	private ArrayList listeTaches = new ArrayList();
	
	public panel_facture()
	{
		JPanel panel_facture=new JPanel();

		//grille champs nom et numero
		panel_facture.setLayout(new GridLayout(6,1,0,8));
		
		// Champs ID
		panel_facture.add(new JLabel("ID :"));
		panel_facture.add(jtId=new JTextField());
		jtId.addActionListener(this);
		
		// Champs Fournisseur
		panel_facture.add(new JLabel("Fournisseur : "));
		panel_facture.add(jtFournisseur=new JTextField());
		jtFournisseur.addActionListener(this);
		
		// Champs Nom
		panel_facture.add(new JLabel("Nom : "));
		panel_facture.add(jtFournisseur=new JTextField());
		jtFournisseur.addActionListener(this);
				
		// Champs Siret
		panel_facture.add(new JLabel("SIRET : "));
		panel_facture.add(jtFournisseur=new JTextField());
		jtFournisseur.addActionListener(this);
		
		// Champs Nom 2
		panel_facture.add(new JLabel("Nom 2 : "));
		panel_facture.add(jtFournisseur=new JTextField());
		jtFournisseur.addActionListener(this);
						
		// Champs Siret 2
		panel_facture.add(new JLabel("SIRET 2 : "));
		panel_facture.add(jtFournisseur=new JTextField());
		jtFournisseur.addActionListener(this);
		
		jtId.setPreferredSize(new Dimension(120,20));
		this.add(panel_facture);
		
        // boutons validation et quitter
        JPanel panel_contrat_button=new JPanel();
        panel_contrat_button.add(jbvalider = new JButton("Ajouter"));
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
			Window window = SwingUtilities.windowForComponent(this);
			if (window instanceof JFrame) {
				JFrame frame = (JFrame) window;
		 
				frame.setVisible(false);
				frame.dispose();
			}		
		}
		
	}
}
