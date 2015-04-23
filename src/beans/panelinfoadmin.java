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
		private JButton jbclient, jbcontrat, jbprestation, jbfacture, jbquitter;
		
		public panelinfoadmin(String nom, String numero, JFrame frame)
		{
			JPanel paneladmin=new JPanel();
			paneladmin.add(jbclient = new JButton("gestion des clients"));
			paneladmin.add(jbcontrat = new JButton("gestion des contrats"));
			paneladmin.add(jbprestation = new JButton("gestion des prestations"));
			paneladmin.add(jbfacture = new JButton("gestion des factures"));
			
			paneladmin.add(jbquitter = new JButton("Quitter"));
			jbclient.addActionListener(this);
			jbcontrat.addActionListener(this);
			jbprestation.addActionListener(this);
			jbfacture.addActionListener(this);
			jbquitter.addActionListener(this);
			
			this.add(paneladmin, BorderLayout.NORTH);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}

}
