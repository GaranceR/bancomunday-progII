package bancomunday;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) throws IOException{
        ArrayList<ArrayList<String>> tarjetaDebito = new ArrayList<ArrayList<String>>();

        String Orden = null;
        
        Archivo cuentasCD = new Archivo();
        tarjetaDebito = cuentasCD.leerArchivo("C:\\Users\\Galda\\Desktop\\BancoMunday\\Archivos\\Cargas\\CuentasCD.in");
        
        System.out.println("Tarjeta Debito: " +tarjetaDebito);
        //cuentasCD.escribirArchivo("C:\\Users\\Galda\\Desktop\\BancoMunday\\Archivos\\Cargas\\Hola2.txt",TarjetaDebito);
        //Orden = cuentasCD.leerOrdenes("C:\\Users\\Galda\\Desktop\\BancoMunday\\Archivos\\Simulador.in");
        
        
        //System.out.println("La orden es: " + Orden);
    }
}
