/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Salida {
    /******************************************
    *  Genera los archivos de Salida
    *  Se necesita un estado de cuenta por cada cliente;
    *  cada cliente tiene una CD y una TC
    * 
    *******************************************/
    
    // Variable holding the content to be written to the file.out for testing purpose
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
    // Constructor
    public Salida(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }
    
    public void createInitialDirectoryStructure(){
        // Create the directory structure at the mentionned path
        new File("content/Archivos/ClientesArchivos/").mkdirs();
    }
    
    public void createDirectoryForClient(ArrayList ListOfClientes){
        // Creating an iterator to loop over the ListOfClientes
        Iterator i = ListOfClientes.iterator();
        // Initial number to append in the name of the directory
        int client_number = 0;
        // While the are still clients do
        while (i.hasNext()) {
           System.out.println(i.next());
           client_number++;
           // Creating the directory for the client 'number'
           new File("content/Archivos/ClientesArchivos/Cliente" + client_number).mkdirs();          
        }
        
    }
    
    public void salidaDebito(ArrayList ListOfClientes) throws IOException{

        // Used to get the current date - to be improved..
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy");
	LocalDate localDate = LocalDate.now();
        String formated_date = dtf.format(localDate);
        
        // Creating an iterator to loop over the ListOfClientes
        Iterator i = ListOfClientes.iterator();
        // Initial number to append in the name of the directory
        int client_number = 0;
        // While the are still clients do
        while (i.hasNext()) {
            System.out.println(i.next());
            client_number++;
            try {
                // Creating the file for the client 'number' using the FORMAT : ../ClientesArchivos/ClienteX/corte_CD_dd_mm_aaaa.out
                FileWriter writer = new FileWriter("content/Archivos/ClientesArchivos/Cliente" + client_number + "/corte_CD_" + formated_date + ".out");
                
                /*********************************************
                // To be improved to add all the needed content
                **********************************************/
                writer.write("test");
                
                // Closing the writer
                writer.close(); 
            } catch (IOException ex) {
                System.out.println("Couldn't write to file..");
                // Debug
                System.out.println(ex);
            }
        
        }

    }
    
    public void salidaCredito(ArrayList ListOfClientes){
// Used to get the current date - to be improved..
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy");
	LocalDate localDate = LocalDate.now();
        String formated_date = dtf.format(localDate);
        
        // Creating an iterator to loop over the ListOfClientes
        Iterator i = ListOfClientes.iterator();
        // Initial number to append in the name of the directory
        int client_number = 0;
        // While the are still clients do
        while (i.hasNext()) {
            System.out.println(i.next());
            client_number++;
            try {
                // Creating the file for the client 'number' using the FORMAT : ../ClientesArchivos/ClienteX/corte_TC_dd_mm_aaaa.out
                FileWriter writer = new FileWriter("content/Archivos/ClientesArchivos/Cliente" + client_number + "/corte_TC_" + formated_date + ".out");
                
                /*********************************************
                // To be improved to add all the needed content
                **********************************************/
                writer.write("test");
                
                // Closing the writer
                writer.close(); 
            } catch (IOException ex) {
                System.out.println("Couldn't write to file..");
                // Debug
                System.out.println(ex);
            }
        
        }
    }
    
    public void salidaSimulacion() throws IOException{
        // Just for testing purpose
        Archivo test_archivo = new Archivo();
        ArrayList<ArrayList<String>> payload = new ArrayList<>();
        //list1 = arc1.leerArchivo("content/Archivos/Cargas/Simulador.in");
    }
}
