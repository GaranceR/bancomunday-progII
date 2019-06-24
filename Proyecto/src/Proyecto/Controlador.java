package Proyecto;

import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class Controlador implements ActionListener {
    private Vista v,aux;
    private Sesion S;
    private JLabel label;
    private JTextField texto;
    private JButton boton;
    public Controlador(Sesion s,Vista v) {
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
    }public void iniciarVista(Vista a) {
       a.setTitle("Banco Munday");
       a.pack();
       a.setSize(600,300);
       a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       a.setVisible(true); 
    }
    @Override
    public void actionPerformed(ActionEvent evento){
        //Abonar
        if(v.botones.get(0)==evento.getSource()){
            if(this.v.getVentana()==0){
                aux=new Vista(1);
                iniciarVista(aux);
                ControladorAbonar op=new ControladorAbonar(S,aux);
                if(aux.getValido()==1){
                    v.l.setText("  Exito...");
                    v.tf[0].setText("Sin error");
                }
                else if(aux.getValido()==0){
                    v.l.setText("  Error...");
                    v.tf[0].setText("");
                }
            }
        }
        //Retirar
        else if((v.botones.get(1)==evento.getSource())){
            if(this.v.getVentana()==0){
                aux=new Vista(2);
                iniciarVista(aux);
                ControladorRetirar op=new ControladorRetirar(S,aux);
                if(aux.getValido()==1){
                    v.l.setText("  Exito...");
                    v.tf[0].setText("Sin error");
                }
                else if(aux.getValido()==0){
                    v.l.setText("  Error...");
                    v.tf[0].setText("");
                }
            }
        }
        //Compar/Pagar
        else if((v.botones.get(2)==evento.getSource())){
            if(this.v.getVentana()==0){
                aux=new Vista(3);
                iniciarVista(aux);
                ControladorComPag op=new ControladorComPag(S,aux);
            }
        }
        //Comprar invercion
        else if((v.botones.get(3)==evento.getSource())){
            if(this.v.getVentana()==0){
                aux=new Vista(4);
                iniciarVista(aux);
                ControladorComInv op=new ControladorComInv(S,aux);
                if(aux.getValido()==1){
                    v.l.setText("  Exito...");
                    v.tf[0].setText("Sin error");
                }
                else if(aux.getValido()==0){
                    v.l.setText("  Error...");
                    v.tf[0].setText("");
                }
            }
        }
        //Recibir transferencia
        else if((v.botones.get(4)==evento.getSource())){
            if(this.v.getVentana()==0){
                aux=new Vista(5);
                iniciarVista(aux);
                ControladorReaTrans op=new ControladorReaTrans(S,aux);
                if(aux.getValido()==1){
                    v.l.setText("  Exito...");
                    v.tf[0].setText("Sin error");
                }
                else if(aux.getValido()==0){
                    v.l.setText("  Error...");
                    v.tf[0].setText("");
                }
            }
        }
        //Realizar transferencia
        else if((v.botones.get(5)==evento.getSource())){
            if(this.v.getVentana()==0){
                aux=new Vista(6);
                iniciarVista(aux);
                ControladorRecTrans op=new ControladorRecTrans(S,aux);
                if(aux.getValido()==1){
                    v.l.setText("  Exito...");
                    v.tf[0].setText("Sin error");
                }
                else if(aux.getValido()==0){
                    v.l.setText("  Error...");
                    v.tf[0].setText("");
                }
            }
        }
        //Generar corte
        else if((v.botones.get(6)==evento.getSource())){
            if(this.v.getVentana()==0){
                aux=new Vista(7);
                iniciarVista(aux);
                ControladorGenCort op=new ControladorGenCort(S,aux);
                if(aux.getValido()==1){
                    v.l.setText("  Exito...");
                    v.tf[0].setText("Sin error");
                }
                else if(aux.getValido()==0){
                    v.l.setText("  Error...");
                    v.tf[0].setText("");
                }
            }
        }
        //Simulacion
        else if((v.botones.get(7)==evento.getSource())){
            try {
                S.Simulador();
                v.l.setText("  Exito...");
                v.tf[0].setText("Sin ningun error");
            } catch (IOException ex) {
                //Mensaje de alerta
                v.l.setText("  Error...");
                v.tf[0].setText("");
            }
        }
    }
}
