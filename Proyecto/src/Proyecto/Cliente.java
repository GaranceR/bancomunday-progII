package Proyecto;

import java.util.ArrayList;

public class Cliente {
    
    /*************************************************
    * Clase para implementar el concepto de Clientes
    * y metodos relacionados como los getters & setters para: 
    * - RUT, nombre, ocupacion, correo, 
    * - telefono, nombreUsuario, contrasena, morosidad
    * 
    * Note : 8 custom parameters to create an object
    * and an overridden toString() method ! 
    **************************************************/
	
	private String RUT;
	private String nombre;
	private String ocupacion;
	private String correo;
	private String telefono;
	private String nombreUsuario;
	private String contrasena;
	private String morosidad;
	
	// Constructors
	public Cliente() {
		this.RUT = null;
		this.RUT = null;
		this.nombre = null;
		this.ocupacion = null;
		this.correo = null;
		this.telefono = null;
		this.nombreUsuario = null;
		this.contrasena = null;
		this.morosidad = null;
	}
	
	public Cliente(String RUT, String nombre, String ocupacion, String correo, String telefono, String nombreUsuario, String contrasena, String morosidad) {
		this.RUT = RUT;
		this.nombre = nombre;
		this.ocupacion = ocupacion;
		this.correo = correo;
		this.telefono = telefono;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.morosidad = morosidad;
	}
	
	// Getters & Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRUT() {
		return RUT;
	}
	public void setRUT(String RUT) {
		this.RUT = RUT;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
    public String getMorosidad() {
        return morosidad;
    }
    public void setMorosidad(String morosidad) {
        this.morosidad = morosidad;
    }

    public ArrayList<String> Asignar(){
        ArrayList<String> asig = new ArrayList<>();
        asig.add(RUT);
        asig.add(nombre);
        asig.add(ocupacion);
        asig.add(correo);
        asig.add(telefono);
        asig.add(nombreUsuario);
        asig.add(contrasena);
        asig.add(morosidad);
        return asig;
    }
    
	@Override
	public String toString() {
		return "Cliente RUT : " + this.RUT + " Nombre : " + this.nombre + " Ocupacion : " + this.ocupacion
				+ " Correo : " + this.correo + " Telefono : " + this.telefono + " Nombre Usuario : " + this.nombreUsuario
				+ " Contrasena : " + this.contrasena + " Morosidad : " + this.morosidad;
	}
	
}
