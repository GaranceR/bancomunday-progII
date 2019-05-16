package bancomunday;

import java.util.Date;

public class Banco {

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
