import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import es.upm.dit.isst.radar.dao.RegistroInfectadosDAOImplementation;
import es.upm.dit.isst.radar.dao.UsuarioDAOImplementation;
import es.upm.dit.isst.radar.model.RegistroInfectados;

class PruebaRegistroInf {
	
	@Test
	void testCreate() {
		RegistroInfectados r = new RegistroInfectados();
		Date fecha = new Date();
		r.setFecha(fecha);
		r.setClave("clave");
		r.setConfirmado(true);
		r.setDNI("11123344A");
		RegistroInfectadosDAOImplementation.getInstance().create(r);
		RegistroInfectados r2 = RegistroInfectadosDAOImplementation.getInstance().read("clave");
		assertEquals(r2.getClave(),r.getClave());
		assertEquals(r2.isConfirmado(),r.isConfirmado());
		assertEquals(r2.getDNI(),r.getDNI());
		RegistroInfectadosDAOImplementation.getInstance().delete(r);
		RegistroInfectadosDAOImplementation.getInstance().delete(r2);
		}
	
	@Test
	void testReadAll() {
		RegistroInfectados r3 = new RegistroInfectados();
		Date fecha = new Date();
		r3.setFecha(fecha);
		r3.setClave("clave1");
		r3.setConfirmado(true);
		r3.setDNI("11123344A");
		RegistroInfectadosDAOImplementation.getInstance().create(r3);
		
		RegistroInfectados r4 = new RegistroInfectados();
		r4.setFecha(fecha);
		r4.setClave("clave2");
		r4.setConfirmado(false);
		r4.setDNI("11123344B");
		RegistroInfectadosDAOImplementation.getInstance().create(r4);
		
		List<RegistroInfectados> lista = RegistroInfectadosDAOImplementation.getInstance().readAll();
		assertEquals(lista.get(0).getClave(),r3.getClave());
		assertEquals(lista.get(1).getClave(),r4.getClave());
		
		RegistroInfectadosDAOImplementation.getInstance().delete(r3);
		RegistroInfectadosDAOImplementation.getInstance().delete(r4);
	}
	
	@Test
	void testDelete() {
		RegistroInfectados r5 = new RegistroInfectados();
		Date fecha = new Date();
		r5.setFecha(fecha);
		r5.setClave("clave1");
		r5.setConfirmado(true);
		r5.setDNI("11123344A");
		RegistroInfectadosDAOImplementation.getInstance().create(r5);
		
		RegistroInfectadosDAOImplementation.getInstance().delete(r5);
		
		assertNull(RegistroInfectadosDAOImplementation.getInstance().read("clave1"));
	}
}
