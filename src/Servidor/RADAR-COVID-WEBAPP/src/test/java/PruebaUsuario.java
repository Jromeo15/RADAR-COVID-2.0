import static org.junit.jupiter.api.Assertions.*;

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
	
}
