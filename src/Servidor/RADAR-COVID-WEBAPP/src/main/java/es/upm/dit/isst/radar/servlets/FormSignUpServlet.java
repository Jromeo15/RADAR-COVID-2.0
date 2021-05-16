package es.upm.dit.isst.radar.servlets;

import java.io.IOException;
import java.util.List;

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
@WebServlet("/FormSignUpServlet")
public class FormSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static boolean isNumeric(String str) { 
	    try {  
	      Double.parseDouble(str);  
	      return true;
	    } catch(NumberFormatException e){  
	      return false;  
	    }  
	  }
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String DNI = req.getParameter("DNI");
		if (DNI.length()!=9 || !isNumeric(DNI.substring(0, 7)) || isNumeric(DNI.substring(7))) {
            getServletContext().getRequestDispatcher("/Registro.jsp").forward(req,resp);
            return;
        }
		String password = req.getParameter("password");
		if (password.length()<8 || password.length()>16) {
            getServletContext().getRequestDispatcher("/Registro.jsp").forward(req,resp);
            return;
        }
		boolean ministerio = Boolean.parseBoolean( req.getParameter("ministerio") );
		
		Usuario usuario = new Usuario();
		
		usuario.setEmail(email);
		usuario.setDNI(DNI);
		usuario.setPassword(password);
		
		if(ministerio == true) {
			
			usuario.setMinisterio(true);
		}
		else {
			usuario.setMinisterio(false);
		}
		
		
		req.getSession().setAttribute("usuario", usuario);
		UsuarioDAOImplementation.getInstance().create(usuario);
		//getServletContext().getRequestDispatcher("/Usuario.jsp").forward(req,resp);
		if (usuario.getMinisterio()) {
            
            getServletContext().getRequestDispatcher("/Ministerio.jsp").forward(req,resp);
            return;
   	 } 
   	 
   	 else {
   		 
   		 getServletContext().getRequestDispatcher("/Usuario.jsp").forward(req,resp);
            return;
   	 }
			
	}

}
