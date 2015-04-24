package panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class panel_prestation extends JPanel implements ActionListener{
	private JButton jbvalider, jbquitter;
	private JTextField jtNom , jtPrestation, jtTarif;
	JPanel panelRadio = new JPanel();
    private JRadioButton jbuser = new JRadioButton("Client");
    private JRadioButton jbadmin = new JRadioButton("Admin");
    private String nom, id;
    private String rien="";
	
	public panel_prestation()
	{
		JPanel panel_prestation=new JPanel();

		//grille champs nom et numero
		panel_prestation.setLayout(new GridLayout(6,1,0,8));
		
		// Champs Nom
		panel_prestation.add(new JLabel("Nom : "));
		panel_prestation.add(jtNom=new JTextField());
		jtNom.addActionListener(this);
						
		// Champs Prestation
		panel_prestation.add(new JLabel("Prestation : "));
		panel_prestation.add(jtPrestation=new JTextField());
		jtPrestation.addActionListener(this);
		
		// Champs Tarif
		panel_prestation.add(new JLabel("Tarif : "));
		panel_prestation.add(jtTarif=new JTextField());
		jtTarif.addActionListener(this);
		
		jtNom.setPreferredSize(new Dimension(120,20));
		this.add(panel_prestation);
		
	    // boutons validation et quitter
	    JPanel panel_prestation_button=new JPanel();
	    panel_prestation_button.add(jbvalider = new JButton("Ajouter"));
	    panel_prestation_button.add(jbquitter = new JButton("Quitter"));
	    jbvalider.addActionListener(this);
		jbquitter.addActionListener(this);
		jbvalider.setPreferredSize(new Dimension(100,20));
		jbquitter.setPreferredSize(new Dimension(100,20));
		
		this.add(panel_prestation_button, BorderLayout.NORTH);
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
