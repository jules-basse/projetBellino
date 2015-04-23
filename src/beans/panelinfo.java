package beans;

import java.awt.BorderLayout;
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
		panel.setLayout(new GridLayout(4, 2, 5, 5));
		panel.add(new JLabel("nom :"));
		panel.add(jtinfonom=new JTextField());
		panel.add(new JLabel("numero : "));
		panel.add(jtinfoid=new JTextField());
		jtinfonom.setText(nom);
		jtinfoid.setText(id);
		panel.add(jbmodif = new JButton("Informations"));
		this.add(panel, BorderLayout.NORTH);
		this.setVisible(true);
		
		JPanel panelb = new JPanel();
		panelb.setLayout(new GridLayout(3,3,5,5));
		panelb.add(jbquitter = new JButton("Quitter"));
		jbquitter.addActionListener(this);
		this.add(panelb);
		
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
