package src.main.java.bancomunday;


public class bancoMundayImp {

    public static void main(String[] argv){

      Test_ReadAndWrite();

			// Tarjeta_debito cd1=new Tarjeta_debito("CD");

			// Tarjeta_credito tc1=new Tarjeta_credito("TC");

    }

    public static void Test_ReadAndWrite() {

      // --------------------------------------
      // Test To read the content of a .in file
      // --------------------------------------

      System.out.println("Testing method : ReadAndWrite");

      // Variable
      String file_test = "src/main/content/Archivos/Banco/Banco.in";

      // Instanciation
      ReadAndWrite ReadAndWriteObj = new ReadAndWrite();

      // Try - Running the main
      try {

        ReadAndWriteObj.main(file_test);

      } catch (Exception e) {

       System.out.println("Something went wrong.");
       System.out.println(e);
      }


    }
}
