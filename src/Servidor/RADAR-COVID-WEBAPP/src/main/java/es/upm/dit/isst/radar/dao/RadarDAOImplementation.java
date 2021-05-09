package es.upm.dit.isst.radar.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.radar.model.RegistroInfectados;
import es.upm.dit.isst.radar.model.Usuario;
import es.upm.dit.isst.radar.dao.SessionFactoryService;

public class RadarDAOImplementation implements RadarDAO {

	private static RadarDAOImplementation instancia = null;

	private RadarDAOImplementation() {
	}

	public static RadarDAOImplementation getInstance() {
		if (null == instancia)
			instancia = new RadarDAOImplementation();
		return instancia;

	}

	@Override
	public Usuario create(Usuario usuario) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		usuario = null;
		// operaciones
		session.getTransaction().commit();
		session.close();
		return usuario;
	}

	@Override
	public RegistroInfectados create(RegistroInfectados registroInfectados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario read(String email) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		Usuario usuario = session.get(Usuario.class, email);
		session.getTransaction().commit();
		session.close();
		return usuario;
	}

	@Override
	public Usuario update(Usuario usuario) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.saveOrUpdate(usuario);
		session.getTransaction().commit();
		session.close();
		return usuario;
	}

	@Override
	public Usuario delete(Usuario usuario) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.delete(usuario);
		session.getTransaction().commit();
		session.close();
		return usuario;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> readAll() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		usuarios.addAll(session.createQuery("from Usuario").list());
		session.getTransaction().commit();
		session.close();
		return usuarios;
	}

	@Override
	public List<Usuario> readAll(int DNI) {
		List<Usuario> res = new ArrayList<Usuario>();
		/*
		 * for (Usuario usuario : this.readAll()) if
		 * (usuario.getAdvisor().equals(professor)) res.add(usuario);
		 */
		return res;
	}

}
