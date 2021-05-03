package es.upm.dit.isst.radar.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import es.upm.dit.isst.radar.model.*;


/**
 * Servlet implementation class FormBajaMemoriaServlet
 */
@WebServlet("/FormBajaMemoriaServlet")
public class FormBajaMemoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormBajaMemoriaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)

        throws ServletException, IOException {

      // autorizacion: any

      String DNI = req.getParameter("DNI");

      Client client = ClientBuilder.newClient(new ClientConfig());

      RegistroInfectados reporte = null;

      try {   reporte=client.target(URLHelper.getURL()+"/"+ DNI)

          .request().accept(MediaType.APPLICATION_JSON).get(RegistroInfectados.class);

      }catch(Exception e) {}

      if ((reporte != null)  && (reporte.getDNI() != null)){

        resp.setContentType("application/pdf");

        resp.setHeader("Content-Disposition"

              , String.format("attachment; filename=\"%s\"", "memoria.pdf"));

       // resp.setContentLength(reporte.getDocument().length);

        // resp.getOutputStream().write(reporte.getDocument());

      }

    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
