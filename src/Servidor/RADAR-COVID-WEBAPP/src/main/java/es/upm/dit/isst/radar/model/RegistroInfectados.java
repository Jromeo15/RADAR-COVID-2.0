package es.upm.dit.isst.radar.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegistroInfectados {

	private static final long serialVersionUID = 1L;
	
	private String Fecha;
	@Id
	private String Clave;
	private String DNI;
	private boolean confirmado;
	private String comentarios;
	

	public boolean isConfirmado() {
		return confirmado;
	}
	
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}

	public RegistroInfectados() {
		super();
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	@Override
	public String toString() {
		return "RegistroInfectados [Fecha=" + Fecha + ", Clave=" + Clave + ", DNI=" + DNI + ", confirmado=" + confirmado
				+ "]";
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String Comentarios) {
		comentarios = Comentarios;
	}
	

	
	
}
