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
@WebServlet("/FormNotificacionesServlet")
public class FormNotificacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                       throws ServletException, IOException {
        
		byte[] array = new byte[16];
	    new Random().nextBytes(array);
	    String clave = new String(array, Charset.forName("UTF-8"));
	    
	    List<RegistroInfectados> registro = RegistroInfectadosDAOImplementation.getInstance().readAll();
	    
    	
    	req.getSession().setAttribute("registro", registro);
	    		
	    if(registro.size() >0 ) {
	    	
	    	getServletContext().getRequestDispatcher("/NotificacionesContacto.jsp").forward(req,resp);
	    }
	    else {

	    	getServletContext().getRequestDispatcher("/NotificacionesNoContacto.jsp").forward(req,resp);
	    }
        
    }

}
