
package Proyecto;

import java.io.IOException;
import java.util.ArrayList;

public class Sesion {
    public void Simulador() throws IOException{
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<ArrayList<String>> clientes_aux = new ArrayList<>();
        ArrayList<Tarjeta_Credito> cuentasTC = new ArrayList<>();
        ArrayList<ArrayList<String>> cuentasTC_aux = new ArrayList<>();
        ArrayList<Tarjeta_Debito> cuentasCD = new ArrayList<>();
        ArrayList<ArrayList<String>> cuentasCD_aux = new ArrayList<>();
        Banco Muday = new Banco();

        
        /***************
        // Testing Carga
        ****************/
        
        Carga test1 = new Carga();
        test1.cargarBanco(Muday);
        test1.cargarClientes(clientes,clientes_aux);
        System.out.println("Los Clientes son: "+clientes);
        test1.cargarDebito(cuentasCD,cuentasCD_aux);
        System.out.println("Las CuentasDebito son: "+cuentasCD_aux);
        test1.cargarCredito(cuentasTC,cuentasTC_aux);
        System.out.println("Las CuentasCredito son: "+cuentasTC_aux);
        
        //System.out.println("\n Las Operaciones son: ");
        //test1.cargarSimulacion();
       
        /*********************
        // Testing Operaciones
        **********************/
        
        Operaciones test2 = new Operaciones();
        System.out.println("El saldo antes de la operacion es: "+cuentasCD.get(0).getSaldo());
        test2.Abonar(cuentasCD, cuentasTC, Muday,"5000","CD10-1234");
        System.out.println("El saldo despues de la operacion es: "+cuentasCD.get(0).getSaldo());
        
        
        /****************
        // Testing Salida
        *****************/
        
        // Creating a Salida object and passing all clientes 
        Salida testSalida = new Salida();
        // Creating the initial structure of directories holding the file.out
        testSalida.createInitialDirectoryStructure();
        // Creating the directory structure for each clients
        testSalida.createDirectoryForClient(clientes);
        // Writing all CD files at once
        testSalida.theBigLoopOfSalida(clientes);    
        
    }
}
