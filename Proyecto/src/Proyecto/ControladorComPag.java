package Proyecto;
import java.awt.event.*;
import javax.swing.*;
public class ControladorComPag implements ActionListener {
    private Vista V;
    private Sesion S;
    private Operaciones op;
    public ControladorComPag(Sesion s,Vista v){
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
            if("Cuenta".equals(V.textos.get(0).getText()) && "Monto/Cuotas".equals(V.textos.get(1).getText())){
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
                    String[] datos2=datos[1].split(" ");
                    if(op.Pagar_Compra(S.getCuentasCD(),S.getCuentasTC(), S.getMuday(), datos2[0], datos[0],datos[2])){
                        //Enviar a archivos
                        V.setValido(1);
                        V.dispose();
                    }
                    else if(op.Pagar_Compra_Cuotas(S.getCuentasTC(), S.getMuday(), datos2[0], datos[0], datos[2], Integer.parseInt(datos2[1]))){
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
