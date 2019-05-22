    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.ArrayList;

public class Operaciones {

    public void Abonar(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasCD,Banco Muday,String Valor,String NumeroCuenta){
        Integer montoInt = Integer.valueOf(Valor);
        for (int i = 0; i < TarjetasDB.size(); i++) {
            if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta) ){
                TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()+montoInt);
                Muday.setPatrimonio(Muday.getPatrimonio()+montoInt);
            }
        }
        for (int i = 0; i < TarjetasCD.size(); i++) {
            if((TarjetasCD.get(i).getNumeroCuenta().equals(NumeroCuenta))){
                TarjetasCD.get(0).setDeuda(TarjetasCD.get(i).getDeuda()-montoInt);
                Muday.setPatrimonio(Muday.getPatrimonio()+montoInt);
            }
        }
        
    }
    public void Retirar(ArrayList<Tarjeta_Debito> TarjetasDB,Banco Muday,String Valor,String NumeroCuenta){
        Integer montoInt = Integer.valueOf(Valor);
        for (int i = 0; i < TarjetasDB.size(); i++) {
            if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta) ){
                TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()-montoInt);
                Muday.setPatrimonio(Muday.getPatrimonio()-montoInt);
            }
        }
    }
    
    public void Pagar_Compra(ArrayList<Tarjeta_Debito> TarjetasDB,Banco Muday,String Valor,String NumeroCuenta,String Descripcion){
        Integer montoInt = Integer.valueOf(Valor);
        for (int i = 0; i < TarjetasDB.size(); i++) {
            if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta) ){
                if (TarjetasDB.get(i).getSaldo() > 0) {
                    TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()-montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()-montoInt);
                }
            }
        }
    }
    public void Pagar_Compra_Cuotas(ArrayList<Tarjeta_Credito> TarjetasCD,Banco Muday,String Valor,String NumeroCuenta,String Descripcion,Integer numeroCuotas){
        for (int i = 0; i < TarjetasCD.size(); i++) {
            //Metodo para la compra de cuotas pendiente
        }
    }
    
    public void Comprar_Inversion(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasCD,String Valor,String NumeroCuenta){
        Integer montoInt = Integer.valueOf(Valor);
        for (int i = 0; i < TarjetasDB.size(); i++) {
            if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta)){
                if (TarjetasDB.get(i).getSaldo() > 0) {
                    TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()-montoInt);
                }
            }
        }
        for (int i = 0; i < TarjetasCD.size(); i++) {
            if((TarjetasCD.get(i).getNumeroCuenta()).equals(NumeroCuenta)){
                if (TarjetasCD.get(i).getMontoDisponible()>0){
                    TarjetasCD.get(i).setMontoDisponible(TarjetasCD.get(i).getMontoDisponible()-montoInt);
                }
            }
        }
    }
    
    public void Recibir_Transferencia(ArrayList<Tarjeta_Debito> TarjetasDB,String Valor,String NumeroCuenta,Banco Muday){
        Integer montoInt = Integer.valueOf(Valor);
        for (int i = 0; i < TarjetasDB.size(); i++) {
            if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta) ){
                TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()+montoInt);
                Muday.setPatrimonio(Muday.getPatrimonio()+montoInt);
            }
        }
    }
    
    public void Realizar_Transferencia(){
    }
    
    public void Generar_Corte(){
        
    }
    
    public void Next_Day(){
        
    }
}
