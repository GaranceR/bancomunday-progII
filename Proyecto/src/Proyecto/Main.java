package Proyecto;

import java.io.IOException;
import java.util.ArrayList;
import java.text.ParseException;

public class Main {

    public static void main(String[] arg) throws IOException, ParseException{
        
<<<<<<< HEAD
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
=======
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        Sesion session1 = new Sesion();
        session1.Simulador();
>>>>>>> 2213a369d0fd078f4f42d32d5897787d8c931669

    }
}
