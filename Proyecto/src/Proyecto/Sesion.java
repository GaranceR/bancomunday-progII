
package Proyecto;

import java.io.IOException;
import java.util.ArrayList;

public class Sesion {
    public void Simulador() throws IOException{
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Tarjeta_Credito> cuentasTC = new ArrayList<>();
        ArrayList<Tarjeta_Debito> cuentasCD = new ArrayList<>();
        
        Carga test1 = new Carga();
        test1.cargarBanco();
        test1.cargarClientes(clientes);
        System.out.println("Los Clientes son: "+clientes);
        test1.cargarDebito(cuentasCD);
        System.out.println("Las CuentasDebito son: "+cuentasCD);
        test1.cargarCredito(cuentasTC);
        System.out.println("Lasc CuentasCredito son: "+cuentasTC);
        System.out.println("Las Operaciones son: ");
        test1.cargarSimulacion();
        
    }
}
