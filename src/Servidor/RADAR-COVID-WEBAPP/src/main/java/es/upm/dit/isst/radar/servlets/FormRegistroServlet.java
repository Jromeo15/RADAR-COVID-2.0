package es.upm.dit.isst.radar.servlets;

import javax.servlet.*; 
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class FormRegistroServlet extends HttpServlet { 

   protected IConexionPool pool;
   protected Connection conn;
   public interface IConexionPool 
   { 
       public Connection extraerConexion() throws SQLException;
       public void liberarConexion(Connection conn) throws SQLException;
   }
   public void service(HttpServletRequest request, HttpServletResponse response) 
throws java.io.IOException, ServletException
    {

     // Sacar los  Datos de la Forma   
    String DNI = request.getParameter("DNI");
    String password = request.getParameter("password");
    String email = request.getParameter("email");    
    try { 
        
        // Verificar si existe usario por Correo Electr�nico 
        
        String sql_busca = "select * CURSOJSP_ENCUESTA where email = ?";

        PreparedStatement statement = conn.prepareStatement(sql_busca);
        statement.setString(1,email);
        
        ResultSet result = statement.executeQuery();
        boolean rs = result.next();
        
        if (rs) 
 	   { 
 	       // Si existe el usario, rechazar
 	       // Actualizar requisicion y llamar funcion de Rechazo 

        request.setAttribute("razonrechazo", "El correo electr�nico proporcionado ya existe en la Base de Datos");
 	       
 	       rechazarInsertar(request,response);
 	       
        } else { 
 	       // No existe el usuario, actualizar requisicion
 	       // Y llamar funcion para Insertar
 	       
 	       request.setAttribute("DNI",DNI);
 	       request.setAttribute("password",password);
 	       request.setAttribute("email",email);
 	       aceptarInsertar(request,response);

 	   }
     
 	statement.close();
 	result.close();
    }
     catch (SQLException exc) 
     { 
 	// Registrar posibles error en SQL hacia registros ("Logs") 
         // Actualizar requisicion y llamar funcion de Rechazo 

 		getServletContext().log(" Ocurrio un error en la base de Datos mientras se intentaba insertar datos", exc);

                 request.setAttribute("razonrechazo", "Ocurrio un error en la Base de Datos");
    
                 rechazarInsertar(request,response);

     }

     }
   public void rechazarInsertar(HttpServletRequest request, HttpServletResponse response) 
		   throws java.io.IOException, ServletException    {

		   	RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/servidordatos/error.jsp");
		       
		   	    dispatch.forward(request, response);

		       }
   public void aceptarInsertar(HttpServletRequest request, HttpServletResponse response)
	       throws java.io.IOException, ServletException 
	    {

	    try { 
		
	       // Preparar linea para insertar informacion 
	      String sql_inserta = "insert into CURSOJSP_ENCUESTA(DNI,password,email,servicios,area,email) values ( ? , ? , ? , ? , ? , ?)";

	       PreparedStatement statement = conn.prepareStatement(sql_inserta);
	       statement.setString(1,(String) request.getAttribute("DNI"));
	       statement.setString(2,(String) request.getAttribute("password"));
	       statement.setString(3,(String) request.getAttribute("email"));

	       // Ejecutar Inserci�n de Datos 

	       statement.executeUpdate();
	       statement.close();

	       // Enviar a P�gina de Exito 
		    
	       RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/servidordatos/exito.jsp");

	    } catch (SQLException exc)    { 

		// Registrar posibles error en SQL hacia registros ("Logs") 
	        // Actualizar requisici�n y llamar funci�n de Rechazo 
		
	     getServletContext().log(" Ocurri� un error en la base de Datos mientras se intentaba insertar datos", exc);

	     request.setAttribute("razonrechazo", "ocurri� un error en la Base de Datos");
	 
	     rechazarInsertar(request,response);


	    }

	  }
   public void init() { 

		// Traer el Contexto de la Aplicaci�n y colocar Pool reci�n generado
		
		ServletContext application = getServletContext();
		pool = (IConexionPool) application.getAttribute("poolDeMysql");
		
		if (pool == null) { 
		    // No hab�a pool/conexi�n en el contexto 
		    // Generar pool/conexi�n 
		    
		    try { 
			// Asegurarse que el "Driver" este disponible 
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			// Crear el Pool de Conexi�n y guardarlo en el contexto de la Aplicaci�n
			
		    
			conn = pool.extraerConexion();
			// Colocar conexi�n en el Contexto 
			application.setAttribute("poolDeMysql",pool);    
			
		    } catch (Exception exc) {
			
			// Registrar posibles error en Driver hacia registros ("Logs") 
			
			getServletContext().log("El \"Driver\" de la Base de Datos no se encontr� u ocurri� un error al intentarse generar una conexi�n", exc);
			
		    }
		}
		
	    }


	    /** Cerrar Conexi�n y re-asignar al  Pool de Conexi�n 
	        en Clase de finalizaci�n destroy **/

	   public void destroy() { 
		
		try { 
		    
		    // Cerrar Conexi�n y Liberarla hacia Pool
		    pool.liberarConexion(conn); 
		    
		} catch (Exception exc) {
		    
		    // Registrar posibles error en Driver hacia registros ("Logs") 
		    // Actualizar requisici�n y llamar funci�n de Rechazo 
		    
		    getServletContext().log("Error al liberar conexi�n", exc);
		    
		}
	    }
}