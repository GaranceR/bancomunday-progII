package Proyecto;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] arg) throws IOException, ParseException{
                
    	Vista vista = new Vista(0);
        Sesion session1 = new Sesion();
        Controlador cont = new Controlador(session1,vista);
        cont.iniciarVista();
  
    }
}
