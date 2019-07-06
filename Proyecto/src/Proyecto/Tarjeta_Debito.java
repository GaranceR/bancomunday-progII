package Proyecto;

import java.util.ArrayList;

public class Tarjeta_Debito {
	
	// Attributes
    private String numeroCuenta, categoria, bloqueado;
    private int saldo, montoMax, descuento;

    // Constructors
    
    public Tarjeta_Debito() {
    	String numeroCuenta = null;
    	String categoria = null;
    	String bloqueado = null;
    	
    	int saldo = 0;
        int montoMax = 0;
        int descuento = 0;
    }
    
    public Tarjeta_Debito(String numeroCuenta, String categoria, int saldo, String bloqueado) {
		// Attributes with values provided in form
    	this.numeroCuenta = numeroCuenta;
		this.categoria = categoria;
		this.saldo = saldo;
		this.bloqueado = bloqueado;
				
		// Other attributes that we can calculate with the ones provided
		this.setCatDetails(this, this.categoria);
	}
    
    // Method to fill others fields according to Categoria
    public void setCatDetails(Tarjeta_Debito cuentaCD, String categoria) {
	    switch (categoria) {
		    case "A":
	            cuentaCD.setCategoria("Premium");
	            cuentaCD.setMontoMax(200000);
	            cuentaCD.setDescuento(2000);
	            break;
	        case "B":
	            cuentaCD.setCategoria("Cylean");
	            cuentaCD.setMontoMax(600000);
	            cuentaCD.setDescuento(3000);
	            break;
	        case "C":
	            cuentaCD.setCategoria("Copper");
	            cuentaCD.setMontoMax(900000);
	            cuentaCD.setDescuento(4000);
	            break;
	        case "D":
	            cuentaCD.setCategoria("Gold");
	            cuentaCD.setMontoMax(1300000);
	            cuentaCD.setDescuento(5000);
	            break;
	        default:
	            break;
	    }
	}
    
    // Getters & Setters
    
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
    
    @Override
    public String toString() {
    	return "Cuenta de Credito : " + this.numeroCuenta + " Categoria : " + this.categoria + " Bloqueado : " + this.bloqueado 
    			+ " Saldo : " + this.saldo
    			+ " Monto max : " + this.montoMax
    			+ " Descuento : " + this.descuento;
        }
}
