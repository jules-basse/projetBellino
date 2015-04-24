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

public class panelinfoadmin extends JPanel implements ActionListener{
		private JButton jbclient, jbcontrat, jbprestation, jbfacture, jbquitter;
		
		public panelinfoadmin(String nom, String numero, JFrame frame)
		{
			JPanel paneladmin=new JPanel();
			paneladmin.setLayout(new GridLayout(5,1, 0, 10));
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
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==jbquitter)
			{
				Window window = SwingUtilities.windowForComponent(this);
				if (window instanceof JFrame) {
					JFrame frame = (JFrame) window;
			 
					frame.setVisible(false);
					frame.dispose();
				}		
			}
			if (e.getSource()==jbclient)
			{
				frameinfoadmin infoclient = new frameinfoadmin();
				infoclient.getinfo("client");
			}
			if (e.getSource()==jbcontrat)
			{
				frameinfoadmin infocontrat = new frameinfoadmin();
				infocontrat.getinfo("contrat");
			}
			if (e.getSource()==jbprestation)
			{
				frameinfoadmin infoprestation = new frameinfoadmin();
				infoprestation.getinfo("prestation");
			}
			if (e.getSource()==jbfacture)
			{
				frameinfoadmin infofacture = new frameinfoadmin();
				infofacture.getinfo("facture");
			}
			
		}
	
}
