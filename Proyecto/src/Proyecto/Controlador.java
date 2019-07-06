package Proyecto;

import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class Controlador implements ActionListener {
    private Vista v,aux;
    private Sesion S;

    public Controlador(Sesion s, Vista v) {
        this.v = v;
        this.S = s;
        S.Cargar();
        for(JButton x:this.v.botones){
            x.addActionListener(this);
        }
    }
    public void iniciarVista() {
       v.setTitle("Banco Munday");
       v.pack();
       v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       v.setSize(1000,500);
       v.setLocationRelativeTo(null);
       v.setVisible(true);
    }
    public void iniciarVista(Vista a) {
       a.setTitle("Banco Munday");
       a.pack();
       a.setSize(1000,500);
       a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       a.setLocationRelativeTo(null);
       a.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        //Abonar
        if (v.botones.get(0) == evento.getSource()) {
                aux = new Vista(1);
                ControladorAbonar op = new ControladorAbonar(S,aux);
                iniciarVista(aux);
                if (aux.getValido() == 1) {
                    v.labelPanel.setText("  Exito...");
                    v.textos.get(0).setText("Sin error");
                }
                else if (aux.getValido() == 0) {
                    v.labelPanel.setText("  Error...");
                    v.textos.get(0).setText("");
                }
        }
        //Retirar
        else if ((v.botones.get(1) == evento.getSource())) {
                aux = new Vista(2);
                ControladorRetirar op = new ControladorRetirar(S,aux);
                iniciarVista(aux);
                if (aux.getValido() == 1) {
                    v.labelPanel.setText("  Exito...");
                    v.textos.get(0).setText("Sin error");
                }
                else if (aux.getValido() == 0) {
                    v.labelPanel.setText("  Error...");
                    v.textos.get(0).setText("");
                }
        }
        //Compar/Pagar
        else if ((v.botones.get(2) == evento.getSource())) {
                aux = new Vista(3);
                ControladorComPag op = new ControladorComPag(S,aux);
                iniciarVista(aux);
                if (aux.getValido() == 1) {
                    v.labelPanel.setText("  Exito...");
                    v.textos.get(0).setText("Sin error");
                }
                else if (aux.getValido() == 0) {
                    v.labelPanel.setText("  Error...");
                    v.textos.get(0).setText("");
                }
        }
        //Comprar inversión
        else if ((v.botones.get(3) == evento.getSource())) {
                aux = new Vista(4);
                ControladorComInv op = new ControladorComInv(S,aux);
                iniciarVista(aux);
                if (aux.getValido() == 1) {
                    v.labelPanel.setText("  Exito...");
                    v.textos.get(0).setText("Sin error");
                }
                else if (aux.getValido() == 0) {
                    v.labelPanel.setText("  Error...");
                    v.textos.get(0).setText("");
                }
        }
        //Recibir transferencia
        else if ((v.botones.get(4) == evento.getSource())) {
                aux = new Vista(5);
                ControladorRecTrans op = new ControladorRecTrans(S,aux);
                iniciarVista(aux);
                if (aux.getValido() == 1) {
                    v.labelPanel.setText("  Exito...");
                    v.textos.get(0).setText("Sin error");
                }
                else if (aux.getValido() == 0) {
                    v.labelPanel.setText("  Error...");
                    v.textos.get(0).setText("");
                }
        }
        //Realizar transferencia
        else if ((v.botones.get(5) == evento.getSource())) {
                aux = new Vista(6);
                ControladorReaTrans op = new ControladorReaTrans(S,aux);
                iniciarVista(aux);
                if (aux.getValido() == 1) {
                    v.labelPanel.setText("  Exito...");
                    v.textos.get(0).setText("Sin error");
                }
                else if (aux.getValido() == 0) {
                    v.labelPanel.setText("  Error...");
                    v.textos.get(0).setText("");
                }
        }
        //Generar corte
        else if ((v.botones.get(6) == evento.getSource())) {
            // TODO
        }
        //Simulacion
        else if ((v.botones.get(7) == evento.getSource())) {
            try {
                S.Simulador();
                v.labelPanel.setText("  Exito...");
                v.textos.get(0).setText("Sin error");
            } catch (IOException ex) {
                v.labelPanel.setText("  Error...");
                v.textos.get(0).setText("");
            }
        }
        
        // Insertar Cuenta Credito TC
        else if ((v.botones.get(8) == evento.getSource())) {
        	aux = new Vista(7);
            ControladorInsCuentaTC op = new ControladorInsCuentaTC(S,aux);
        	iniciarVista(aux);
        	if (aux.getValido() == 1) { 	
                v.labelPanel.setText("  Exito...");
                v.textos.get(0).setText("Sin error");
            }
            else if (aux.getValido() == 0) {
                v.labelPanel.setText("  Error...");
                v.textos.get(0).setText("");
            }
        }
        // Insertar Cuenta Debito CD
        else if ((v.botones.get(9) == evento.getSource())) {
        	aux = new Vista(8);
            ControladorInsCuentaCD op = new ControladorInsCuentaCD(S,aux);
        	iniciarVista(aux);
        	if (aux.getValido() == 1) { 	
                v.labelPanel.setText("  Exito...");
                v.textos.get(0).setText("Sin error");
            }
            else if (aux.getValido() == 0) {
                v.labelPanel.setText("  Error...");
                v.textos.get(0).setText("");
            }
        }
        // Insertar Cliente
        else if ((v.botones.get(10) == evento.getSource())) {
        	aux = new Vista(9);
            ControladorInsCliente op = new ControladorInsCliente(S,aux);
        	iniciarVista(aux);
        	if (aux.getValido() == 1) { 	
                v.labelPanel.setText("  Exito...");
                v.textos.get(0).setText("Sin error");
            }
            else if (aux.getValido() == 0) {
                v.labelPanel.setText("  Error...");
                v.textos.get(0).setText("");
            }
        }
    }
}
