import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import es.upm.dit.isst.radar.dao.UsuarioDAOImplementation;
import es.upm.dit.isst.radar.model.Usuario;

class PruebaUsuario {
	@Test
	void testCreate() {
		 Usuario u = new Usuario();
		 u.setEmail("a@a.a");
		 u.setPassword("contrasena");
		 u.setMinisterio(false);
		 u.setDNI("11123344A");
		 UsuarioDAOImplementation.getInstance().create(u);
		 Usuario u2 = UsuarioDAOImplementation.getInstance().read("11123344A");
		 assertEquals(u2.getDNI(),u.getDNI());
		 assertEquals(u2.getEmail(),u.getEmail());
		 assertEquals(u2.getPassword(),u.getPassword());
		 assertEquals(u2.getMinisterio(),u.getMinisterio());
		 UsuarioDAOImplementation.getInstance().delete(u);
		 UsuarioDAOImplementation.getInstance().delete(u2);
		}
	
	@Test
	void testLoginUsuario() {
		Usuario u3 = new Usuario();
		u3.setEmail("b@b.b");
		u3.setPassword("contrasena1");
		u3.setMinisterio(false);
		u3.setDNI("11123344B");
		UsuarioDAOImplementation.getInstance().create(u3);
		Usuario u4 = UsuarioDAOImplementation.getInstance().loginUsuario("11123344B", "contrasena1");
		assertEquals(u4.getDNI(),u3.getDNI());
		assertEquals(u4.getEmail(),u3.getEmail());
		assertEquals(u4.getPassword(),u3.getPassword());
		assertEquals(u4.getMinisterio(),u3.getMinisterio());
		UsuarioDAOImplementation.getInstance().delete(u3);
		UsuarioDAOImplementation.getInstance().delete(u4);
	}
		
	@Test
	void testReadAll() {
		Usuario u5 = new Usuario();
		u5.setEmail("c@c.c");
		u5.setPassword("contrasena2");
		u5.setMinisterio(false);
		u5.setDNI("11123344C");
		UsuarioDAOImplementation.getInstance().create(u5);
		
		Usuario u6 = new Usuario();
		u6.setEmail("d@d.d");
		u6.setPassword("contrasena3");
		u6.setMinisterio(false);
		u6.setDNI("11123344D");
		UsuarioDAOImplementation.getInstance().create(u6);
		
		List<Usuario> lista = UsuarioDAOImplementation.getInstance().readAll();
		assertEquals(lista.get(lista.size()-2).getDNI(),u5.getDNI());
		assertEquals(lista.get(lista.size()-1).getDNI(),u6.getDNI());
		
		UsuarioDAOImplementation.getInstance().delete(u5);
		UsuarioDAOImplementation.getInstance().delete(u6);
	}
	
	@Test
	void testDelete() {
		Usuario u7 = new Usuario();
		u7.setEmail("e@e.e");
		u7.setPassword("contrasena4");
		u7.setMinisterio(false);
		u7.setDNI("11123344E");
		UsuarioDAOImplementation.getInstance().create(u7);
		
		UsuarioDAOImplementation.getInstance().delete(u7);
		
		assertNull(UsuarioDAOImplementation.getInstance().read("11123344E"));
	}
}
