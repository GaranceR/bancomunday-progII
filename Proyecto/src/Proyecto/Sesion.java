
package Proyecto;

import java.io.IOException;
import java.util.ArrayList;

public class Sesion {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<ArrayList<String>> clientes_aux = new ArrayList<>();
    private ArrayList<Tarjeta_Credito> cuentasTC = new ArrayList<>();
    private ArrayList<ArrayList<String>> cuentasTC_aux = new ArrayList<>();
    private ArrayList<Tarjeta_Debito> cuentasCD = new ArrayList<>();
    private ArrayList<ArrayList<String>> cuentasCD_aux = new ArrayList<>();
    private Banco Muday=new Banco();
    private Carga c=new Carga();
    public void Cargar(){
        Muday=c.cargarBanco(Muday);
        c.cargarClientes(clientes,clientes_aux);
        c.cargarDebito(cuentasCD,cuentasCD_aux);
        c.cargarCredito(cuentasTC,cuentasTC_aux);
        
    }
    
    /*public void Simulador() throws IOException{
        
        Banco Muday = new Banco();

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
       
        //Operaciones
        
        Operaciones test2 = new Operaciones();
        System.out.println("El saldo antes de la operacion es: "+cuentasCD.get(0).getSaldo());
        test2.Abonar(cuentasCD, cuentasTC, Muday,"5000","CD10-1234");
        System.out.println("El saldo despues de la operacion es: "+cuentasCD.get(0).getSaldo());
        
        
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
                
        
    //}
}
