package es.upm.dit.isst.tfg.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("rest")
public class RADARApp extends ResourceConfig {
        public RADARApp() {
                packages("es.upm.dit.isst.tfg.rest");
        }
}
