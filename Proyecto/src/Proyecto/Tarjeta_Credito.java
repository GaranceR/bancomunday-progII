package Proyecto;

import java.util.ArrayList;

public class Tarjeta_Credito{
    private String categoria,numeroCuenta,bloqueado,diaPago,diaCorte;
    private int montoDisponible;
    private int cuotasSinInteres;
    private double interesMensual;
    private int cupoMaximo;
    private int deuda;
    private int descuento;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public String getDiaPago() {
        return diaPago;
    }

    public void setDiaPago(String diaPago) {
        this.diaPago = diaPago;
    }

    public String getDiaCorte() {
        return diaCorte;
    }

    public void setDiaCorte(String diaCorte) {
        this.diaCorte = diaCorte;
    }

    public int getMontoDisponible() {
        return montoDisponible;
    }

    public void setMontoDisponible(int montoDisponible) {
        this.montoDisponible = montoDisponible;
    }

    public int getCuotasSinInteres() {
        return cuotasSinInteres;
    }

    public void setCuotasSinInteres(int cuotasSinInteres) {
        this.cuotasSinInteres = cuotasSinInteres;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
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
            asig.add(String.valueOf(montoDisponible));
            asig.add(String.valueOf(cupoMaximo));
            asig.add(String.valueOf(interesMensual));
            asig.add(String.valueOf(cuotasSinInteres));
            asig.add(String.valueOf(descuento));
            asig.add(diaPago);
            asig.add(diaCorte);
            asig.add(String.valueOf(deuda));       
            asig.add(bloqueado);
            return asig;
    }
    
    
    
}
