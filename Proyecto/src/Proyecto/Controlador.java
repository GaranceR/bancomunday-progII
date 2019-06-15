package Proyecto;

import javax.swing.JFrame;

public class Controlador {
    private Vista v;
    private Sesion S;
    public Controlador(Vista v, Sesion s) {
        this.v = v;
        this.S = s;
    }
    
    public void iniciarVista() {
       v.setTitle("Banco Munday");
       v.pack();
       v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       v.setSize(600,300);
       v.setVisible(true); 
    }
}
