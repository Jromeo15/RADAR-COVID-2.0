import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import es.upm.dit.isst.radar.dao.RegistroInfectadosDAOImplementation;
import es.upm.dit.isst.radar.model.RegistroInfectados;

class PruebaRegistroInf {
	
	@Test
	void testCreate() {
		RegistroInfectados r = new RegistroInfectados();
		Date fecha = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		r.setFecha(hourdateFormat.format(fecha));
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
		Date fecha2 = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		r3.setFecha(hourdateFormat.format(fecha2));
		r3.setClave("clave1");
		r3.setConfirmado(true);
		r3.setDNI("11123344A");
		RegistroInfectadosDAOImplementation.getInstance().create(r3);
		
		RegistroInfectados r4 = new RegistroInfectados();
		Date fecha3 = new Date();
		DateFormat hourdateFormat1 = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		r4.setFecha(hourdateFormat1.format(fecha3));
		r3.setClave("clave2");
		r4.setConfirmado(false);
		r4.setDNI("11123344B");
		RegistroInfectadosDAOImplementation.getInstance().create(r4);
		
		List<RegistroInfectados> lista = RegistroInfectadosDAOImplementation.getInstance().readAll();
		assertEquals(lista.get(lista.size()-2).getClave(),r3.getClave());
		assertEquals(lista.get(lista.size()-1).getClave(),r4.getClave());
		
		RegistroInfectadosDAOImplementation.getInstance().delete(r3);
		RegistroInfectadosDAOImplementation.getInstance().delete(r4);
	}
	
	@Test
	void testDelete() {
		RegistroInfectados r5 = new RegistroInfectados();
		Date fecha4 = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		r5.setFecha(hourdateFormat.format(fecha4));
		r5.setClave("clave3");
		r5.setConfirmado(true);
		r5.setDNI("11123344A");
		RegistroInfectadosDAOImplementation.getInstance().create(r5);
		
		RegistroInfectadosDAOImplementation.getInstance().delete(r5);
		
		assertNull(RegistroInfectadosDAOImplementation.getInstance().read("clave1"));
	}
}
