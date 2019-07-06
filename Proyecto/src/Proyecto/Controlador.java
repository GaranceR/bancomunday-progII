package Proyecto;

import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class Controlador implements ActionListener {
    private Vista v,aux;
    private Sesion S;

    private JLabel label;  // G : a que sirve eso en el Controlador ? TO DELETE ?
    private JTextField texto;
    private JButton boton;

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
<<<<<<< HEAD
    public void cambiarDatos(Integer a){
        switch(a){
            case 1:
                v.l.setText("  Exito...");
                v.textos.get(0).setText("Sin error");
                break;
            case 0:
                v.l.setText("  Error...");
                v.textos.get(0).setText("");
                break;
        }
    }
    
=======

>>>>>>> 3fb614b671e357fbc35db1fbe14ff60396610b81
    @Override
    public void actionPerformed(ActionEvent evento){
        S.Cargar();
        //Abonar
        if(v.botones.get(0)==evento.getSource()){
                aux=new Vista(1);
                ControladorAbonar op=new ControladorAbonar(S,aux);
                iniciarVista(aux);
<<<<<<< HEAD
                this.cambiarDatos(aux.getValido());
=======
                if(aux.getValido()==1){
                    v.labelPanel.setText("  Exito...");
                    v.textos.get(0).setText("Sin error");
                }
                else if(aux.getValido()==0){
                    v.labelPanel.setText("  Error...");
                    v.textos.get(0).setText("");
                }
>>>>>>> 3fb614b671e357fbc35db1fbe14ff60396610b81
        }
        //Retirar
        else if((v.botones.get(1)==evento.getSource())){
                aux=new Vista(2);
                ControladorRetirar op=new ControladorRetirar(S,aux);
                iniciarVista(aux);
<<<<<<< HEAD
                this.cambiarDatos(aux.getValido());
=======
                if(aux.getValido()==1){
                    v.labelPanel.setText("  Exito...");
                    v.textos.get(0).setText("Sin error");
                }
                else if(aux.getValido()==0){
                    v.labelPanel.setText("  Error...");
                    v.textos.get(0).setText("");
                }
>>>>>>> 3fb614b671e357fbc35db1fbe14ff60396610b81
        }
        //Compar/Pagar
        else if((v.botones.get(2)==evento.getSource())){
                aux=new Vista(3);
                ControladorComPag op=new ControladorComPag(S,aux);
                iniciarVista(aux);
                this.cambiarDatos(aux.getValido());
        }
        //Comprar invercion
        else if((v.botones.get(3)==evento.getSource())){
                aux=new Vista(4);
                ControladorComInv op=new ControladorComInv(S,aux);
                iniciarVista(aux);
<<<<<<< HEAD
                this.cambiarDatos(aux.getValido());
=======
                if(aux.getValido()==1){
                    v.labelPanel.setText("  Exito...");
                    v.textos.get(0).setText("Sin error");
                }
                else if(aux.getValido()==0){
                    v.labelPanel.setText("  Error...");
                    v.textos.get(0).setText("");
                }
>>>>>>> 3fb614b671e357fbc35db1fbe14ff60396610b81
        }
        //Recibir transferencia
        else if((v.botones.get(4)==evento.getSource())){
                aux=new Vista(5);
                ControladorReaTrans op=new ControladorReaTrans(S,aux);
                iniciarVista(aux);
<<<<<<< HEAD
                this.cambiarDatos(aux.getValido());
=======
                if(aux.getValido()==1){
                    v.labelPanel.setText("  Exito...");
                    v.textos.get(0).setText("Sin error");
                }
                else if(aux.getValido()==0){
                    v.labelPanel.setText("  Error...");
                    v.textos.get(0).setText("");
                }
>>>>>>> 3fb614b671e357fbc35db1fbe14ff60396610b81
        }
        //Realizar transferencia
        else if((v.botones.get(5)==evento.getSource())){
                aux=new Vista(6);
                ControladorRecTrans op=new ControladorRecTrans(S,aux);
                iniciarVista(aux);
<<<<<<< HEAD
                this.cambiarDatos(aux.getValido());
=======
                if(aux.getValido()==1){
                    v.labelPanel.setText("  Exito...");
                    v.textos.get(0).setText("Sin error");
                }
                else if(aux.getValido()==0){
                    v.labelPanel.setText("  Error...");
                    v.textos.get(0).setText("");
                }
>>>>>>> 3fb614b671e357fbc35db1fbe14ff60396610b81
        }
        //Generar corte
        else if((v.botones.get(6)==evento.getSource())){
            // TODO
        }
        //Simulacion
        else if((v.botones.get(7)==evento.getSource())){
            try {
                S.Simulador();
<<<<<<< HEAD
                this.cambiarDatos(aux.getValido());
            } catch (IOException ex) {
                //Mensaje de alerta
=======
                v.labelPanel.setText("  Exito...");
                v.textos.get(0).setText("Sin error");
            } catch (IOException ex) {
                //Mensaje de alerta
                v.labelPanel.setText("  Error...");
                v.textos.get(0).setText("");
>>>>>>> 3fb614b671e357fbc35db1fbe14ff60396610b81
            }
        }
    }
}
