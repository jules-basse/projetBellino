package beans;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class panelinfoadmin extends JPanel implements ActionListener{
		private JButton jbvalider, jbquitter;
		
		public panelinfoadmin(String nom, String numero, JFrame frame)
		{
			JPanel paneluser=new JPanel();

			//grille champs nom et numero
			paneluser.setLayout(new GridLayout(2,1,0,8));
			
			// Champs nom
			paneluser.add(new JLabel("Nom :"));
			paneluser.add(jtnom=new JTextField());
			jtnom.addActionListener(this);
			
			// Champs numero
			paneluser.add(new JLabel("Numero : "));
			paneluser.add(jtid=new JTextField());
			jtid.addActionListener(this);
			
			jtnom.setPreferredSize(new Dimension(120,20));
			this.add(paneluser);
			
			// boutons radio
	        panelRadio.add(jbuser);
	        panelRadio.add(jbadmin);

	        ButtonGroup group = new ButtonGroup();
	        group.add(jbuser);
	        group.add(jbadmin);
	        jbuser.isSelected();
	        
	        jbuser.addActionListener(this);
	        jbadmin.addActionListener(this);
	        
	        panelRadio.setLayout(new GridLayout(1,2));
	        this.add(panelRadio, BorderLayout.NORTH);
			
	        // boutons validation et quitter
	        JPanel paneluserbutton=new JPanel();
			paneluserbutton.add(jbvalider = new JButton("Valider"));
			paneluserbutton.add(jbquitter = new JButton("Quitter"));
			jbvalider.addActionListener(this);
			jbquitter.addActionListener(this);
			jbvalider.setPreferredSize(new Dimension(100,20));
			jbquitter.setPreferredSize(new Dimension(100,20));
			
			this.add(paneluserbutton, BorderLayout.NORTH);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}

}
