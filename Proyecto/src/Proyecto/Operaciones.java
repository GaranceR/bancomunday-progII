/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.ArrayList;

public class Operaciones {

    public boolean Abonar(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasTC, Banco Muday, String Valor, String NumeroCuenta){
        try{
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetasDB.size(); i++) {
                if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()+montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()+montoInt);
                }
            }
            for (int i = 0; i < TarjetasTC.size(); i++) {
                if ((TarjetasTC.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    TarjetasTC.get(i).setDeuda(TarjetasTC.get(i).getDeuda()-montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()+montoInt);
                }
            }
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean Retirar(ArrayList<Tarjeta_Debito> TarjetasDB, Banco Muday, String Valor, String NumeroCuenta){
        // G : We can't "retirar" with Tarjetas de Credito ?! TO ADD ?
    	try{
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetasDB.size(); i++) {
                if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()-montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()-montoInt);
                }
            }
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean Pagar_Compra(ArrayList<Tarjeta_Debito> TarjetasDB, Banco Muday, String Valor, String NumeroCuenta, String Descripcion){
        try{
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetasDB.size(); i++) {
                if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
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

    public boolean Pagar_Compra_Cuotas(ArrayList<Tarjeta_Credito> TarjetasTC,Banco Muday,String Valor,String NumeroCuenta,String Descripcion,Integer numeroCuotas){
        try{
            Integer monto=Integer.parseInt(Valor);
            for (int i = 0; i < TarjetasTC.size(); i++) {
                if(TarjetasTC.get(i).getNumeroCuenta().equals(NumeroCuenta)){
                    if(TarjetasTC.get(i).getCupoMaximo()>=monto){
                        if(TarjetasTC.get(i).getCuotasSinInteres()<=numeroCuotas){
                            //operaciones sin intereses
                            TarjetasTC.get(i).setMontoDisponible(TarjetasTC.get(i).getMontoDisponible()-monto);
                            Muday.setPatrimonio(Muday.getPatrimonio()-monto);
                        }
                        else{
                            //operaciones con intereses
                            Integer interes=0;
                            monto+=interes;
                            TarjetasTC.get(i).setMontoDisponible(TarjetasTC.get(i).getMontoDisponible()-monto);
                            Muday.setPatrimonio(Muday.getPatrimonio()-monto);
                        }
                    }
                }
            }
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean Comprar_Inversion(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasTC, String Valor, String NumeroCuenta){
        try{    
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetasDB.size(); i++) {
                if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    if (TarjetasDB.get(i).getSaldo() > 0) {
                        TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()-montoInt);
                    }
                }
            }
            for (int i = 0; i < TarjetasTC.size(); i++) {
                if ((TarjetasTC.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    if (TarjetasTC.get(i).getMontoDisponible() > 0) {
                    	// G : Igual se podría hacer si MontoDisponible < 0 con deuda, no ? TO ADD ? 
                    	TarjetasTC.get(i).setMontoDisponible(TarjetasTC.get(i).getMontoDisponible()-montoInt);
                    }
                }
            }
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean Recibir_Transferencia(ArrayList<Tarjeta_Debito> TarjetasDB, String Valor, String NumeroCuenta, Banco Muday){
        try{
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetasDB.size(); i++) {
                if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()+montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()+montoInt);
                    // G : If the accounts (cuentas) are from the same bank then the patrimonio shouldn't change ?!
                }
            }
            // G : TODO ADD for TarjetaCredito also!
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean Realizar_Transferencia(ArrayList<Tarjeta_Debito> TarjetaDB, String Valor, String NumeroCuenta, Banco Muday){
        try{
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetaDB.size(); i++) {
                if ((TarjetaDB.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    TarjetaDB.get(i).setSaldo(TarjetaDB.get(i).getSaldo()-montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()+montoInt);
                    // G : Same as above : If the accounts (cuentas) are from the same bank then the patrimonio shouldn't change ?!
                }
            }
            // G : TODO ADD for TarjetaCredito also!
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
