package bancomunday;
import java.util.ArrayList;
import java.util.List;
//0 cuentaE,1 operacion,2 monto,3 nombreS,4 cuenta,5 rut,6 boolean,7 descripcion
public abstract class Herencia_tarjetas {
	
    protected ArchivosBancoMunday archivo;
    protected List<String> operaciones = new ArrayList<String>();//Lista para despues enviar los datos de los archivos .out de la cuenta
    protected abstract String abonar(String[] datos);
    protected abstract String cargar(String[] datos);
    protected String comprarPagar(String[] datos){
        String resultado="";
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
        }*/
        return resultado;
    }
    protected String comprarInversion(String[] datos){
        String resultado="";
        //revisar saldo disponible CD
        //realizar pago
        //añadir datos a operaciones
        /*int monto;
        System.out.print("Ingrese un monto: ");
        monto=this.dato.nextInt();
        return this.saldo+monto;*/
        return resultado;
    }
    protected String recibirTransferencia(String[] datos){
        String resultado="";
        //leer cuentaCD o TC para monto
        //aumentar el dinero
        //añadir datos a operaciones
        return resultado;
    }

    protected String realizarTransferencia(String[] datos){
        String resultado="";
        //leer cuenta CD o TC para monto
        //disminuir el dinero
        //añadir datos a operaciones
        return resultado;
    }
    protected void corteDeCuenta(String cuenta){
        //crear .out con los datos
    }
}
