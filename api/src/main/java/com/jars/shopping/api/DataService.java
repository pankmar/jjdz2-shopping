package com.jars.shopping.api;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by pwieczorek on 29.01.17.
 */
@Stateless
@Path("/")
public class DataService {

    @Inject
    DataStoreDAO dataStoreDAO;

    // http://host/app/logins?param0=234567&param1=3456789

    @Path("/logins")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDataEntity> readUserData(@QueryParam("fromdate") long fromDate, @QueryParam("todate") long toDate){
        return dataStoreDAO.getUserDataFromDateToDate(fromDate, toDate);
    }

}