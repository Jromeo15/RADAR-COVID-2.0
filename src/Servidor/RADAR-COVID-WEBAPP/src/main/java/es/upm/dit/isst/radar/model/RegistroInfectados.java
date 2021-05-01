package es.upm.dit.isst.radar.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegistroInfectados {

	private static final long serialVersionUID = 1L;
	
	private Date Fecha;
	@Id
	private String Clave;
	private String DNI;
	

	public RegistroInfectados() {
		super();
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
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

	
	

	
	
}
