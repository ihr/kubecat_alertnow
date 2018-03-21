package org.ingini.kubecat.resources;

import com.codahale.metrics.annotation.Timed;
import org.ingini.kubecat.api.OrderAlert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("alerts")
@Produces(MediaType.APPLICATION_JSON)
public class AlertResource {

    private final Logger logger = LoggerFactory.getLogger(AlertResource.class);

    @POST
    @Path("orders")
    @Timed
    public Response orderCommitted(@NotNull  OrderAlert orderCommitted) {

        logger.info("Order alert received {}", orderCommitted);

        return Response.ok().build();
    }

}
