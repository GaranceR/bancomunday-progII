package bancomunday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bancoMundayImp {
	
    public static void main(String[] argv) throws ParseException{
    	//Tarjeta_debito cd1=new Tarjeta_debito("CD");
        //Tarjeta_credito tc1=new Tarjeta_credito("TC");
    	
    	// TEST to modify Class Banco with parameters directly
      	SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
      	//String dateString = format.format( new Date()   );
    	Date date = format.parse("01/03/2019"); 
    	
    	Banco banco = new Banco(5000000, date, 300);
    	// TODO Get infos from archivos

    	System.out.println(banco.toString());
    	
    	// TODO TRY to change date -> Do method "NEXTDAY"
    	
    	Cliente client1 = new Cliente("1234","José Miguel Viñuela","estudiante","jmv@jaja.cl", "955555555","Jaja2","jmv",false);
    	System.out.println(client1.toString());
    	
  
    	
    }
}
