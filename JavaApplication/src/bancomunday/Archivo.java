package bancomunday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Archivo {
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
  
    public void escribirArchivo(String route,String[][] tarjeta) throws IOException{
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