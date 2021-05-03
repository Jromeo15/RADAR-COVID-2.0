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

/**
 * Servlet implementation class FormLoginServlet
 */
@WebServlet("/FormLoginServlet")
public class FormLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String ADMIN_DNI = "root";
    private final String ADMIN_PASSWORD = "root"; 
       
//No borrar esto mas
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                       throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        boolean ministerio= Boolean.getBoolean("ministerio");
        String DNI = req.getParameter("DNI");
        Client client = ClientBuilder.newClient(new ClientConfig());
        // autenticacion1
        if( ADMIN_DNI.equals(DNI) && ADMIN_PASSWORD.equals(password) ) {        
             req.getSession().setAttribute("admin", true);
             /*List<Usuario> usuarios  = client.target(URLHelper.getURL())
                    .request().accept(MediaType.APPLICATION_JSON)
                    .get(new GenericType<List<Usuario>>() {});
             req.setAttribute("usuarios", usuarios);*/
           getServletContext().getRequestDispatcher("/Admin.jsp").forward(req,resp);
            return;
        }
        
        // autenticacion2
        if (ministerio) {
                req.getSession().setAttribute("ministerio", DNI);
                List<Usuario> usuarios  = client.target(URLHelper.getURL() + "/ministerio/" + DNI)
                         .request().accept(MediaType.APPLICATION_JSON)
                         .get(new GenericType<List<Usuario>>() {});
                req.setAttribute("usuarios", usuarios);
                getServletContext().getRequestDispatcher("/Professor.jsp").forward(req,resp);
                return;
        } 
        
        // autenticacion3
        Usuario usuario = null;
        try { usuario = client.target(URLHelper.getURL() + "/" + email)
                        .request().accept(MediaType.APPLICATION_JSON).get(Usuario.class);
        }catch (Exception e) {
        }
        if ( null != usuario ) {
                req.getSession().setAttribute("usuario", usuario);
                getServletContext().getRequestDispatcher("/Hola.jsp").forward(req,resp);
                return;
        }
        getServletContext().getRequestDispatcher("/index.html").forward(req,resp);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
