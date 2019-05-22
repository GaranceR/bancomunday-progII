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
           new File("content/Archivos/ClientesArchivos/Cliente" + client_number + "/EstadosDeCuenta/").mkdirs();
        }

    }



    public void theBigLoopOfSalida(ArrayList ListOfClientes) throws IOException{

        // Creating an iterator to loop over the ListOfClientes
        Iterator i = ListOfClientes.iterator();

        // Initialization of variable for naming files
        int client_number = 0;
        int number_of_CD = 0;
        int number_of_TC = 0;

        while (i.hasNext()) {

          // Temporary Cliente variable to get attribute
          Cliente tempCliente = (Cliente) i.next();

          // incrementing variable for directory naming
          client_number++;

            try {

              /*******************************************
              // TODO : LOOP - if the client has a CD then
              // Missing, incrementing number_of_CD
              ********************************************/

              // Creating all corte debito files .out
              salidaDebito(tempCliente, client_number);

              // Creating all estado de cuenta debito files .out
              salidaEstadoDeCuentaDebito(tempCliente, client_number, number_of_CD);

              /*******************************************
              // TODO : LOOP - if the client has a TC then
              // Missing, incrementing number_of_TC
              ********************************************/

              // Creating all corte credito files .out
              salidaCredito(tempCliente, client_number);

              // Creating all estado de cuenta debito files .out
              salidaEstadoDeCuentaCredito(tempCliente, client_number, number_of_TC);

            } catch (IOException ex) {

              System.out.println("Couldn't do the big loop..");
              // Debug
              System.out.println(ex);
          }
        }
      }


    public void salidaDebito(Cliente cliente, int client_number) throws IOException {

        // Used to get the current date - to be improved..
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy");
        LocalDate localDate = LocalDate.now();
        String formated_date = dtf.format(localDate);

        try {
            // Creating the file for the client 'number' using the FORMAT : ../ClientesArchivos/ClienteX/corte_CD_dd_mm_aaaa.out
            FileWriter writer = new FileWriter("content/Archivos/ClientesArchivos/Cliente" + client_number + "/corte_CD_" + formated_date + ".out", false);

            // Writing the headers
            writer.write("Fecha             Debe     Haber   Saldo   Descripción\n");

            /*********************************************
            // To be improved to add all the needed content
            **********************************************/

            // Writing the content (getting the attributes from the iterator's casted objects)
            writer.write("[01/03/2019]               93873\n");
            writer.write("[01/03/2019]               5500    88373   Chorrillana Local JPerez Valpo\n");
            writer.write("[01/03/2019]               7000    81373   Transferencia externa Pancho Saavedra\n");
            writer.write("[01/03/2019]               300     81073   Comision transf.externa\n");
            writer.write("[03/03/2019]               1200    79873   Almuerzo Junaeb CIAE\n");
            writer.write("[04/03/2019]               3600    76273   Almuerzo Extra CIAE\n");

            // Closing the writer
            writer.close();

        } catch (IOException ex) {

            System.out.println("Couldn't write corte Debito de RUT : " + cliente.getRUT() +" to file..");
            // Debug
            System.out.println(ex);
        }

    }

    public void salidaCredito(Cliente cliente, int client_number) throws IOException {

        // Used to get the current date - to be improved..
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy");
	      LocalDate localDate = LocalDate.now();
        String formated_date = dtf.format(localDate);

        try {
            // Creating the file for the client 'number' using the FORMAT : ../ClientesArchivos/ClienteX/corte_TC_dd_mm_aaaa.out
            FileWriter writer = new FileWriter("content/Archivos/ClientesArchivos/Cliente" + client_number + "/corte_TC_" + formated_date + ".out", false);

            // Writing the headers
            writer.write("Fecha             Debe        Haber         Saldo       Descripción\n");

            /*********************************************
            // To be improved to add all the needed content
            **********************************************/

            // Writing the content (getting the attributes from the iterator's casted objects)
            writer.write("[01/03/2019]                                257640"+"\n");
            writer.write("[05/03/2019]                  40000         297640      TWISTED METAL I PS1, 2"+"\n");

            // Closing the writer
            writer.close();

        } catch (IOException ex) {

            System.out.println("Couldn't write corte Credito to file for Cliente de RUT : " + cliente.getRUT() +" ..");
            // Debug
            System.out.println(ex);
        }
    }

    public void salidaEstadoDeCuentaDebito(Cliente cliente, int client_number, int number_of_CD) throws IOException {

        // Used to get the current date - to be improved..
	      LocalDate localDate = LocalDate.now();

        // Formated date for the content of the file.out
        DateTimeFormatter dtf_content = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formated_date_content = dtf_content.format(localDate);

        try {
            // Creating the file for the client 'number' using the FORMAT : ../ClientesArchivos/ClienteX/EstadosDeCuenta/CD-EC-dd-MM-yyyy.out
            FileWriter writer = new FileWriter("content/Archivos/ClientesArchivos/Cliente" + client_number + "/EstadosDeCuenta/"+ "CD-EC" + number_of_CD + ".out", false);

            // Writing the first part of "estado de cuenta"

            /*********************************************
            // To be improved to add all the needed content
            **********************************************/

            // Writing the testing content (getting the attributes from the iterator's casted objects)
            writer.write("Número de Estado de Cuenta :" + "CD-EC" + number_of_CD + "\n");
            writer.write("Fecha de Emisión :" + formated_date_content + "\n");
            writer.write("Nombre del Titular :" + cliente.getNombre() + "\n");
            writer.write("RUT :" + cliente.getRUT() + "\n");
            writer.write("Cuenta :" + "CD" + "\n");
            writer.write("Numero de Cuenta :" + "CD10-1234" + "\n");
            writer.write("Categoria :" + "B" + "\n");
            writer.write("Monto Máximo :" + "200000" + "\n");
            writer.write("Monto Actual :" + "76573" + "\n");

            // Writing delimiters
            writer.write("-------------------------------------------------------------------------------"+"\n");
            writer.write("Fecha         Debe        Haber       Saldo       Descripción"+"\n");
            writer.write("-------------------------------------------------------------------------------"+"\n");

            // Writing the second part of "estado de cuenta"

            /*********************************************
            // To be improved to add all the needed content
            **********************************************/

            // Writing the testing content (getting the attributes from the iterator's casted objects of Tarjetas)
            writer.write("01/03/2019                93873"+"\n");
            writer.write("01/03/2019                5500        88373       Chorrillana Local JPerez Valpo"+"\n");
            writer.write("01/03/2019                7000        81373       Transf. externa Pancho Saavedra"+"\n");
            writer.write("01/03/2019                300         81073       Comision bancaria transf. externa"+"\n");
            writer.write("03/03/2019                1200        79873       Almuerzo Junaeb CIAE"+"\n");
            writer.write("04/03/2019                3600        76273       Almuerzo Extra CIAE"+"\n");
            writer.write("31/03/2019                3000        73273       Descuento por uso tipo B"+"\n");

            // Closing the writer
            writer.close();

        } catch (IOException ex) {

            System.out.println("Couldn't write estado de cuenta de Debito to file for Cliente de RUT : " + cliente.getRUT() +" ..");
            // Debug
            System.out.println(ex);
        }

    }

    public void salidaEstadoDeCuentaCredito(Cliente cliente, int client_number, int number_of_TC) throws IOException {

        // Used to get the current date - (to be improved ?)
	      LocalDate localDate = LocalDate.now();

        // Formated date for the content of the name of the archive
        DateTimeFormatter dtf_archive = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formated_date_archive = dtf_archive.format(localDate);

        // Formated date for the content of the file.out
        DateTimeFormatter dtf_content = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formated_date_content = dtf_content.format(localDate);

        try {
            // Creating the file for the client 'number' using the FORMAT : ../ClientesArchivos/ClienteX/EstadosDeCuenta/CD-EC-dd-MM-yyyy.out
            FileWriter writer = new FileWriter("content/Archivos/ClientesArchivos/Cliente" + client_number + "/EstadosDeCuenta/" + "TC-EC" + number_of_TC + ".out", false);

            /***********************************************************************
            // To be improved : adding all the needed content from passed attributes
            ************************************************************************/

            // Writing the first part of "estado de cuenta"

            // Writing the content (need to add a loop over iterators objects to replace the attributes)
            writer.write("Número de Estado de Cuenta :" + "CD-EC" + number_of_TC + "\n");
            writer.write("Fecha de Emisión :" + formated_date_content  + "\n");
            writer.write("Nombre del Titular :" + cliente.getNombre() + "\n");
            writer.write("RUT :" + cliente.getRUT() + "\n");
            writer.write("Cuenta :" + "CD" + "\n");
            writer.write("Numero de Cuenta :" + "CD10-1234" + "\n");
            writer.write("Categoria :" + "B" + "\n");
            writer.write("Monto Máximo :" + "200000" + "\n");
            writer.write("Monto Actual :" + "76573" + "\n");

            // Writing delimiters
            writer.write("-------------------------------------------------------------------------------"+"\n");
            writer.write("Fecha         Debe        Haber       Saldo       Descripción"+"\n");
            writer.write("-------------------------------------------------------------------------------"+"\n");

            // Writing the second part of "estado de cuenta"

            // Writing the testing content (need to add a loop over iterators objects to replace the attributes)
            writer.write("01/03/2019                93873"+"\n");
            writer.write("01/03/2019                5500        88373       Chorrillana Local JPerez Valpo"+"\n");
            writer.write("01/03/2019                7000        81373       Transf. externa Pancho Saavedra"+"\n");
            writer.write("01/03/2019                300         81073       Comision bancaria transf. externa"+"\n");
            writer.write("03/03/2019                1200        79873       Almuerzo Junaeb CIAE"+"\n");
            writer.write("04/03/2019                3600        76273       Almuerzo Extra CIAE"+"\n");
            writer.write("31/03/2019                3000        73273       Descuento por uso tipo B"+"\n");

            // Closing the writer
            writer.close();

        } catch (IOException ex) {
            System.out.println("Couldn't write estado de cuenta de Credito to file for Cliente de RUT : " + cliente.getRUT() +" ..");
            // Debug
            System.out.println(ex);
        }

    }

}
