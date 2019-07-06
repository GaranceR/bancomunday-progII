package Proyecto;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class ControladorInsCuentaCD implements ActionListener {
    private Vista V;
    private Sesion S;
    private Operaciones op;
    public ControladorInsCuentaCD(Sesion s,Vista v){
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
    		
    		Tarjeta_Debito cuentaCD = new Tarjeta_Debito(datos[0], datos[1], Integer.valueOf(datos[2]), datos[3]);
    		System.out.println(cuentaCD.toString());
    		
			ArrayList<String> newCuentaCD = cuentaCD.Asignar();
		    //Se añade la cuenta debito a la lista
		    S.getCuentasCD().add(cuentaCD);
		    S.getCuentasCD_aux().add(newCuentaCD);
    		
    		V.setValido(1);
    		// TODO ADD Confirmation message "You added the cuenta ..."
    		// V.dispose();
    		// ADD else setValido(0)
    		// + catch Exception
    		
    		
    		// below was a TRY to factorise both creations of cuentas in same Controller
    		/*
    		// TODO IF Debito CD selected
    		// # Constructor Tarjeta_Debito(String numeroCuenta, String categoria, int saldo, String bloqueado)
    		Tarjeta_Debito cuentaCD = new Tarjeta_Debito(datos[0], datos[1], Integer.valueOf(datos[2]), datos[3]);
    		
    		// IF Credito TC selected
    		// # Constructor Tarjeta_Credito(String numeroCuenta, String categoria, int montoDisponible, String bloqueado, String diaPago, int deuda)
    		Tarjeta_Credito cuentaTC = new Tarjeta_Credito(datos[0], datos[1], Integer.valueOf(datos[2]), datos[3], datos[4], Integer.valueOf(datos[5]));
    	}
    	
    	// if option Credito is selected
    	if (V.radioButtons.get(0).isSelected()) {
    		// Print view with details for Cuenta Credito
    		iniciarVista
    		//V.crearInsCuentaDetail("TC");
    	} // if option Debito is selected
    	else if (V.radioButtons.get(1).isSelected()){
    		V.crearInsCuentaDetail("CD");
    	}
    	*/
    	
    	}
    }
    
    }
