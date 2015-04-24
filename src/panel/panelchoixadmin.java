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

import beans.*;

public class panelchoixadmin extends JPanel implements ActionListener  {
	private JButton jbajouter, jbconsulter, jbquitter;
	private String montype; 
	
	public panelchoixadmin(String type)
	{
		montype = type;
		JPanel paneladmin=new JPanel();
		paneladmin.setLayout(new GridLayout(3,1,0,8));
		paneladmin.add(jbajouter = new JButton("ajouter " + type));
		paneladmin.add(jbconsulter = new JButton("consulter " + type));
		
		paneladmin.add(jbquitter = new JButton("Quitter"));
		jbajouter.addActionListener(this);
		jbconsulter.addActionListener(this);
		jbquitter.addActionListener(this);
		
		this.add(paneladmin, BorderLayout.NORTH);
	}
	
	public String getType()
	{
		return this.montype;
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
		if (e.getSource()==jbajouter)
		{
			if(this.getType()=="contrat")
			{
				frame_contrat maframe = new frame_contrat();
			}
			if(this.getType()=="prestation")
			{
				frame_prestation maframe = new frame_prestation();
			}
		}
		
	}

}
