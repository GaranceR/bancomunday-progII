package Proyecto;

import java.io.IOException;
import java.util.ArrayList;
import java.text.ParseException;

public class Main {

    public static void main(String[] arg) throws IOException, ParseException{
        
        /**************
        * Testing Main
        **************/
        //ArrayList<Cliente> clientes = new ArrayList<>();
        Vista vista=new Vista(0);
        Sesion session1 = new Sesion();
        //session1.Cargar();
        Controlador cont=new Controlador(session1,vista);
        cont.iniciarVista();
        //session1.Simulador();
        
        System.out.println("Holi is this working");
        
        /***********
        * Final Main
        ************/

        // Almost there ! (:


    }
}
