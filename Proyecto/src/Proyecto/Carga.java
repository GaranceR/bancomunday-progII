/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Carga {
    ArrayList<ArrayList<String>> auxiliar = new ArrayList<>();
    Banco banco = new Banco();
    Archivo cuentasCD = new Archivo();
    Archivo cuentasTC = new Archivo();
    Archivo Clientes = new Archivo();
    
    public Banco cargarBanco(Banco Muday){
        auxiliar = cuentasCD.leerArchivo("Proyecto/content/Archivos/Banco/Banco.in"); 	// G : Por qué cuentasCD en banco?
        Muday.setPatrimonio(Integer.valueOf(auxiliar.get(0).get(0)));
        Muday.setFechaInicio(auxiliar.get(0).get(1));
        Muday.setComisionBancaria(Integer.valueOf(auxiliar.get(0).get(2)));
        return Muday;
    }
    public void cargarClientes(ArrayList<Cliente> List,ArrayList<ArrayList<String>> Lista_aux){
        auxiliar = Clientes.leerArchivo("Proyecto/content/Archivos/Cargas/Clientes.in");
        for (int i = 0; i < auxiliar.size(); i++) {
            Cliente cliente_aux = new Cliente();
            cliente_aux.setRUT(auxiliar.get(i).get(0));
            cliente_aux.setNombre(auxiliar.get(i).get(1));
            cliente_aux.setOcupacion(auxiliar.get(i).get(2));
            cliente_aux.setCorreo(auxiliar.get(i).get(3));
            cliente_aux.setTelefono(auxiliar.get(i).get(4));
            cliente_aux.setNombreUsuario(auxiliar.get(i).get(5));
            cliente_aux.setContrasena(auxiliar.get(i).get(6));
            cliente_aux.setMorosidad(auxiliar.get(i).get(7));
            ArrayList<String> a = cliente_aux.Asignar();
            //Se añade el cliente auxiliar a la lista
            List.add(cliente_aux);
            Lista_aux.add(a);
        }
    }
    public void cargarDebito(ArrayList<Tarjeta_Debito> Lista, ArrayList<ArrayList<String>> Lista_aux){
        auxiliar = cuentasCD.leerArchivo("Proyecto/content/Archivos/Cargas/CuentasCD.in");
        for (int i = 0; i < auxiliar.size(); i++) {
            Tarjeta_Debito tarjeta_aux = new Tarjeta_Debito();
            tarjeta_aux.setNumeroCuenta(auxiliar.get(i).get(0));
            tarjeta_aux.setCategoria(auxiliar.get(i).get(1));	 // G : Eso no sirve?
            tarjeta_aux.setSaldo(Integer.valueOf(auxiliar.get(i).get(2)));
            if (null != auxiliar.get(i).get(1)) switch (auxiliar.get(i).get(1)) {
                case "A":
                    tarjeta_aux.setCategoria("Premium");
                    tarjeta_aux.setMontoMax(200000);
                    tarjeta_aux.setDescuento(2000);
                    break;
                case "B":
                    tarjeta_aux.setCategoria("Cylean");
                    tarjeta_aux.setMontoMax(600000);
                    tarjeta_aux.setDescuento(3000);
                    break;
                case "C":
                    tarjeta_aux.setCategoria("Copper");
                    tarjeta_aux.setMontoMax(900000);
                    tarjeta_aux.setDescuento(4000);
                    break;
                case "D":
                    tarjeta_aux.setCategoria("Gold");
                    tarjeta_aux.setMontoMax(1300000);
                    tarjeta_aux.setDescuento(5000);
                    break;
                default:
                    break;
            }
            tarjeta_aux.setBloqueado(auxiliar.get(i).get(3));
            ArrayList<String> a = tarjeta_aux.Asignar();
            //Se añade la cuenta debito a la lista
            Lista.add(tarjeta_aux);
            Lista_aux.add(a);
        }
    }
    public void cargarCredito(ArrayList<Tarjeta_Credito> Lista, ArrayList<ArrayList<String>> Lista_aux){
        auxiliar = cuentasTC.leerArchivo("Proyecto/content/Archivos/Cargas/CuentasTC.in");
        for (int i = 0; i < auxiliar.size(); i++) {
            Tarjeta_Credito tarjeta_aux = new Tarjeta_Credito();
            tarjeta_aux.setNumeroCuenta(auxiliar.get(i).get(0));
            tarjeta_aux.setCategoria(auxiliar.get(i).get(1)); // G : Eso no sirve?
            tarjeta_aux.setMontoDisponible(Integer.valueOf(auxiliar.get(i).get(2)));
            tarjeta_aux.setDiaPago(auxiliar.get(i).get(3));
            tarjeta_aux.setBloqueado(auxiliar.get(i).get(4));
            tarjeta_aux.setDiaCorte(String.valueOf(Integer.valueOf(auxiliar.get(i).get(3))-8));
            if (null != auxiliar.get(i).get(1)) switch (auxiliar.get(i).get(1)) {
                case "A":
                    tarjeta_aux.setCategoria("Premium");
                    tarjeta_aux.setCupoMaximo(300000);
                    tarjeta_aux.setCuotasSinInteres(0);
                    tarjeta_aux.setInteresMensual(5.9);
                    tarjeta_aux.setDescuento(2000);
                    break;
                case "B":
                    tarjeta_aux.setCategoria("Cylean");
                    tarjeta_aux.setCupoMaximo(700000);
                    tarjeta_aux.setCuotasSinInteres(3);
                    tarjeta_aux.setInteresMensual(4.2);
                    tarjeta_aux.setDescuento(3000);
                    break;
                case "C":
                    tarjeta_aux.setCategoria("Copper");
                    tarjeta_aux.setCupoMaximo(1000000);
                    tarjeta_aux.setCuotasSinInteres(5);
                    tarjeta_aux.setInteresMensual(3.1);
                    tarjeta_aux.setDescuento(4000);
                    break;
                case "D":
                    tarjeta_aux.setCategoria("Gold");
                    tarjeta_aux.setCupoMaximo(1200000);
                    tarjeta_aux.setCuotasSinInteres(7);
                    tarjeta_aux.setInteresMensual(1.9);
                    tarjeta_aux.setDescuento(5000);
                    break;
                default:
                    break;
            }
            ArrayList<String> a = tarjeta_aux.Asignar();
            //Se añade la cuenta credito a la lista
            Lista.add(tarjeta_aux);
            Lista_aux.add(a);
            
        }
    }
    public void cargarSimulacion(ArrayList<Tarjeta_Credito> TC,ArrayList<Tarjeta_Debito> CD,Banco Muday) throws IOException{
        Operaciones operar = new Operaciones(); 
        Archivo arc1 = new Archivo();
        ArrayList<ArrayList<String>> list1 = new ArrayList<>();
        list1 = arc1.leerArchivo("Proyecto/content/Archivos/Cargas/Simulador.in");
        for (int i = 1; i < list1.size(); i++) {
            System.out.println(list1.get(i));
            if ("NEXTDAY".equals(list1.get(i).get(0))){
                //operar.Next_Day();
                //Change date
            }
            else if ("---------------------------------------------------------------------------".equals(list1.get(i).get(0))){
            	// Do nothing
            }
            else{
                String numero = list1.get(i).get(1);
                switch (numero){
                    case "1":
                        operar.Abonar(CD,TC,Muday,list1.get(i).get(2),list1.get(i).get(0));
                        break;
                    case "2":
                        operar.Retirar(CD,Muday,list1.get(i).get(2),list1.get(i).get(0));
                        break;
                    case "3":
                        if(list1.get(i).size() == 5){
                            operar.Pagar_Compra_Cuotas(TC,Muday,list1.get(i).get(2),list1.get(i).get(0),list1.get(i).get(3),Integer.valueOf(list1.get(i).get(4)));
                        }
                        else{
                            operar.Pagar_Compra(CD,TC,Muday,list1.get(i).get(2),list1.get(i).get(0),list1.get(i).get(3));
                            // G : falta secundo argumento List Tarjetas TC
                        }
                        break;
                    case "4":
                        operar.Comprar_Inversion(CD,TC,list1.get(i).get(2),list1.get(i).get(0));
                        break;
                    case "5":
                        operar.Recibir_Transferencia(CD,list1.get(i).get(2),list1.get(i).get(0),Muday);
                        break;
                    case "6":
                        operar.Realizar_Transferencia(CD,list1.get(i).get(2),list1.get(i).get(0),Muday);
                        break;
                    case "7":
                        //operar.Generar_Corte();
                        break;
                    default:
                }
            }
        }
    }
}
