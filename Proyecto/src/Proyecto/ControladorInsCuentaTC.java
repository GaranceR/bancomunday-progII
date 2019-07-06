package Proyecto;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class ControladorInsCuentaTC implements ActionListener {
    private Vista V;
    private Sesion S;
    private Operaciones op;
    public ControladorInsCuentaTC(Sesion s,Vista v){
        V=v;
        S=s;
        for (JButton x:V.botones) {
            x.addActionListener(this);
        }
        for (JRadioButton rb: V.radioButtons) {
        	rb.addActionListener(this);
        }
    }
    @Override
    public void actionPerformed(ActionEvent event) {
    	
    	// If user clicks on "Regresar" -> closes current window
    	if(V.botones.get(0) == event.getSource()){
            V.dispose();
        }
    	
    	// if user clicks on "Continuar" -> Get data from textfields 
    	// and creates new cuenta with that data
    	
    	else if(V.botones.get(1) == event.getSource()){
    		int i = 0;
    		String[] datos = new String[V.textos.size()];
    		String dato;
    		for (JTextField tf:V.textos) {
    			dato = tf.getText();
    			datos[i] = dato;
    			i++;
    		}
    		
    		Tarjeta_Credito cuentaTC = new Tarjeta_Credito(datos[0], datos[1], Integer.valueOf(datos[2]), datos[3], datos[4], Integer.valueOf(datos[5]));
    		System.out.println(cuentaTC.toString());
    		
    		ArrayList<String> newCuentaTC = cuentaTC.Asignar();
		    //Se añade la cuenta debito a la lista
		    S.getCuentasTC().add(cuentaTC);
		    S.getCuentasTC_aux().add(newCuentaTC);
    		
    		V.setValido(1);
    		// TODO ADD Confirmation message "You added the cuenta ..."
    		// V.dispose();
    		// ADD else setValido(0)
    		// + catch Exception
    	
    	}
    }
    
}
