package Proyecto;

import java.awt.event.*;
import javax.swing.*;

public class Controlador implements ActionListener {
    private Vista v;
    private Sesion S;
    private JLabel label;
    private JTextField texto;
    private JButton boton;
    public void setLabel(JLabel label) {
        this.label = label;
    }
    public void setTexto(JTextField texto) {
        this.texto = texto;
    }
    public Controlador(Vista v, Sesion s) {
        this.v = v;
        this.S = s;
        for(JButton x:this.v.botones){
            x.addActionListener(this);
        }
    }
    
    public void iniciarVista() {
       v.setTitle("Banco Munday");
       v.pack();
       v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       v.setSize(600,300);
       v.setVisible(true); 
    }
    @Override
    public void actionPerformed(ActionEvent evento){
        //Abonar
        if((v.botones.get(0)==evento.getSource())){
            System.out.println("asd");
        }
        //Retirar
        else if((v.botones.get(1)==evento.getSource())){
            System.out.println("as");
        }
        //Compar/Pagar
        else if((v.botones.get(2)==evento.getSource())){
            System.out.println("sd");
        }
        //Comprar invercion
        else if((v.botones.get(3)==evento.getSource())){
            System.out.println("ad");
        }
        //Recibir transferencia
        else if((v.botones.get(4)==evento.getSource())){
            System.out.println("456323");
        }
        //Realizar transferencia
        else if((v.botones.get(5)==evento.getSource())){
            System.out.println("0123123");
        }
        //Generar corte
        else if((v.botones.get(6)==evento.getSource())){
            System.out.println("98745623");
        }
        //Simulacion
        else if((v.botones.get(7)==evento.getSource())){
            System.out.println("wasedrtfgyhujik");
        }
    }
}
