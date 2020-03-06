package com.niit.tlc.myrest1;

import javax.ws.rs.core.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello"+ "")
public class Hello {
@GET
@Produces(MediaType.TEXT_PLAIN)
public String sayPlainTextHellp()
{
	return "Hello Jersey Plain";
	
}
@GET
@Path("/xmlhello")
@Produces(MediaType.TEXT_XML)
public String sayXMLHello()
{
	return "<?xml version=\"1.0\"?>"+"<Hello> Hello jersey "+"</Hello>";
			
}
@GET
@Produces(MediaType.TEXT_HTML)
public String sayHTMLHello()
{
	return "<HTML>"+"<TITLE>"+"Hello Jersey"+"</TITLE>"+"<BODY><H1>"+"hello jersy HTML "+"</H1></BODY>"+"</HTML>";
}
}

