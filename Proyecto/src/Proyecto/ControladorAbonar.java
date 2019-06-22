package Proyecto;
import java.awt.event.*;
import javax.swing.*;
public class ControladorAbonar implements ActionListener {
    private Vista V;
    private Sesion S;
    private Operaciones op;
    public ControladorAbonar(Sesion s,Vista v){
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
            JTextField[] texto=V.getTf();
            String[] datos=new String[3];
            for(int x=0;x<3;x++){
                datos[x]=texto[x].getText();
            }
            if(op.Abonar(S.getCuentasCD(),S.getCuentasTC() , S.getMuday(), datos[1], datos[0])){
                V.setValido(1);
                V.dispose();
            }
            else{
                V.setValido(0);
                V.dispose();
            }
        }
    }
}
