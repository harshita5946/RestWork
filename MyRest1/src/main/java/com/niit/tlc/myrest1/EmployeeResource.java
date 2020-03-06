package com.niit.tlc.myrest1;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("employee")
public class EmployeeResource {
@GET
@Path("{empno}")
@Produces("application/json")
public String getJson(@PathParam("empno") int empno)
{
	switch(empno)
{
	case 1: return"{'name': 'john Snow', 'age':28}";
	case 2: return"{'name': 'Peter Nortan', 'age':35}";
	default: return"{'name': 'jack of all', 'age' :18}";
}
}
}