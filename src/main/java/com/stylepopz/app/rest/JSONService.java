package com.stylepopz.app.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
import com.stylepopz.app.Track;
import com.stylepopz.app.model.Item;
 
@Path("/json/metallica")
public class JSONService {
 
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getProductsInJSON() {
 
		Track track = new Track();
		
//		Item item = new Item();
//		item.relevance = 0.99;
//		item.text = "Test GetJson";
//		
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");
 
		return track;
 
	}
 
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {
 
		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
 
	}
 
}