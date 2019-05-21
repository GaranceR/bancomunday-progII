package bancomunday;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] arg) throws IOException, ParseException{
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        /**************
        * Testing Main
        **************/
        
    	// TEST to modify Class Banco with parameters directly
        //SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        //String dateString = format.format( new Date() );
    	//Date date = format.parse("01/03/2019");


        /*****************************
        * TEST Get infos from archivos
        ******************************/

        // Testing for the file Banco.in moved to the folder content
        // located at the same level of the folder src
        
        Sesion session1 = new Sesion();
        session1.Simulador();
        
        //String url = "content/Archivos/Banco/Banco.in";
        //Archivo testArchivo = new Archivo(url);
        //testArchivo.read_from_file(url);


    	// TODO TRY to change date -> Do method "NEXTDAY"

    	//Cliente client1 = new Cliente("1234","José Miguel Viñuela","estudiante","jmv@jaja.cl", "955555555","Jaja2","jmv",false);
    	//System.out.println(client1.toString());

         /***********
         * Final Main
         ************/

         // Almost there ! (:

    }
}
