/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancomunday;

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
            if ("A".equals(auxiliar.get(i).get(1))) {
                tarjeta_aux.setMontoMax(200000);
            }
            else if("B".equals(auxiliar.get(i).get(1))){
                tarjeta_aux.setMontoMax(600000);
            }
            else if ("C".equals(auxiliar.get(i).get(1))){
                tarjeta_aux.setMontoMax(900000);
            }
            else if ("D".equals(auxiliar.get(i).get(1))){
                tarjeta_aux.setMontoMax(1300000);
            }
            tarjeta_aux.setBloqueado(auxiliar.get(i).get(3));
            ArrayList<String> a = tarjeta_aux.Asignar();
            //Se añade la cuenta debito a la lista
            List.add(a);
        }
    }
    public void cargarCredito(){
        
    }
    public void cargarSimulacion(){
        
    }
}
