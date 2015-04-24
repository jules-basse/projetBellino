package beans;

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
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class panelinfo extends JPanel implements ActionListener{
	private JTextField jtinfonom, jtinfoid;
	private JButton jbquitter, jbmodif;
	
	public panelinfo(String nom, String id, JFrame frame )
	{
		JPanel panel =new JPanel();
		panel.setLayout(new GridLayout(3,3,5,10));
		// champs nom
		panel.add(new JLabel("nom :"));
		panel.add(jtinfonom=new JTextField());
		jtinfonom.setText(nom);
		jtinfonom.setPreferredSize(new Dimension(150,20));
		// champ id
		panel.add(new JLabel("numero : "));
		panel.add(jtinfoid=new JTextField());
		jtinfoid.setText(id);
		this.add(panel, BorderLayout.NORTH);
		
		// boutons
		JPanel panelb = new JPanel();
		panel.add(jbmodif = new JButton("Informations"));
		panel.add(jbquitter = new JButton("Quitter"));
		jbmodif.addActionListener(this);
		jbquitter.addActionListener(this);
		jbmodif.setPreferredSize(new Dimension(100,20));
		this.add(panelb, BorderLayout.NORTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbquitter)
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
