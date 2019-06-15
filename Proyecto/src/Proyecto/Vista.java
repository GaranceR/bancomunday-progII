package Proyecto;
import javax.swing.*;
import java.awt.*;
public class Vista extends JFrame {
    private JButton b;
    private JTextField tf;
    private JLabel l;
    private String[] OP={"Abonar","Cargar","Comprar/Pagar","Comprar inversion","Recivir Transferencia","Realizar Transferencia","Generar Corte"};
    public Vista(){
        getContentPane().setLayout(new BorderLayout());
        JPanel p1=new JPanel(),p2=new JPanel();
        p1.setLayout(new GridLayout(4,2));
        p2.setLayout(new GridLayout(2,1));
        for(int z=0;z<7;z++){
            b=new JButton(OP[z]);
            p1.add(b);
        }
        l=new JLabel("  Estado...");
        p2.add(l);
        tf=new JTextField("Detalles del error...");
        p2.add(tf);
        add(p1, BorderLayout.WEST);
        add(p2, BorderLayout.CENTER);
    }
}
