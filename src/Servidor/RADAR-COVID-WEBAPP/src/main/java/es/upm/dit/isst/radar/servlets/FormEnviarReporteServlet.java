package es.upm.dit.isst.radar.servlets;

import java.io.IOException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		String comentarios= req.getParameter("comentarios");
		
		String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		String clave = "";
        for (int x = 0; x < 15; x++) {
            int indiceAleatorio = (int) (Math.random() * banco.length());
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            clave += caracterAleatorio;
        }

	    
	    RegistroInfectados registro = new RegistroInfectados();
	    
	    registro.setClave(clave);
	    registro.setDNI(DNI);
	    registro.setFecha(hourdateFormat.format(fecha));
	    registro.setConfirmado(false);
	    registro.setComentarios(comentarios);
	    
	    RegistroInfectadosDAOImplementation.getInstance().create(registro);
		
		getServletContext().getRequestDispatcher("/Usuario.jsp").forward(req,resp);
        
    }

}
