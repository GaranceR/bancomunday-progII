package Proyecto;
import java.awt.event.*;
import javax.swing.*;

public class ControladorInsCuenta implements ActionListener {
    private Vista V;
    private Sesion S;
    private Operaciones op;
    public ControladorInsCuenta(Sesion s,Vista v){
        V=v;
        S=s;
        for(JButton x:V.botones){
            x.addActionListener(this);
        }
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
    	// TODO
    	// Think about setValido!
    }
    
    }
