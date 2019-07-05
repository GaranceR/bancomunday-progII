package Proyecto;

import java.util.ArrayList;

public class Tarjeta_Debito {
    private int saldo,montoMax,descuento;
    private String numeroCuenta,bloqueado,categoria;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getMontoMax() {
        return montoMax;
    }

    public void setMontoMax(int montoMax) {
        this.montoMax = montoMax;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(String bloqueado) {
        this.bloqueado = bloqueado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    
    public ArrayList<String> Asignar(){
            ArrayList<String> asig = new ArrayList<>();
            asig.add(numeroCuenta);
            asig.add(categoria);
            asig.add(String.valueOf(saldo));
            asig.add(String.valueOf(montoMax));
            asig.add(String.valueOf(descuento));
            asig.add(bloqueado);
            return asig;
    }
}
