package es.upm.dit.isst.radar.servlets;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import es.upm.dit.isst.radar.model.*;
import es.upm.dit.isst.radar.dao.*;


/**
 * Servlet implementation class FormLoginServlet
 */
@WebServlet("/FormEnviarReporteServlet")
public class FormEnviarReporteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                       throws ServletException, IOException {
        
		Usuario usuario = (Usuario)req.getSession().getAttribute("usuario");
        
		String DNI = usuario.getDNI();
		Date fecha = new Date();
		byte[] array = new byte[16];
	    new Random().nextBytes(array);
	    String clave = new String(array, Charset.forName("UTF-8"));
	    
	    RegistroInfectados registro = new RegistroInfectados();
	    
	    registro.setClave(clave);
	    registro.setDNI(DNI);
	    registro.setFecha(fecha);
	    
	    RegistroInfectadosDAOImplementation.getInstance().create(registro);
		
		getServletContext().getRequestDispatcher("/Usuario.jsp").forward(req,resp);
        
    }

}
