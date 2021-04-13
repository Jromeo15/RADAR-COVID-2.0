package es.upm.dit.isst.radar.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")

public class RadarApp extends ResourceConfig {

        public RadarApp() {

                packages("es.upm.dit.isst.radar.rest");

        }

}
