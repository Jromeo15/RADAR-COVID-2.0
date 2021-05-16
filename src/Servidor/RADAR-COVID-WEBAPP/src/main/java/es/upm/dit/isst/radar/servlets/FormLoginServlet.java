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
@WebServlet("/FormLoginServlet")
public class FormLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                       throws ServletException, IOException {
        
    	String password = req.getParameter("password");
        String DNI = req.getParameter("DNI");
        
        UsuarioDAO usuarioDAO = UsuarioDAOImplementation.getInstance();
		Usuario usuario = usuarioDAO.loginUsuario(DNI,password);
		req.getSession().setAttribute("usuario", usuario);
            
        if (usuario!=null){
        	
        	 if (usuario.getMinisterio()) {
                 
                 getServletContext().getRequestDispatcher("/Ministerio.jsp").forward(req,resp);
                 return;
        	 } 
        	 
        	 else {
        		 
        		 getServletContext().getRequestDispatcher("/Usuario.jsp").forward(req,resp);
                 return;
        	 }
        } 
        
        else {
        	
        	resp.sendRedirect(req.getContextPath() + "/indexFallo.html");
        }
        
    }

}
