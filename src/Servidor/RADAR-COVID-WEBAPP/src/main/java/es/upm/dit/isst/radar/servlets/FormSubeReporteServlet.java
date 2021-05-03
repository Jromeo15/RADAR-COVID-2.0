package es.upm.dit.isst.radar.servlets;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import es.upm.dit.isst.radar.model.*;

@WebServlet("/FormSubeMemoriaServlet")

@MultipartConfig
public class FormSubeReporteServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;


  @Override

  protected void doPost(HttpServletRequest req, HttpServletResponse resp)

               throws ServletException, IOException {

    // autorizacion, comprobar

    String DNI = req.getParameter("dni");

    Client client = ClientBuilder.newClient(new ClientConfig());

    RegistroInfectados reporte = null;

    try {

         reporte = client.target(URLHelper.getURL() + "/" + DNI)

           .request().accept(MediaType.APPLICATION_JSON).get(RegistroInfectados.class);

    } catch(Exception e) {}

    // autorizacion

    if (reporte != null) {

         Part filePart = req.getPart("file");

         InputStream fileContent = filePart.getInputStream();

         ByteArrayOutputStream output = new ByteArrayOutputStream();

         byte[] buffer = new byte[1024];

         for (int length = 0; (length = fileContent.read(buffer)) > 0;)

                 output.write(buffer, 0, length);

        // reporte.setDocument(output.toByteArray());

        client.target(URLHelper.getURL() + "/" + reporte.getDNI()).request()

                 .post(Entity.entity(reporte, MediaType.APPLICATION_JSON), Response.class);

         req.setAttribute("reporte", reporte);

     }

    getServletContext().getRequestDispatcher("/reporte.jsp").forward(req,resp);

  }

}