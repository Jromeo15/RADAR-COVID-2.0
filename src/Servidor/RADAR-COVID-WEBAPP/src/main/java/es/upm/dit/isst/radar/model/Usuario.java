package es.upm.dit.isst.radar.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	private static final long serialVersionUID = 1L;
	
	private String email;
	private String password;
	private boolean ministerio;
	@Id
	private String DNI;	

	public Usuario() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public boolean getMinisterio() {
		return ministerio;
	}

	public void setMinisterio(boolean ministerio) {
		this.ministerio = ministerio;
	}

	
	
	
}
