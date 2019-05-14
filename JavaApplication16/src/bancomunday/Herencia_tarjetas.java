package bancomunday;
import java.util.ArrayList;
import java.util.List;

public abstract class Herencia_tarjetas {
	
    protected ArchivosBancoMunday archivo;
    protected abstract int abono(String[] datos);
    protected abstract int carga(String[] datos);
    protected abstract int comprarPagar(String[] datos);/*{
        /*int monto;
        String descripcion;
        System.out.print("Ingrese moto a pagar: ");
        monto=this.dato.nextInt();
        System.out.println("Ingrese una descripcion: ");
        descripcion=dato.next();
        if(this.saldo-monto+descuento>=0){
            Cargos.add(descripcion);
            return this.saldo+descuento-monto;
        }
        else{
            System.out.println("No es posible realizar la accion");
            return this.saldo;
        }
    }*/
    protected abstract int comprarInversion(String[] datos);/*{
        int monto;
        System.out.print("Ingrese un monto: ");
        monto=this.dato.nextInt();
        return this.saldo+monto;
    }*/
    protected abstract String realizarTransferencia(String[] datosE,String[] datosS);/*{
        int monto;
        String cuenta;
        System.out.print("Ingrese el monto a transferir: ");
        monto=this.dato.nextInt();
        System.out.print("Ingrese nombre de cuenta de transferencia: ");
        cuenta=this.dato.next();
        return cuenta+"-"+monto;
    }*/
    protected void corteDeCuetna(String[] datos){
        
    }
}
