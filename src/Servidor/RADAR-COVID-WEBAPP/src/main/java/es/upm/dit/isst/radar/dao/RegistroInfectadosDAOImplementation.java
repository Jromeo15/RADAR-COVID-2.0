package es.upm.dit.isst.radar.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.radar.model.RegistroInfectados;
import es.upm.dit.isst.radar.dao.SessionFactoryService;

public class RegistroInfectadosDAOImplementation implements RegistroInfectadosDAO {

	private static RegistroInfectadosDAOImplementation instancia = null;

	private RegistroInfectadosDAOImplementation() {
	}

	public static RegistroInfectadosDAOImplementation getInstance() {
		if (null == instancia)
			instancia = new RegistroInfectadosDAOImplementation();
		return instancia;
	}

	@Override
	public RegistroInfectados create(RegistroInfectados registro) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		try {
			session.save(registro);
		} catch(Exception e) {
			registro = null;
		}
		session.getTransaction().commit();
		session.close();
		return registro;
	}

	@Override
	public RegistroInfectados read(String clave) {
		
		RegistroInfectados registro = null;
		
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
	
			try {
				registro = session.get(RegistroInfectados.class, clave);
			} catch(Exception e) {
				registro = null;
			}
			session.getTransaction().commit();
			session.close();
		return registro;
	}

	@Override
	public List<RegistroInfectados> readAll() {
		
		List<RegistroInfectados> registros = new ArrayList<RegistroInfectados>();
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction(); 
		registros.addAll(session.createQuery("from RegistroInfectados").list());
		session.getTransaction().commit();
		session.close();
		return registros;
	}



}
