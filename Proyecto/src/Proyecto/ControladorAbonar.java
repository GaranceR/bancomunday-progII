package Proyecto;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class ControladorAbonar implements ActionListener {
    
	private Vista V;
    private Sesion S;
    private Operaciones op;
    
    public ControladorAbonar(Sesion s,Vista v){
        V = v;
        S = s;
        op = new Operaciones();
        for(JButton x:V.botones){
            x.addActionListener(this);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
    	
    	// If user clicks on "Regresar" -> closes current window
        if (V.botones.get(0) == event.getSource()) {
            V.dispose();
        }
        // If user clicks on "Continuar" -> Get data from textfields 
    	// and add the money entered in monto to the "cuenta" specified
        else if (V.botones.get(1) == event.getSource()) {
            if (V.textos.get(0).getText().equals("Cuenta") && V.textos.get(1).getText().equals("Monto")) {
            // Do nothing
            // Because it means the user didn't enter anything
            } else {
                try {
                    int i = 0;
                    String[] datos = new String[V.textos.size()];
                    String dato;
                    for(JTextField t:V.textos){
                        dato = t.getText();
                        datos[i] = dato;
                        i++;
                    }
                    // Calling Method Abonar(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasTC, Banco Muday, String Valor, String NumeroCuenta)
                    if (op.Abonar(S.getCuentasCD(), S.getCuentasTC(), S.getMuday(), datos[1], datos[0])){
                        // TODO Enviar a archivos
                        V.setValido(1);
                        V.dispose();
                    }
                    else {
                        V.setValido(0);
                        System.out.println("No functionó");
                        V.dispose();
                    }
                } catch (Exception e) {
                	System.out.println(e);
                }
            }
        }
    }
}
