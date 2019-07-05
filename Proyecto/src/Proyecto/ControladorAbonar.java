package Proyecto;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class ControladorAbonar implements ActionListener {

    private Vista V;
    private Sesion S;
    private Operaciones op;

    public ControladorAbonar(Sesion s, Vista v){
        V = v;
        S = s;
        for(JButton x:V.botones){
            x.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // Close the window if you click on the first button (regresar)
        if(V.botones.get(0)==arg0.getSource()){
            V.dispose();
        }
        else if(V.botones.get(1)==arg0.getSource()){
            // If the JPanel's text equals Cuenta and Monto, do nothing
            if(V.textos.get(0).getText().equals("Cuenta") && V.textos.get(1).getText().equals("Monto")){
            }
            // If the JPanel's text is different then
            else {
                try{
                    //********************************//
                    // Getting the data from the view //
                    //********************************//

                    // ??? Z como Zoro ???
                    int z = 0;
                    // Create an array Data of length 2
                    String[] datos = new String[V.textos.size()];
                    String dato;
                    // For each JtextField in textos do
                    for(JTextField x:V.textos){
                        // Get the text into dato
                        dato=x.getText();
                        // append the content to datos
                        datos[z]=dato;
                        // Incrementing Zoro !
                        z++;
                    }
                    //*********************//
                    // Processing the data //
                    //*********************//

                    // If the operation of abonar if possible
                    if(op.Abonar(S.getCuentasCD(),S.getCuentasTC() ,S.getMuday(), datos[1], datos[0])){
                        // TODO - Enviar a archivos

                        // Set the Valid flag to 1 - OK
                        V.setValido(1);
                        // Close the window
                        V.dispose();
                    }
                    else{
                        // Set the Valid flag to 0 - NOT OK
                        V.setValido(0);
                        // Close the window
                        V.dispose();
                    }
                }catch(Exception e){
                    // Printing the error to the console
                    System.out.println(e);
                }
            }
        }
    }
}
