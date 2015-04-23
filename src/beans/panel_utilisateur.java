package beans;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class panel_utilisateur extends JPanel implements ActionListener{
	private JButton jbvalider, jbquitter;
	private JTextField jtnom , jtid;
	JPanel panelRadio = new JPanel();
    private JRadioButton jbuser = new JRadioButton("Client");
    private JRadioButton jbadmin = new JRadioButton("Admin");
    private String nom, id;
    private String rien="";
	
	public panel_utilisateur()
	{
		//grille champs nom et numero
		JPanel paneluser=new JPanel();
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
        boolean select = jbuser.isSelected();
        jbuser.setSelected(true);
        
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
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbquitter)
		{
			System.exit(0);
		}
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
		}
		
	}

}