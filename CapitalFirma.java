import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CapitalFirma extends JFrame implements ItemListener, ActionListener {
    private IntVanzareVehicul intVanzareVehicul; // Adăugați o referință la clasa IntVanzareVehicul

    public CapitalFirma() {
        this.setTitle("Capital Firma");
        this.setLayout(new BorderLayout());
        this.setSize(350, 200);

        // Creați o instanță a clasei IntVanzareVehicul
        intVanzareVehicul = new IntVanzareVehicul();

        JButton btnAfiseazaSuma = new JButton("Afișează Suma Totală");
        btnAfiseazaSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Accesați suma totală din clasa IntVanzareVehicul și afișați-o
                double sumaTotala = intVanzareVehicul.getSumaTotala();
                JOptionPane.showMessageDialog(null, "Suma totală: " + sumaTotala, "Suma Totală", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        getContentPane().add(btnAfiseazaSuma, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}