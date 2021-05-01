package es.upm.dit.isst.usuario.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import es.upm.dit.isst.radar.model.*;


@WebServlet("/FormAdminServlet")
public class FormAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	                       throws ServletException, IOException {
	  // autorizacion: check root
	  String email = request.getParameter("email");
	  Client client = ClientBuilder.newClient(new ClientConfig());
	  Usuario usuario = null;
	  try {
	         usuario = client.target(URLHelper.getURL() + "/" + email)
	              .request().accept(MediaType.APPLICATION_JSON).get(Usuario.class);
	  } catch(Exception e) {}
	  if (usuario != null) {
	        usuario.setEmail(request.getParameter("email"));
	        usuario.setDNI(request.getParameter("DNI"));
	        usuario.setPassword(request.getParameter("Password"));
	       client.target(URLHelper.getURL() + "/" +email)
	          .request()
	          .post(Entity.entity(usuario, MediaType.APPLICATION_JSON), Response.class);
	        List<Usuario> usuarios = client.target(URLHelper.getURL())
	          .request().accept(MediaType.APPLICATION_JSON)
	          .get(new GenericType<List<Usuario>>() {});
	        request.setAttribute("usuarios", usuarios);
	  }
	  getServletContext().getRequestDispatcher("/Admin.jsp").forward(request,response);
	}
}
