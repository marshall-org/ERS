package com.revature.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.model.ERS_user;
import com.revature.service.Service;

import io.javalin.Javalin;
import io.javalin.http.Handler;

import java.sql.SQLException;

public class Controller {
	
	private Service service;
	private Logger logger; 
	
	public Controller(Service service) {
		
		this.service = service;
		logger = LoggerFactory.getLogger(Controller.class);
		
	}
	
	
	public Handler createUser = (ctx) -> {
		
		logger.info("Create user method called");
		
		try {
			
			ERS_user newUser = ctx.bodyAsClass(ERS_user.class);	//Gotta be doing some more input validation here, so itll throw either a SQLException or IllegalArgumentException
			ERS_user createdUser = service.createUser(newUser);	
			
			ctx.status(200);
			ctx.json(createdUser);
			logger.info("New user created successfully: " + createdUser);
			
			
			
		}
		catch(IllegalArgumentException e) {
			
			ctx.status(400);
			ctx.result(e.getMessage());
			logger.error(e.getMessage());
			
		}
		
		catch(SQLException e) {
			
			ctx.status(404);
			ctx.result(e.getMessage());
			logger.error(e.getMessage());
			
		}
		
		
	};
	
	public Handler deleteUser = (ctx) -> {
		
		//method stub
		
	};
	
	public Handler updateUser = (ctx) -> {
		
		//method stub
		
	};
	
	public Handler getAllUsers = (ctx) -> {
		
		
		
	};
	
	public Handler getUser = (ctx) -> {
		
		//method stub
		
	};
	
	public Handler createRequest = (ctx) -> {
		
		//method stub
		
	};
	
	public Handler deleteRequest = (ctx) -> {
		
		//method stub
		
	};	
	
	public Handler updateRequest = (ctx) -> {
		
		//method stub
		
	};
	
	public Handler getUserRequests = (ctx) -> {
		
		//method stub
		
	};
	
	public Handler getAllRequests = (ctx) -> {
		
		//method stub
		
	};
	
	public Handler loginUser = (ctx) -> {
		
		ERS_user user = ctx.bodyAsClass(ERS_user.class);
		
		user = service.getUserByUsernamePassword(user.getErs_username(), user.getErs_password());
		
		HttpServletRequest req = ctx.req; 
		
		HttpSession session = req.getSession();
		
		session.setAttribute("currentuser", user);
		
		ctx.status(200);
		user.setErs_username("");
		user.setErs_password("");
		ctx.json(user);
		
		
	};
	
	public Handler logoutUser = (ctx) -> {
		
		HttpServletRequest req = ctx.req; 
		req.getSession().invalidate();
		ctx.status(200);
		ctx.result("successfully logged out");
		
	};
	
	public Handler getSelf = (ctx) -> {
		
		//method stub
		
	};
	
	

	public void registerEndpoints(Javalin app) {
		//ers_users table endpoints
		//app.get("/ers_users/login", loginUser);	
		app.post("/ers_users", createUser);		
		//app.delete("/ers_users", deleteUser);
		//app.patch("/ers_users", updateUser);
		//app.get("/ers_users", getAllUsers);
		//app.get("/ers_users", getUser);
		//app.get("/ers_users", getSelf);
		//ers_reimbursements endpoints
		//app.post("/ers_reimbursements/{user_id}", createRequest);
		//app.delete("/ers_users/{user_id}", deleteRequest);
		//app.patch("ers_reimbursements/{user_id}", updateRequest);
		//app.get("ers_users/{user_id}", getUserRequests);
		//app.get("/ers_reimbursements", getAllRequests);
		
		
		
	}

}
