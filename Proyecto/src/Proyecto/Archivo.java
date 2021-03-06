package Proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Archivo {

        /*******************************************
        * Clase para implementar el concepto de Archivos
        * y sus metodos relacionados como :
        * - leerArchivo
        * - escribirArchivo
        * - leerOrdenes
        * - leerArchivo
        ********************************************/
        
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
                        clon = (ArrayList<String>) aux.clone();
                    }
                    tarjeta.add(clon);
                    aux.clear();
                }

            }catch(IOException e){
                System.out.println("Algo salio mal :( .");
                // Debug
                System.out.println(e);
            }finally{
                try{
                    if(fr != null){
                        fr.close();
                    }
                }catch(IOException e2){
                    System.out.println("No se pudo cerrar el archivo.");
                    // Debug
                    System.out.println(e2);
                }
            }
        return tarjeta;
    }



    /**********************************
     * Metodo Implementa :
     * - Leer contenido
     * - de un archivo ya existente
     * - de una ruta especifica(url)
     * - y retorna una List<List<String>>
     * 
     * Hippo : I think that this method can be deleted
     *********************************/

    public List<List<String>> read_from_file(String url) throws IOException{

      // Initialize a List of Strings to capture content
      List<List<String>> records = new ArrayList<>();

      // Opening a BufferedReader to read the content from the file located at url
      try (BufferedReader br = new BufferedReader(new FileReader(url))) {

        String line;
        // For each line
        while ((line = br.readLine()) != null) {
            String line1=null;
          // Using a comma delimiter
          String[] values = line.split(",");
          records.add(Arrays.asList(values));
        }
      }
      // Printing out the content of the file Banco.in
      for (int i = 0; i < records.size(); i++) {
        System.out.println(records.get(i));
      }
      return records;
    }



    public void escribirArchivo(String route, String[][] tarjeta) throws IOException{

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
}
