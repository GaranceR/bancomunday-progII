package Proyecto;
import java.awt.event.*;
public class Oyentes implements ActionListener{
    private Operaciones op=new Operaciones();
    private int b;
    public Oyentes(){
        b=7;
    }
    public Oyentes(int a){
        b=a;
    }
    @Override
    public void actionPerformed(ActionEvent evento){
        switch(b){
            case 0:
                //Abonar
                /*if(op.Abonar(TarjetasDB, TarjetasCD, Muday, Valor, NumeroCuenta)){
                    
                }*/
                
                break;
            case 1:
                //Retirar
                /*if(op.Retirar(TarjetasDB, Muday, Valor, NumeroCuenta)){
                    
                }*/
                break;
            case 2:
                //Pagar Compra o Pagar en cuotas
                
                break;
            case 3:
                System.out.println("j");
                //Comprar Inversion
                break;
            case 4:
                System.out.println("a"+"985623");
                //Recibir Transferencia
                break;
            case 5:
                System.out.println("a86532");
                //Realizar Transferencia
                break;
            case 6:
                System.out.println("SUPP");
                //Generar Corte
                break;
            default:
                System.out.println("a");
                break;
        }
    }
}
