package Proyecto;
import java.awt.event.*;
import javax.swing.*;
public class ControladorRetirar implements ActionListener {
    private Vista V;
    private Sesion S;
    
    public ControladorRetirar(Sesion s,Vista v){
        V=v;
        S=s;
        for(JButton x:V.botones){
            x.addActionListener(this);
        }
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(V.botones.get(0)==arg0.getSource()){
            V.dispose();
        }
        else if(V.botones.get(1)==arg0.getSource()){
            //Segundo boton
        }
    }
}
