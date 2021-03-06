package es.upm.dit.isst.radar.dao;

import java.util.List;

import es.upm.dit.isst.radar.model.Usuario;
import es.upm.dit.isst.radar.model.RegistroInfectados;

public interface RegistroInfectadosDAO {
	
	public Usuario create(Usuario usuario);
	public Usuario read(String email);
	public Usuario read(int DNI);
	public Usuario read_1(String password);
	public Usuario read_2(String key);
	public Usuario update(Usuario usuario);
	public Usuario delete(Usuario usuario);
	public List<Usuario> readAll();

}
