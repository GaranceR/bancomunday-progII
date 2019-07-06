package Proyecto;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ControladorReaTrans implements ActionListener {
    
	private Vista V;
    private Sesion S;
    private Operaciones op;
    
    public ControladorReaTrans(Sesion s,Vista v){
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
     // and "retira" the money entered in monto from the "cuenta" specified
        else if (V.botones.get(1) == event.getSource()) {
            if ("Cuenta".equals(V.textos.get(0).getText()) && "Monto".equals(V.textos.get(1).getText())) {
            	// Do nothing
                // Because it means the user didn't enter anything
            } else {
                try{
                    int i = 0;
                    String[] datos = new String[V.textos.size()];
                    String dato;
                    for (JTextField t:V.textos) {
                        dato = t.getText();
                        datos[i] = dato;
                        i++;
                    }
                    // Calling Method Realizar_Transferencia(ArrayList<Tarjeta_Debito> TarjetaDB, ArrayList<Tarjeta_Credito> TarjetasTC, String Valor, String NumeroCuenta, Banco Muday)
                    if(op.Realizar_Transferencia(S.getCuentasCD(), S.getCuentasTC(), datos[1], datos[0], S.getMuday())) {
                        // TODO Enviar a archivos
                        V.setValido(1);
                        V.dispose();
                    }
                    else {
                        V.setValido(0);
                        V.dispose();
                    }
                } catch(Exception e) {
                    
                }
            }
        }
    }
}
