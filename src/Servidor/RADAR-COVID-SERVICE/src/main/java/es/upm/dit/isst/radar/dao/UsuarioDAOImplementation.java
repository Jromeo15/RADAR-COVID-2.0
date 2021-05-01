package es.upm.dit.isst.radar.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.radar.model.RegistroInfectados;
import es.upm.dit.isst.radar.model.Usuario;
import es.upm.dit.isst.radar.dao.SessionFactoryService;

public class UsuarioDAOImplementation implements UsuarioDAO {

	private static UsuarioDAOImplementation instancia = null;

	private UsuarioDAOImplementation() {
	}

	public static UsuarioDAOImplementation getInstance() {
		if (null == instancia)
			instancia = new UsuarioDAOImplementation();
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
	public Usuario read(int DNI) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		Usuario usuario = session.get(Usuario.class, DNI);
		session.getTransaction().commit();
		session.close();
		return usuario;
	}

	@Override
	public Usuario read_1(String password) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		Usuario usuario = session.get(Usuario.class, password);
		session.getTransaction().commit();
		session.close();
		return usuario;
	}

}
