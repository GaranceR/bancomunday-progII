package Proyecto;

import java.awt.event.*;
import javax.swing.*;

public class Controlador implements ActionListener {
    private Vista v,aux;
    private Sesion S;
    private JLabel label;
    private JTextField texto;
    private JButton boton;
    public Controlador(Vista v, Sesion s) {
        this.v = v;
        this.S = s;
        for(JButton x:this.v.botones){
            x.addActionListener(this);
        }
    }
    public Controlador(Vista aux){
        this.aux=aux;
        for(JButton x:this.aux.botones){
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
       a.setVisible(true); 
    }
    @Override
    public void actionPerformed(ActionEvent evento){
        //Abonar
        if(v.botones.get(0)==evento.getSource()){
            if(this.v.getVentana()==0){
                iniciarVista(new Vista(1));
            }
        }
        //Retirar
        else if((v.botones.get(1)==evento.getSource())){
            if(this.v.getVentana()==0){
                iniciarVista(new Vista(2));
            }
        }
        //Compar/Pagar
        else if((v.botones.get(2)==evento.getSource())){
            if(this.v.getVentana()==0){
                iniciarVista(new Vista(3));
            }
        }
        //Comprar invercion
        else if((v.botones.get(3)==evento.getSource())){
            if(this.v.getVentana()==0){
                iniciarVista(new Vista(4));
            }
        }
        //Recibir transferencia
        else if((v.botones.get(4)==evento.getSource())){
            if(this.v.getVentana()==0){
                iniciarVista(new Vista(5));
            }
        }
        //Realizar transferencia
        else if((v.botones.get(5)==evento.getSource())){
            if(this.v.getVentana()==0){
                iniciarVista(new Vista(6));
            }
        }
        //Generar corte
        else if((v.botones.get(6)==evento.getSource())){
            if(this.v.getVentana()==0){
                iniciarVista(new Vista(7));
            }
        }
        //Simulacion
        else if((v.botones.get(7)==evento.getSource())){
            System.out.println("wasedrtfgyhujik");
        }
        if(aux!=null){
            //Abonar
            if(aux.botones.get(0)==evento.getSource()){
                System.out.println("asd");
            }
            //Retirar
            else if((aux.botones.get(1)==evento.getSource())){
                System.out.println("as");
            }
            //Compar/Pagar
            else if((aux.botones.get(2)==evento.getSource())){
                System.out.println("sd");
            }
            //Comprar invercion
            else if((aux.botones.get(3)==evento.getSource())){
                System.out.println("ad");
            }
            //Recibir transferencia
            else if((aux.botones.get(4)==evento.getSource())){
                System.out.println("456323");
            }
            //Realizar transferencia
            else if((aux.botones.get(5)==evento.getSource())){
                System.out.println("0123123");
            }
            //Generar corte
            else if((aux.botones.get(6)==evento.getSource())){
                System.out.println("98745623");
            }
            //Simulacion
            else if((aux.botones.get(7)==evento.getSource())){
                System.out.println("wasedrtfgyhujik");
            }
        }
    }
    public void Accion(){
        
    }
    public void Condicion(){
        
    }
}
