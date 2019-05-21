package bancomunday;

import java.util.Date;

public class Banco {
    
    /*************************************************
    * Clase para implementar el concepto de Banco 
    * y metodos relacionados como: 
    * - get/set Patrimonio
    * - get/set FechaInicio
    * - get/set ComisionBancaria
    * 
    * Note : 3 custom parameters to create an object :
    * - patrimonio
    * - fechaInicio 
    * - comisionBancaria
    * 
    * and an overriden toString() method ! 
    **************************************************/

	private Integer patrimonio;
	private String fechaInicio;
	private Integer comisionBancaria;
	
	public Integer getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(Integer patrimonio) {
		this.patrimonio = patrimonio;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Integer getComisionBancaria() {
		return comisionBancaria;
	}
	public void setComisionBancaria(Integer comisionBancaria) {
		this.comisionBancaria = comisionBancaria;
	}
	
	@Override
	public String toString() {
		return "Patrimonio : " + this.patrimonio + " Fecha : " + this.fechaInicio + " Comision Bancaria : " + this.comisionBancaria;
	}
	
}
