package Proyecto;

import java.io.IOException;
import java.util.ArrayList;
import java.text.ParseException;

public class Main {

    public static void main(String[] arg) throws IOException, ParseException{
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        /**************
        * Testing Main
        **************/
        Vista vista=new Vista();
        Sesion session1 = new Sesion();
        Controlador cont=new Controlador(vista,session1);
        cont.iniciarVista();
        //session1.Simulador();
        
        /***********
        * Final Main
        ************/

         // Almost there ! (:

    }
}
