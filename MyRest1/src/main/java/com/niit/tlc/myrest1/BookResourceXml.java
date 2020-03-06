package com.niit.tlc.myrest1;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("books")
public class BookResourceXml {
@GET
@Produces(MediaType.APPLICATION_XML)
@Path("/{id}")
public Response getAllBooks(@PathParam("id") String bookId)
{
	Book book =new Book();
	book.setId(bookId);
	book.setName("Harry potter");
	book.setVolumeNumber(1);
	book.setAuthorName("J.K. Rawling");
	return Response.status(200).entity(book).build();
}

}
