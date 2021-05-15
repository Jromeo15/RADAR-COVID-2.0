package es.upm.dit.isst.radar.dao;

import java.util.List;

import es.upm.dit.isst.radar.model.Usuario;
import es.upm.dit.isst.radar.model.RegistroInfectados;

public interface RegistroInfectadosDAO {
	
	public RegistroInfectados create(RegistroInfectados registro);
	public RegistroInfectados read(String clave);
	public List<RegistroInfectados> readAll();
	public RegistroInfectados update(RegistroInfectados registro);

}
