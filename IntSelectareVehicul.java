import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class IntSelectareVehicul extends JFrame implements ItemListener, ActionListener{

    JComboBox<String>  comboTipVehicul;
	JButton button1 = new JButton(); 

     IntSelectareVehicul()
     {

        this.setTitle("Meniu selectare tip vehicul"); // setam titlu
        this.setLayout(new FlowLayout(200, 300, 100));
        this.setSize(300, 300); // setam dimensiunile

        final String[] tipVehicul = {"Masina", "Motocicleta", "Camion"};

        comboTipVehicul = new JComboBox<String>(tipVehicul);
        comboTipVehicul.addItemListener(this);

        button1.setText("Urmatorul pas"); 
        button1.addActionListener(this); 

        this.add(comboTipVehicul);
		this.add(button1);
        this.pack();
        this.setVisible(true); 
    }

     @Override
	public void actionPerformed(ActionEvent e)
    {

		// actionarea butoanelor si creare de noi interfete //

        if (comboTipVehicul.getSelectedItem().equals("Masina"))
        {
            new IntAdaugaMasina();
        }

        
        if (comboTipVehicul.getSelectedItem().equals("Motocicleta"))
        {
            new IntAdaugaMotocicleta();
        }


        if (comboTipVehicul.getSelectedItem().equals("Camion"))
        {
            new IntAdaugaCamion();
        }
    }

    public void itemStateChanged(ItemEvent e) {
    }

}
