package es.upm.dit.isst.radar.rest;

import java.util.List;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jsonp.JsonProcessingFeature;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import es.upm.dit.isst.radar.dao.RadarDAOImplementation;
import es.upm.dit.isst.radar.model.Usuario;

@Path("/TFGs")
public class RadarResource {
	


@GET

@Produces(MediaType.APPLICATION_JSON)

public List<Usuario> readAll () {

        return RadarDAOImplementation.getInstance().readAll();

}
/*

@GET

@Path("professor/{id}")

@Produces(MediaType.APPLICATION_JSON)

public List<TFG> readAll (@PathParam("id") String id) {

        return TFGDAOImplementation.getInstance().readAll(id);

}
*/

}
