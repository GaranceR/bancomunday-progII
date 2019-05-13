package src.main.java.bancomunday;


public class Tarjeta_debito extends Herencia_tarjetas{

    private int a;

    public Tarjeta_debito(){
    }

    @Override
    protected int abonar(String[] datos) {
      return 1;
    }

    @Override
    protected int cargar(String[] datos) {
      return 1;
    }

    @Override
    protected int comprarPagar(String[] datos) {
      return 1;
    }

    @Override
    protected int comprarInversion(String[] datos) {
      return 1;
    }

    @Override
    protected String recibirTransferencia(String[] datosE, String[] datosS) {
      return "1";
    }

    @Override
    protected String realizarTransferencia(String[] datosE, String[] datosS) {
      return "1";
    }
}
