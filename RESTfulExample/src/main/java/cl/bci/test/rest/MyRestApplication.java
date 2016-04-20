package cl.bci.test.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Path("services")
public class MyRestApplication extends Application {
	
	private Set<Object> singletons = new HashSet<Object>();

	public MyRestApplication() {
		singletons.add(new HelloRestService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	

}
