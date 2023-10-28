import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class IntVanzareVehicul extends JFrame {
    private List<Masina> masiniDinAltFisier;
    private JList<String> list;

    public IntVanzareVehicul() {
        this.setTitle("Vanzare Autovehicul");
        this.setLayout(new BorderLayout());
        this.setSize(300, 200);

        masiniDinAltFisier = IntAdaugaMasina.getMasini();
        masiniDinAltFisier.add(new Masina("BMW", "Seria 7"));
        masiniDinAltFisier.add(new Masina("Audi", "80"));
        masiniDinAltFisier.add(new Masina("Skoda", "Fabia"));

        String[] listaMasini = new String[masiniDinAltFisier.size()];
        for (int i = 0; i < masiniDinAltFisier.size(); i++) {
            Masina masina = masiniDinAltFisier.get(i);
            listaMasini[i] = "Marca: " + masina.getMarca() + " - Modelul: " + masina.getModel();
        }

        list = new JList<>(listaMasini);
        JScrollPane scrollpane = new JScrollPane(list);
        getContentPane().add(scrollpane, BorderLayout.CENTER);

        JButton btnVinde = new JButton("Vinde");
        btnVinde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIdx = list.getSelectedIndex();
                if (selectedIdx >= 0) {
                    masiniDinAltFisier.remove(selectedIdx); // Cu asta stergi masian din lista
                    refreshList();//si aici trebe sa se dea refresh da nush de ce nu merge 
                }
            }
        });

        getContentPane().add(btnVinde, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    private void refreshList() {
        String[] listaMasini = new String[masiniDinAltFisier.size()];
        for (int i = 0; i < masiniDinAltFisier.size(); i++) {
            Masina masina = masiniDinAltFisier.get(i);
            listaMasini[i] = "Marca: " + masina.getMarca() + " - Modelul: " + masina.getModel();
        }
        list.setListData(listaMasini); // Actualizeaza lista
    }

    public static void main(String[] args) {
        new IntVanzareVehicul();
    }
}