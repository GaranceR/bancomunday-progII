/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.IOException;
import java.util.ArrayList;


public class Carga {
    ArrayList<ArrayList<String>> auxiliar = new ArrayList<>();
    Banco banco = new Banco();
    Archivo cuentasCD = new Archivo();
    Archivo cuentasTC = new Archivo();
    Archivo Clientes = new Archivo();
    
    public void cargarBanco(){
        auxiliar = cuentasCD.leerArchivo("C:\\Users\\Galda\\Desktop\\Progra 2\\bancomunday-progII\\JavaApplication\\content\\Archivos\\Banco\\Banco.in");
        banco.setPatrimonio(Integer.valueOf(auxiliar.get(0).get(0)));
        banco.setFechaInicio(auxiliar.get(0).get(1));
        banco.setComisionBancaria(Integer.valueOf(auxiliar.get(0).get(0)));
    }
    public void cargarClientes(ArrayList List){
        auxiliar = Clientes.leerArchivo("C:\\Users\\Galda\\Desktop\\Progra 2\\bancomunday-progII\\JavaApplication\\content\\Archivos\\Cargas\\Clientes.in");
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
            List.add(a);
        }
    }
    public void cargarDebito(ArrayList List){
        auxiliar = cuentasCD.leerArchivo("C:\\Users\\Galda\\Desktop\\Progra 2\\bancomunday-progII\\JavaApplication\\content\\Archivos\\Cargas\\CuentasCD.in");
        for (int i = 0; i < auxiliar.size(); i++) {
            Tarjeta_Debito tarjeta_aux = new Tarjeta_Debito();
            tarjeta_aux.setNumeroCuenta(auxiliar.get(i).get(0));
            tarjeta_aux.setCategoria(auxiliar.get(i).get(1));
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
            List.add(a);
        }
    }
    public void cargarCredito(ArrayList List){
        auxiliar = cuentasTC.leerArchivo("C:\\Users\\Galda\\Desktop\\Progra 2\\bancomunday-progII\\JavaApplication\\content\\Archivos\\Cargas\\CuentasTC.in");
        for (int i = 0; i < auxiliar.size(); i++) {
            Tarjeta_Credito tarjeta_aux = new Tarjeta_Credito();
            tarjeta_aux.setNumeroCuenta(auxiliar.get(i).get(0));
            tarjeta_aux.setCategoria(auxiliar.get(i).get(1));
            tarjeta_aux.setMontoDisponible(Integer.valueOf(auxiliar.get(i).get(2)));
            tarjeta_aux.setDiaPago(auxiliar.get(i).get(3));
            tarjeta_aux.setBloqueado(auxiliar.get(i).get(4));
            tarjeta_aux.setDiaCorte(String.valueOf(Integer.valueOf(auxiliar.get(i).get(3))-8));
            if (null != auxiliar.get(i).get(1)) switch (auxiliar.get(i).get(1)) {
                case "A":
                    tarjeta_aux.setCategoria("Premium");
                    tarjeta_aux.setCupoMaximo(300000);
                    tarjeta_aux.setCuotasSinInteres(0);
                    tarjeta_aux.setInteresMensual(1.059);
                    tarjeta_aux.setDescuento(2000);
                    break;
                case "B":
                    tarjeta_aux.setCategoria("Cylean");
                    tarjeta_aux.setCupoMaximo(700000);
                    tarjeta_aux.setCuotasSinInteres(3);
                    tarjeta_aux.setInteresMensual(1.042);
                    tarjeta_aux.setDescuento(3000);
                    break;
                case "C":
                    tarjeta_aux.setCategoria("Copper");
                    tarjeta_aux.setCupoMaximo(1000000);
                    tarjeta_aux.setCuotasSinInteres(5);
                    tarjeta_aux.setInteresMensual(1.031);
                    tarjeta_aux.setDescuento(2000);
                    break;
                case "D":
                    tarjeta_aux.setCategoria("Gold");
                    tarjeta_aux.setCupoMaximo(1200000);
                    tarjeta_aux.setCuotasSinInteres(7);
                    tarjeta_aux.setInteresMensual(1.019);
                    tarjeta_aux.setDescuento(2000);
                    break;
                default:
                    break;
            }
            ArrayList<String> a = tarjeta_aux.Asignar();
            //Se añade la cuenta credito a la lista
            List.add(a);
        }
    }
    public void cargarSimulacion() throws IOException{
        Operaciones op = new Operaciones(); 
        Archivo arc1 = new Archivo();
        ArrayList<ArrayList<String>> list1 = new ArrayList<>();
        list1 = arc1.leerArchivo("C:\\Users\\Galda\\Desktop\\Progra 2\\bancomunday-progII\\bancomunday\\content\\Archivos\\Cargas\\Simulador.in");
        for (int i = 1; i < list1.size(); i++) {
            System.out.println(list1.get(i));
            if ("NEXTDAY".equals(list1.get(i).get(0))){
                op.Next_Day();
                //Change date
            }
            else if ("---------------------------------------------------------------------------".equals(list1.get(i).get(0))){
            }
            else{
                String numero = list1.get(i).get(1);
                switch (numero){
                    case "1":
                        op.Abonar();
                        //Do something
                        break;
                    case "2":
                        op.Cargar();
                        //Do Something
                        break;
                    case "3":
                        op.Comprar_Pagar();
                        //Do something
                        break;
                    case "4":
                        op.Comprar_Inversion();
                        //Do something
                        break;
                    case "5":
                        op.Recibir_Transferencia();
                        //Do something
                        break;
                    case "6":
                        op.Realizar_Transferencia();
                        //Do Something
                        break;
                    case "7":
                        op.Generar_Corte();
                        //Do something
                        break;
                    default:
                        //Do Something
                }
            }
        }
    }
}
