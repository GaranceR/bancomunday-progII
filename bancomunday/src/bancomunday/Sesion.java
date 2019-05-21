
package bancomunday;

import java.util.ArrayList;

public class Sesion {
    public void Simulador(){
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Tarjeta_Credito> cuentasTC = new ArrayList<>();
        ArrayList<Tarjeta_Debito> cuentasCD = new ArrayList<>();
        Carga test1 = new Carga();
        test1.cargarBanco();
        test1.cargarClientes(clientes);
        System.out.println(clientes);
        test1.cargarDebito(cuentasCD);
        System.out.println("Las cuentas son: "+cuentasCD);
        
    }
}
