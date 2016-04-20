package cl.bci.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/rest")
public class HelloRestService {

	@GET
	@Path("hello")
	public Response helloWorld() {
		
		String result = "hola"; 
		
		return Response.status(200).entity(result).build();
	}
	
	
}
