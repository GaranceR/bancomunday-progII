package bancomunday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Archivo {

        /*******************************************
        * Class to implement the concept of Archives
        * and related methods such as :
        * - leerArchivo
        * - escribirArchivo
        * - leerOrdenes
        * - leerArchivo
        ********************************************/
        private String route = "";

        public Archivo(String route){
            this.route = route;
        }

        public ArrayList<ArrayList<String>> leerArchivo(String route){

            String texto;
            File f1 = null;
            ArrayList<ArrayList<String>> tarjeta = new ArrayList<ArrayList<String>>();
            ArrayList<String> aux = new ArrayList<>();
            ArrayList<String> clon = new ArrayList<>();
            FileReader fr = null;
            BufferedReader br = null;

            try{
                f1 = new File(route);
                fr = new FileReader(f1);
                br = new BufferedReader(fr);
                br.readLine();
                String line1=null;
                while((texto = br.readLine())!=null){
                    String[] linea = texto.replace(";","").replace(" ","").split(",");
                    for (int j = 0; j < linea.length; j++) {
                        aux.add(linea[j]);
                        clon =(ArrayList<String>) aux.clone();
                    }
                    tarjeta.add(clon);
                    aux.clear();
                }

            }catch(IOException e){
                System.out.println("Algo salio mal :( .");
            }finally{
                try{
                    if(fr != null){
                        fr.close();
                    }
                }catch(IOException e2){
                    System.out.println("No se pudo cerrar el archivo.");
                }
            }
        //System.out.println("AQUI TARJETA2: "+tarjeta);
        return tarjeta;
    }



    /**********************************
     * Method implementing :
     * - reading some content
     * - from an existing file
     * - at a specific location (url)
     * - and returning the content as a List<List<String>>
     *********************************/

    public void read_from_file(String url) throws IOException{

      // Initialize a List of Strings to capture content
      List<List<String>> records = new ArrayList<>();

      // Opening a BufferedReader to read the content from the file located at url
      try (BufferedReader br = new BufferedReader(new FileReader(url))) {

        String line;
        // For each line
        while ((line = br.readLine()) != null) {
          // Using a comma delimiter
          String[] values = line.split(",");
          records.add(Arrays.asList(values));
        }
      }
      // Printing out the content of the file Banco.in
      for (int i = 0; i < records.size(); i++) {
        System.out.println(records.get(i));
      }
      //return records;
    }



    public void escribirArchivo(String route,String[][] tarjeta) throws IOException{

        /**********************************
         * Method implementing :
         * - writing some content (tarjeta)
         * - to a (newly created?) file
         * - at a specific location (route)
         * - with a custom header starting with "#"
         *********************************/

            FileWriter fichero = null;
            PrintWriter pw = null;
            try{
                fichero = new FileWriter(route);
                pw = new PrintWriter(fichero);
                for (int i = 0;i < tarjeta.length;i++) {
                    for (int j = 0; j < tarjeta[0].length; j++) {
                        if (i==0 && j==0){
                            pw.println("#numeroCuenta,Categoria,Monto,Bloqueado");
                        }
                        if (tarjeta[i][j] == null){
                            pw.println("");
                            continue;
                        }
                        pw.print(""+tarjeta[i][j]+",");
                    }
                }
            }catch(Exception e){
                    System.out.println("Algo salio mal .");
                }finally{
                    try{
                        if(null != fichero)
                            fichero.close();
                    }catch(Exception e2){
                        System.out.println("No se puede cerrar el archivo.");
                    }
                }
        }
    public String leerOrdenes(String route){

        /**********************************
         * Method implementing :
         * - reading some content
         * - from an existing file
         * - at a specific location (route)
         * - and returning the content as a String
         *********************************/

        String texto = null;
        File f1 = null;
        ArrayList<String> Ordenes = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;

            try{
                f1 = new File(route);
                fr = new FileReader(f1);
                br = new BufferedReader(fr);
                br.readLine();
                texto = br.readLine();
                System.out.println(texto);
                //String[] linea = texto.replace(";","").replace(" ","").split(",");
            }catch(Exception e){
                System.out.println("Algo salio mal :( .");
            }finally{
                try{
                    if(fr != null){
                        fr.close();
                    }
                }catch(Exception e2){
                    System.out.println("No se pudo cerrar el archivo.");
                }
            }
            return texto;
    }
}

/*
public ArrayList<String> leerArchivo(String route) throws FileNotFoundException{
            String texto;
            int i = 0;
            ArrayList<String> Tarjeta = new ArrayList<>();
            try{
                BufferedReader bf = new BufferedReader(new FileReader(route));
                String bfRead;
                while ((bfRead = bf.readLine())!=null){
                    Tarjeta.add(bfRead);
                    String aux = Tarjeta.get(i);
                    StringTokenizer tokens = new StringTokenizer(aux);
                    String primertoken = tokens.nextToken();
                    String segundotoken = tokens.nextToken();
                    System.out.println(primertoken);
                    i++;
                }
            }catch(IOException e){
                System.out.println("Algo salio mal :( .");
            }

            return Tarjeta;
        }

*/
