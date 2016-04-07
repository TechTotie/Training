package com.mydomain.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/user")
public class UserService {
	
//	public Users getuser(@PathParam("param") Integer Id){
		
		@GET
		@Produces({MediaType.APPLICATION_JSON})
		public List<Users> getusers(){
			Users u = new Users();
			List<Users> users = new ArrayList<Users>();
			users.add(u);
			return users;
		}
//	}

	public void createUser(Users u){};
	
	
}
