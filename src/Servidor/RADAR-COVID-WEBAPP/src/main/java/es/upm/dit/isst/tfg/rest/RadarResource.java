package es.upm.dit.isst.tfg.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import es.upm.dit.isst.*;
import es.upm.dit.isst.radar.dao.UsuarioDAOImplementation;
import es.upm.dit.isst.radar.model.Usuario;


@Path("/RADARDAO")
public class RadarResource {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Usuario usuario) throws URISyntaxException {
	    Usuario u= UsuarioDAOImplementation.getInstance().create(usuario);
	    if (u != null) {
	            URI uri = new URI("/RADAR-COVID-WEBAPP/FormLoginServlet/" + u.getDNI());
	            return Response.created(uri).build();
	    }
	    return Response.status(Response.Status.NOT_FOUND).build();
	}
}
