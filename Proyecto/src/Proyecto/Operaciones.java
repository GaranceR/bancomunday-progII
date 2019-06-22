/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.ArrayList;

public class Operaciones {

    public boolean Abonar(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasCD,Banco Muday,String Valor,String NumeroCuenta){
        try{
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
            return true;
        }catch(Exception ex){
            return false;
        }
        
    }
    public boolean Retirar(ArrayList<Tarjeta_Debito> TarjetasDB,Banco Muday,String Valor,String NumeroCuenta){
        try{
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetasDB.size(); i++) {
                if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta) ){
                    TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()-montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()-montoInt);
                }
            }
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean Pagar_Compra(ArrayList<Tarjeta_Debito> TarjetasDB,Banco Muday,String Valor,String NumeroCuenta,String Descripcion){
        try{
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetasDB.size(); i++) {
                if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta) ){
                    if (TarjetasDB.get(i).getSaldo() > 0) {
                        TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()-montoInt);
                        Muday.setPatrimonio(Muday.getPatrimonio()-montoInt);
                    }
                }
            }
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    public void Pagar_Compra_Cuotas(ArrayList<Tarjeta_Credito> TarjetasCD,Banco Muday,String Valor,String NumeroCuenta,String Descripcion,Integer numeroCuotas){
        for (int i = 0; i < TarjetasCD.size(); i++) {
            //Metodo para la compra de cuotas pendiente
        }
    }
    
    public boolean Comprar_Inversion(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasCD,String Valor,String NumeroCuenta){
        try{    
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
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean Recibir_Transferencia(ArrayList<Tarjeta_Debito> TarjetasDB,String Valor,String NumeroCuenta,Banco Muday){
        try{
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetasDB.size(); i++) {
                if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta) ){
                    TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()+montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()+montoInt);
                }
            }
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean Realizar_Transferencia(ArrayList<Tarjeta_Debito> TarjetaDB, String Valor, String NumeroCuenta, Banco Muday){
        try{
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetaDB.size(); i++) {
                if ((TarjetaDB.get(i).getNumeroCuenta()).equals(NumeroCuenta) ){
                    TarjetaDB.get(i).setSaldo(TarjetaDB.get(i).getSaldo()-montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()+montoInt);
                }
            }
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean Generar_Corte(){
        try{
            
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean Next_Day(){
        try{
            
            return true;
        }catch(Exception ex){
            return false;
        }
    }
}
