package mk.homeix.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author georgy
 */

@Path("service")
public class SimpleService {
    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "ok call";
    }
}
