import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class IntAdaugaCamion extends JFrame implements ItemListener, ActionListener {
    JComboBox<String> comboMarca, comboModel;
    JTextField txtPret; 
    JButton button1 = new JButton();

    public static List<Masina> motociclete = new ArrayList<>();

    IntAdaugaCamion() {
        this.setTitle("Meniu Adaugare Motociclete");
        this.setLayout(new FlowLayout(100, 200, 50));
        this.setSize(200, 100); 

        final String[] marci = {"Marca", "MAN", "Iveco", "Scania", "Mercedes-Benz"};

        comboMarca = new JComboBox<String>(marci);
        comboMarca.addItemListener(this);

        comboModel = new JComboBox<String>();
        comboModel.addItemListener(this);
        comboModel.insertItemAt("Model", 0);
        comboModel.setSelectedIndex(0);
        comboModel.setEnabled(false);

        txtPret = new JTextField(7); 

        button1.setText("Adauga");
        button1.addActionListener(this);

        this.add(comboMarca);
        this.add(comboModel);
        this.add(new JLabel("Pret:"));
        this.add(txtPret); 
        this.add(button1);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {


		List<Masina> masini = ListaVehicule.getVehicule();

        String Marca = comboMarca.getSelectedItem().toString();
        String Model = comboModel.getSelectedItem().toString();
        String Pret = txtPret.getText(); 

        if (Marca.equals("Marca") || Model.equals("Model") || Pret.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selectați marca, modelul și introduceți prețul înainte de a adăuga motocicleta.", "Eroare", JOptionPane.ERROR_MESSAGE);
        } else {
            masini.add(new Masina(Marca, Model, Pret));
        }

        for (int i = 0; i < masini.size(); i++) {
            Masina masina = masini.get(i);
            System.out.println(masina);
        }
    }

    public static List<Masina> getMasini() {
        return motociclete;
    }

    public void itemStateChanged(ItemEvent e) {
        final String MAN[] = {"F 2000", "TGL", "TGS", "TGX", "TGM"};
        final String Iveco[] = {"Stralis NP", "S-WAY", "Stralis X-WAY", "Trakker", "T-WAY"};
        final String Scania[] = {"r450", "770s", "r500", "r620"};
        final String MercedesBenz[] = {"eActros 600", "Actros", "Atego", "Econic"};

        if (e.getSource() == comboMarca) {
            if (comboMarca.getSelectedItem().equals("Marca")) {
                comboModel.setEnabled(false);
            } else if (comboMarca.getSelectedItem().equals("MAN")) {
                comboModel.setEnabled(true);
                comboModel.removeAllItems();
                for (int i = 0; i < MAN.length; i++) {
                    comboModel.addItem(MAN[i]);
                }
            } else if (comboMarca.getSelectedItem().equals("Iveco")) {
                comboModel.setEnabled(true);
                comboModel.removeAllItems();
                for (int i = 0; i < Iveco.length; i++) {
                    comboModel.removeItem(Iveco[i]);
                    comboModel.addItem(Iveco[i]);
                }
            } else if (comboMarca.getSelectedItem().equals("Scania")) {
                comboModel.setEnabled(true);
                comboModel.removeAllItems();
                for (int i = 0; i < Scania.length; i++) {
                    comboModel.addItem(Scania[i]);
                }
            } else if (comboMarca.getSelectedItem().equals("Mercedes-Benz")) {
                comboModel.setEnabled(true);
                comboModel.removeAllItems();
                for (int i = 0; i < MercedesBenz.length; i++) {
                    comboModel.addItem(MercedesBenz[i]);
                }
            }
        }
    }
}
