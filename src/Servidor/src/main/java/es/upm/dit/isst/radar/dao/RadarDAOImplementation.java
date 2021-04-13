package es.upm.dit.isst.radar.dao;

import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.radar.model.RegistroInfectados;
import es.upm.dit.isst.radar.model.Usuario;

public class RadarDAOImplementation implements RadarDAO{

	  private static  RadarDAOImplementation instancia = null;

	  private RadarDAOImplementation() {
	  }

		  public static RadarDAOImplementation getInstance() {
	
		    if( null == instancia )
	
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
	/*
			public TFG read(String email) {}
	
			public TFG update(TFG tfg{}
	
			public TFG delete(TFG tfg) {}
	
			public List<TFG> readAll(){}
	
			public List<TFG> readAll(String professor){}
*/

		@Override
		public RegistroInfectados create(RegistroInfectados registroInfectados) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Usuario read(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Usuario update(Usuario usuario) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Usuario delete(Usuario usuario) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Usuario> readAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Usuario> readAll(int DNI) {
			// TODO Auto-generated method stub
			return null;
		}
	  
}
