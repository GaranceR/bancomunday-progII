package bancomunday;

public class Cliente {
    
    /*************************************************
    * Class to implement the concept of Clients 
    * and related methods such as getters and /setters for : 
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
	
	// Esos son los atributos del Usuario -> Clase a parte o no ? 
        // Hippo : Creo que no, eso esta bien
	
	private String nombreUsuario;
	private String contrasena;
	private boolean morosidad;
	
	public Cliente (String RUT, String nombre, String ocupacion, String correo, String telefono, String nombreUsuario, String contrasena, boolean morosidad){
		this.RUT = RUT;
		this.nombre = nombre;
		this.ocupacion = ocupacion;
		this.correo = correo;
		this.telefono = telefono;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.morosidad = morosidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRUT() {
		return RUT;
	}
	public void setRUT(String rUT) {
		RUT = rUT;
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
	public boolean isMorosidad() {
		return morosidad;
	}
	public void setMorosidad(boolean morosidad) {
		this.morosidad = morosidad;
	}
	@Override
	public String toString() {
		return "Cliente RUT : " + this.RUT + " Nombre : " + this.nombre + " Ocupacion : " + this.ocupacion
				+ " Correo : " + this.correo + " Telefono : " + this.telefono + " Nombre Usuario : " + this.nombreUsuario
				+ " Contrasena : " + this.contrasena + " Morosidad : " + this.morosidad;
	}
	
}
