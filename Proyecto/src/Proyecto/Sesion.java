
package Proyecto;

import java.io.IOException;
import java.util.ArrayList;

public class Sesion {
    public void Simulador() throws IOException{
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Tarjeta_Credito> cuentasTC = new ArrayList<>();
        ArrayList<Tarjeta_Debito> cuentasCD = new ArrayList<>();
        Banco Muday = new Banco();

        Carga test1 = new Carga();
        test1.cargarBanco(Muday);
        test1.cargarClientes(clientes);
        System.out.println("Los Clientes son: "+clientes);
        test1.cargarDebito(cuentasCD);
        System.out.println("Las CuentasDebito son: "+cuentasCD);
        test1.cargarCredito(cuentasTC);
        System.out.println("Las CuentasCredito son: "+cuentasTC);
        
        System.out.println("El Codigo del primero es: "+clientes.get(0).getOcupacion());
        //System.out.println("\n Las Operaciones son: ");
        //test1.cargarSimulacion();
       
        //Operaciones
        
        Operaciones test2 = new Operaciones();
        test2.Abonar(cuentasCD, cuentasTC, Muday);
        
        
        /****************
        // Testing Salida
        *****************/
        // Creating a Salida object and passing all clientes 
        //Salida testSalida = new Salida(clientes);
        // Creating the initial structure of directories holding the file.out
        //testSalida.createInitialDirectoryStructure();
        // Creating the directory structure for each clients
        //testSalida.createDirectoryForClient(clientes);
        // Writing all CD files at once
        //testSalida.salidaDebito(clientes);
                
        
    }
}
