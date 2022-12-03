package jeestudy.ping;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 *
 */
@Path("/ping")
public class PingResource {

    @GET
    public String ping() {
        return " Jakarta EE 10!";
    }

}
