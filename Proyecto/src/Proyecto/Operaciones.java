/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.ArrayList;

public class Operaciones {

    public boolean Abonar(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasTC, Banco Muday, String Valor, String NumeroCuenta){
        try {
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
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean Retirar(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasTC, Banco Muday, String Valor, String NumeroCuenta) {
    	try {
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetasDB.size(); i++) {
                if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()-montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()-montoInt);
                }
            }
            for (int i = 0; i < TarjetasTC.size(); i++) {
                if ((TarjetasTC.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    TarjetasTC.get(i).setMontoDisponible(TarjetasTC.get(i).getMontoDisponible()-montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()-montoInt);
                }
            }
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean Pagar_Compra(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasTC, Banco Muday, String Valor, String NumeroCuenta, String Descripcion){
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
            for (int i = 0; i < TarjetasTC.size(); i++) {
                if ((TarjetasTC.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                	
                	// si el MontoDisponible esta suficiente para que el usuario haga la compra
                	if (TarjetasTC.get(i).getMontoDisponible() > montoInt) {
                		TarjetasTC.get(i).setMontoDisponible(TarjetasTC.get(i).getMontoDisponible()-montoInt);
                	} 
                	// si el MontoDisponible es positivo pero no hay suficiente para la compra
                	else if ((TarjetasTC.get(i).getMontoDisponible() > 0) && (TarjetasTC.get(i).getMontoDisponible() < montoInt)) {
                		// Calculamos lo necesario de dinero que se necesita despues de tomar todo el montoDisponible
                		int dif = montoInt - TarjetasTC.get(i).getMontoDisponible();
                		// El usuario va a acabar su dinero en su montoDisponible
                		TarjetasTC.get(i).setMontoDisponible(0);
                		// Y ademas va a agregar el resto del dinero necesario para la compra a su deuda
                		TarjetasTC.get(i).setDeuda(dif);
                		// Consideramos que si el montoDisponible era > 0 la deuda era de 0
                	}
                	else if (TarjetasTC.get(i).getMontoDisponible() == 0) {
                    	TarjetasTC.get(i).setDeuda(TarjetasTC.get(i).getDeuda()+montoInt);
                	}
                    // en todos casos se va a disminuir el patrimonio del banco
                    Muday.setPatrimonio(Muday.getPatrimonio()-montoInt);
                    
                    /*
                     *  NOTE : hubiera sido mejor si la deuda estaba:
                     *  deuda = -(montoDisponible) cuando montoDisponible < 0
                     *  y no como un atributo a parte
                     *  Así esta funcion sería mucho más simple
                     */
                }
            }
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean Pagar_Compra_Cuotas(ArrayList<Tarjeta_Credito> TarjetasTC, Banco Muday, String Valor, String NumeroCuenta, String Descripcion, Integer numeroCuotas){
        try {
            Integer monto = Integer.parseInt(Valor);
            for (int i = 0; i < TarjetasTC.size(); i++) {
                if (TarjetasTC.get(i).getNumeroCuenta().equals(NumeroCuenta)) {
                    if (TarjetasTC.get(i).getCupoMaximo() >= monto){
                        if (TarjetasTC.get(i).getCuotasSinInteres() <= numeroCuotas) {
                            // Operaciones sin intereses
                        	// TODO agregar todo lo de checkear si montoDisponible > monto / > 0 ... como arriba en Pagar_Compra()
                            TarjetasTC.get(i).setMontoDisponible(TarjetasTC.get(i).getMontoDisponible()-monto);
                            Muday.setPatrimonio(Muday.getPatrimonio()-monto);
                        }
                        else{
                            // Operaciones con intereses
                            Integer interes = 0;
                            // TODO A ver de nuevo
                            monto += interes;
                            TarjetasTC.get(i).setMontoDisponible(TarjetasTC.get(i).getMontoDisponible()-monto);
                            Muday.setPatrimonio(Muday.getPatrimonio()-monto);
                        }
                    }
                }
            }
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean Comprar_Inversion(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasTC, String Valor, String NumeroCuenta){
        try {    
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetasDB.size(); i++) {
                if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    if (TarjetasDB.get(i).getSaldo() > 0) {
                        TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()-montoInt);
                        /* Como se compra un producto del Banco, no se cambia el Patrimonio
                         *  del Banco porque recibe el dinero
                         */
                    }
                }
            }
            for (int i = 0; i < TarjetasTC.size(); i++) {
                if ((TarjetasTC.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    if (TarjetasTC.get(i).getMontoDisponible() > 0) {
                    	/* TODO agregar todo lo de checkear si montoDisponible > monto / > 0 ... 
                    	* como arriba en Pagar_Compra()
                    	* o simplificar lo de la deuda / montoDisponible
                    	*/
                    	TarjetasTC.get(i).setMontoDisponible(TarjetasTC.get(i).getMontoDisponible()-montoInt);
                    }
                }
            }
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean Recibir_Transferencia(ArrayList<Tarjeta_Debito> TarjetasDB, ArrayList<Tarjeta_Credito> TarjetasTC, String Valor, String NumeroCuenta, Banco Muday){
        /*	Si la persona que realiza la transferencia es del mismo Banco
    	*	falta disminuir su montoDispinible del mismo monto
    	*/
    	try{
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetasDB.size(); i++) {
                if ((TarjetasDB.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    TarjetasDB.get(i).setSaldo(TarjetasDB.get(i).getSaldo()+montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()+montoInt);
                    // TO ADD : If the accounts (cuentas) are from the same bank then the patrimonio shouldn't change?!
                }
            }
            for (int i = 0; i < TarjetasTC.size(); i++) {
                if ((TarjetasTC.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    TarjetasTC.get(i).setMontoDisponible(TarjetasTC.get(i).getMontoDisponible()+montoInt);
                    // + TO ADD checkear con la deuda (o simplificar)
                    Muday.setPatrimonio(Muday.getPatrimonio()+montoInt);
                }
            }
            return true;
        } catch(Exception ex) {
            return false;
        }
    }
    
    public boolean Realizar_Transferencia(ArrayList<Tarjeta_Debito> TarjetaDB, ArrayList<Tarjeta_Credito> TarjetasTC, String Valor, String NumeroCuenta, Banco Muday){
    	/*	Si la persona que recibe la transferencia es del mismo Banco
    	*	falta aumentar su montoDispinible del mismo monto
    	*/
    	try{
            Integer montoInt = Integer.valueOf(Valor);
            for (int i = 0; i < TarjetaDB.size(); i++) {
                if ((TarjetaDB.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    TarjetaDB.get(i).setSaldo(TarjetaDB.get(i).getSaldo()-montoInt);
                    Muday.setPatrimonio(Muday.getPatrimonio()-montoInt);
                    // TO ADD : Same as above : If the accounts (cuentas) are from the same bank then the patrimonio shouldn't change?!
                }
            }
            for (int i = 0; i < TarjetasTC.size(); i++) {
                if ((TarjetasTC.get(i).getNumeroCuenta()).equals(NumeroCuenta)) {
                    TarjetasTC.get(i).setMontoDisponible(TarjetasTC.get(i).getMontoDisponible()-montoInt);
                    // + TO ADD checkear con la deuda (o simplificar)
                    Muday.setPatrimonio(Muday.getPatrimonio()-montoInt);
                }
            }            
            return true;
        } catch (Exception ex) {
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
