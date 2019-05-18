package bancomunday;

import java.util.Date;

public class Banco {
    
    /*************************************************
    * Class to implement the concept of Banks 
    * and related methods such as : 
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

	Integer patrimonio;
	Date fechaInicio;
	Integer comisionBancaria;
	
	public Banco(Integer patrimonio, Date fechaInicio, Integer comisionBancaria) {
		this.patrimonio = patrimonio;
		this.fechaInicio = fechaInicio;
		this.comisionBancaria = comisionBancaria;
	}
	
	public Integer getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(Integer patrimonio) {
		this.patrimonio = patrimonio;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
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
