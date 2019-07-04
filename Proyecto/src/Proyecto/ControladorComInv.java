package Proyecto;
import java.awt.event.*;
import javax.swing.*;
public class ControladorComInv implements ActionListener {
    private Vista V;
    private Sesion S;
    private Operaciones op;
    public ControladorComInv(Sesion s,Vista v){
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
            if("Cuenta".equals(V.textos.get(0).getText()) && "Monto".equals(V.textos.get(1).getText())){
            }else{
                try{
                    int z=0;
                    String[] datos=new String[V.textos.size()];
                    String dato;
                    for(JTextField x:V.textos){
                        dato=x.getText();
                        datos[z]=dato;
                        z++;
                    }
                    if(op.Comprar_Inversion(S.getCuentasCD(), S.getCuentasTC(), datos[1], datos[0])){
                        //Enviar a archivos
                        V.setValido(1);
                        V.dispose();
                    }
                    else{
                        V.setValido(0);
                        V.dispose();
                    }
                }catch(Exception e){
                    
                }
            }
        }
    }
}
