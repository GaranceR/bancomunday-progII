package Proyecto;

import java.util.ArrayList;

public class Tarjeta_Credito {
	
	// Attributes 
	
    private String numeroCuenta,categoria,bloqueado,diaPago,diaCorte;
    private int montoDisponible;
    private int cuotasSinInteres;
    private double interesMensual;
    private int cupoMaximo;
    private int deuda;
    private int descuento;

    // Constructors
    
    public Tarjeta_Credito() {
    	String numeroCuenta = null;
    	String categoria = null;
    	String bloqueado = null;
    	String diaPago = null;
    	int montoDisponible = 0;
        int cuotasSinInteres = 0;
        double interesMensual = 0;
        int cupoMaximo = 0;
        int deuda = 0;
        int descuento = 0;
    }
    
    public Tarjeta_Credito(String numeroCuenta, String categoria, int montoDisponible, String bloqueado, String diaPago, int deuda) {
		// Attributes with values provided in form
    	this.numeroCuenta = numeroCuenta;
		this.categoria = categoria;
		this.montoDisponible = montoDisponible;
		this.bloqueado = bloqueado;
		this.diaPago = diaPago;
		this.deuda = deuda;
		
		// Other attributes that we can calculate with the ones provided
		this.diaCorte = String.valueOf((Integer.valueOf(diaPago) - 8));
		this.setCatDetails(this, this.categoria);
	}
    
    // Method to fill others fields according to Categoria
    public void setCatDetails(Tarjeta_Credito cuentaTC, String categoria) {
	    switch (categoria) {
		    case "A":
	            cuentaTC.setCategoria("Premium");
	            cuentaTC.setCupoMaximo(300000);
	            cuentaTC.setCuotasSinInteres(0);
	            cuentaTC.setInteresMensual(5.9);
	            cuentaTC.setDescuento(2000);
	            break;
	        case "B":
	            cuentaTC.setCategoria("Cylean");
	            cuentaTC.setCupoMaximo(700000);
	            cuentaTC.setCuotasSinInteres(3);
	            cuentaTC.setInteresMensual(4.2);
	            cuentaTC.setDescuento(3000);
	            break;
	        case "C":
	            cuentaTC.setCategoria("Copper");
	            cuentaTC.setCupoMaximo(1000000);
	            cuentaTC.setCuotasSinInteres(5);
	            cuentaTC.setInteresMensual(3.1);
	            cuentaTC.setDescuento(4000);
	            break;
	        case "D":
	            cuentaTC.setCategoria("Gold");
	            cuentaTC.setCupoMaximo(1200000);
	            cuentaTC.setCuotasSinInteres(7);
	            cuentaTC.setInteresMensual(1.9);
	            cuentaTC.setDescuento(5000);
	            break;
	        default:
	            break;
	    }
    }
    
    // Getters & Setters
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
    
    @Override
    public String toString() {
    	return "Cuenta de Credito : " + this.numeroCuenta + " Categoria : " + this.categoria + " Bloqueado : " + this.bloqueado 
    			+ " Dia de pago : " + diaPago + " Dia de Corte : " + diaCorte
    			+ " Monto disponible : " + this.montoDisponible
    			+ " Cuotas sin interes : " + this.cuotasSinInteres
    			+ " Interes mensual : " + this.interesMensual
    			+ " Cupo maximo : " + this.cupoMaximo
    			+ "  Deuda : "+ this.deuda
    			+ " Descuento : " + this.descuento;
    }
    
    
    
}
