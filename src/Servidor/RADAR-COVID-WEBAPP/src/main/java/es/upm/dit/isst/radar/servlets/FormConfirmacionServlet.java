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
@WebServlet("/FormConfirmacionServlet")
public class FormConfirmacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                       throws ServletException, IOException {
        
    	
    	String clave = req.getParameter("registroclave");
    	
    	RegistroInfectados registro = RegistroInfectadosDAOImplementation.getInstance().read(clave);
    	
    	registro.setConfirmado(true);
    	
    	RegistroInfectadosDAOImplementation.getInstance().update(registro);
    	
    	List<RegistroInfectados> registros = RegistroInfectadosDAOImplementation.getInstance().readAll();
    	
    	req.getSession().setAttribute("registros", registros);
    	
    	getServletContext().getRequestDispatcher("/ConfirmarReporte.jsp").forward(req,resp);
        
   
    }
}
