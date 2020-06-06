package jeestudy.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@Path("ping")
public class PingResource {

    @GET
    public String ping() {
        return " Jakarta EE 8!";
    }

}
