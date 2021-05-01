package es.upm.dit.isst.radar.dao;

import java.util.List;

import es.upm.dit.isst.radar.model.Usuario;
import es.upm.dit.isst.radar.model.RegistroInfectados;

public interface RadarDAO {
	
	public Usuario create(Usuario usuario);
	public RegistroInfectados create(RegistroInfectados registroInfectados);
	public Usuario read(String email);
	public Usuario update(Usuario usuario);
	public Usuario delete(Usuario usuario);
	public List<Usuario> readAll();
	public List<Usuario> readAll(int DNI);
}
