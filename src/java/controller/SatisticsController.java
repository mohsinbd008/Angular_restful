/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ManageBean.PlayersMb;
import entity.Satistics;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author R-34
 */
@Path("/satistics")
public class SatisticsController {

    PlayersMb playerservice = new PlayersMb();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Satistics> getSatistics() {
        System.out.println("get All country");
        List<Satistics> listOfSatistics = playerservice.getAllSatistics();
        return listOfSatistics;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Satistics getSatisticsById(@PathParam("id") int id) {
        return playerservice.getSatistics(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Satistics addSatistics(Satistics satistics) {
        return playerservice.addSatistics(satistics);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Satistics updateSatistics(Satistics satistics) {
        return playerservice.updateSatistics(satistics);

    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteSatistics(@PathParam("id") int id) {
        playerservice.deleteSatistics(id);

    }

}
