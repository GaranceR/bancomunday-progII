package bancomunday;
import java.io.*;
import java.util.*;
public class ArchivosBancoMunday {
    private String rutaCarpeta="...\\BancoMunday\\Archivos",entradaB="\\Banco",entradaC="\\Cargas",salidas="\\ClientesArchivos",cuenta;
    private File archivo;
    private FileReader lector;
    private FileWriter escritor;
    private List<String> datos=new ArrayList<String>();
    
    private void escribirOUT(String cuenta)throws IOException{
        this.lector=null;
        this.archivo=new File(this.rutaCarpeta+this.salidas+cuenta+".out");
        this.escritor=null;
        int c;
        String data="";
        try{
            this.lector=new FileReader(this.rutaCarpeta+this.entradaC+cuenta+".in");
            this.escritor=new FileWriter(this.archivo, true);
            while((c=this.lector.read())!=-1){
                if((c!=',')||(c!=';')){
                    data+=c;
                }
                else{
                    this.datos.add(data);
                    data="";
                }
            }
            for(String x:this.datos){
                
            }
        }catch(FileNotFoundException ex){
            try{
                this.lector=new FileReader(this.rutaCarpeta+this.entradaC+cuenta+".in");
                this.escritor=new FileWriter(this.archivo);
                while((c=this.lector.read())!=-1){
                    if((c!=',')||(c!=';')){
                        data+=c;
                    }
                    else{
                        this.datos.add(data);
                        data="";
                    }
                }
            }catch(IOException ex1){
                System.out.println("Error al realizar la operacion...\n"+ex1);
            }
        }finally{
            this.escritor.close();
        }
    }
    private void crearDir(String rut){
        try{
            this.archivo=new File(this.rutaCarpeta+this.salidas+rut);
            this.archivo.mkdir();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    /*private void lectura(String cuenta)throws IOException{
        this.archivo=new File(this.rutaCarpeta+cuenta+".in");
        FileReader leer=null;
        try{
            leer=new FileReader(this.archivo);
            int c;
            while((c=leer.read())!=-1){
                System.out.print(c);
            }
        }catch(FileNotFoundException ex){
            System.out.println("Error al realizar la operacion...\n"+ex);
        }finally{
            leer.close();
        }
    }*/
    
}
