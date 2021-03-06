package Proyecto;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class ControladorInsCliente implements ActionListener {
    private Vista V;
    private Sesion S;
    private Operaciones op;
    public ControladorInsCliente(Sesion s,Vista v){
        this.V=v;
        this.S=s;
        for(JButton x:V.botones){
            x.addActionListener(this);
        }
    }
    @Override
    public void actionPerformed(ActionEvent event) {

    	// If user clicks on "Regresar" -> closes current window
    	if(V.botones.get(0) == event.getSource()){
            V.dispose();
        }
    	
    	// if user clicks on "Continuar" -> Get data from textfields 
    	// and creates new client with that data
    	
    	else if(V.botones.get(1) == event.getSource()){
    		int i = 0;
    		String[] datos = new String[V.textos.size()];
    		String dato;
    		for (JTextField tf:V.textos) {
    			dato = tf.getText();
    			datos[i] = dato;
    			i++;
    		}
    		Cliente cliente = new Cliente(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7]);
    		System.out.println(cliente.toString());
    		
    		ArrayList<String> newClient = cliente.Asignar();
            //Se añade el cliente a la lista

    		S.getClientes().add(cliente);
    		S.getClientes_aux().add(newClient);
    		
    		// IF succeeded -> TO CHECK ?! TODO
    		V.setValido(1);
    		// TODO ADD Confirmation message "You added the client ..."
    		// V.dispose();
    		// ADD else setValido(0)
    		// + catch Exception
    	}
    }
    
    }
