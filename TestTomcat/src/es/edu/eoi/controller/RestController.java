package es.edu.eoi.controller;
import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
 
@Path("helloworld")
public class RestController {
 
	@Context
	private UriInfo context; 
 
	public RestController() {
    }
 
	@GET
    @Produces("text/html")
    public String getHtml() {
        return "<html lang=\"en\"><body><h1>Hola Mundo!!"+Calendar.getInstance().getTime()+"</h1></body></html>";
        
    }
 
}