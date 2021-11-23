package com.revature.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.postgresql.Driver;

import com.revature.model.ERS_reimbursement;
import com.revature.model.ERS_user;

public class DAL {

	public static Driver postgresDriver = new Driver();
	public static Connection connection; 
	
	
	public DAL() {}
	
	
	public static String establishConnection(String url, String superUsername, String superPassword) {
		
		try {
			
			DriverManager.registerDriver(postgresDriver);
			connection= DriverManager.getConnection(url, superUsername, superPassword);
			return "Connection successfully established with " + url; 
			
		}
		
		catch(SQLException e) {
			
			 return "connection error: " + e.getMessage();
			
		}
		
		
	}	
	
	public ERS_user addUser(ERS_user newUser) {
		
		return new ERS_user(); //method stub
		
	}
	
	public boolean deleteUser(int userId) {
		
		//method stub
		return false; 
		
	}
	
	public ERS_user updateUser(ERS_user updatedUser) {
		
		return new ERS_user(); //method stub
		
	}
	
	public ArrayList<ERS_user> getAllUsers() {
		
		return new ArrayList<ERS_user>();//method stub
		
	}
	
	public ERS_user getUser(int userID) {
		
		return new ERS_user(); //method stub 
		
	}
	
	public boolean checkUsernameTaken(ERS_user newUser) {
		
		return true; 
		
	}
	
	public boolean checkEmailTaken(ERS_user newUser) {
		
		return true; 
		
	}
	
	public ERS_reimbursement createRequest(ERS_reimbursement newReimbursement) {
		
		return new ERS_reimbursement(); //method stub 
		
	}
	
	public boolean deleteRequest(int requestId) {
		
		//method stub 
		return false; 
		
	}
	
	public boolean deleteAllUserRequests(int userId) {
		
		//method stub
		return false; 
		
	}
	
	public ERS_reimbursement updateRequest(ERS_reimbursement updatedReimbursement) {
		
		return new ERS_reimbursement(); //method stub 
		
	}
	
	public ArrayList<ERS_reimbursement> getAllRequests() {
		
		return new ArrayList<ERS_reimbursement>();//method stub 
		
	}
	
	public ArrayList<ERS_reimbursement> getAllRequests(String status) {
		
		return new ArrayList<ERS_reimbursement>(); ///method stub
		
	}
	
	public ArrayList<ERS_reimbursement> getAllRequests(String status, int userId){
		
		return new ArrayList<ERS_reimbursement>(); //method stub 
		
	}
	
	public ArrayList<ERS_reimbursement> getAllRequests(int userId) {
		
		return new ArrayList<ERS_reimbursement>(); //method stub 
		
	}
	
	
}
