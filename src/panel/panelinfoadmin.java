package panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import beans.frame_contrat;
import beans.frameinfoadmin;

public class panelinfoadmin extends JPanel implements ActionListener{
		private JButton jbclient, jbcontrat, jbprestation, jbfacture, jbquitter;
		
		public panelinfoadmin(String nom, String numero, JFrame frame)
		{
			JPanel paneladmin=new JPanel();
			paneladmin.setLayout(new GridLayout(5,1,8,8));
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
				frameinfoadmin infoclient = new frameinfoadmin("client");
				infoclient.getinfo("client");
			}
			if (e.getSource()==jbcontrat)
			{
				frameinfoadmin infoclient = new frameinfoadmin("contrat");
			}
			if (e.getSource()==jbprestation)
			{
				frameinfoadmin infoprestation = new frameinfoadmin("prestation");
				infoprestation.getinfo("prestation");
			}
			if (e.getSource()==jbfacture)
			{
				frameinfoadmin infofacture = new frameinfoadmin("facture");
				infofacture.getinfo("facture");
			}
			
		}

}
