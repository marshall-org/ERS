package com.revature.service;

import java.util.ArrayList;

import com.revature.DAL.DAL;
import com.revature.model.ERS_reimbursement;
import com.revature.model.ERS_user;

public class Service {

	private DAL dao; 
	
	
	public Service(DAL dao) {	
		
		this.dao = dao;
		
	}
	
	public void validate_employee(ERS_user user) { //used for validating logged in employee can access feature
		
		//method stub
		
	}
	
	public void validate_manager(ERS_user user) {	//used for validating logged in manager can access feature
		
		//method stub
		
	}
	
	
	public ERS_user createUser(ERS_user newUser) {
		
		return new ERS_user(); //method stub
		
	}
	
	public ERS_user elevateUser(int userID) {
		
		return new ERS_user();
		
	}
	
	
	public boolean deleteUser(int user_id) {
		
		//method stub
		return false; 
		
	}
	
	public ERS_user updateUser(ERS_user updatedUser) {
		
		return new ERS_user(); //method stub
		
	}
	
	public ArrayList<ERS_user> getAllUsers() {
		
		return new ArrayList<ERS_user>(); ///method stub
		
	}
	
	public ERS_user getUser(int user_id) {
		
		return new ERS_user(); //Method stub
		
	}
	
	public ERS_user getUserByUsernamePassword(String username, String password) {
		
		return new ERS_user(); //method stub
		
	}
	
	
	public ERS_reimbursement createRequest(ERS_reimbursement newReimbursement) {
		
		return new ERS_reimbursement(); //Method stub
		
	}
	
	public boolean deleteRequest(int requestId) {
		
		//method stub
		return false; 
		
	}
	
	public ERS_reimbursement updateRequest(ERS_reimbursement updatedReimbursement) {
		
		return new ERS_reimbursement(); //method stub
		
	}
	
	public ERS_reimbursement getRequest(int requestID) {
		
		return new ERS_reimbursement();
		
	}
	
	public ArrayList<ERS_reimbursement> getAllRequests() {
		
		return new ArrayList<ERS_reimbursement>(); //method stub
		
	}
	
	public ArrayList<ERS_reimbursement> getAllRequests(String status) {
		
		return new ArrayList<ERS_reimbursement>(); //method stub
		
	}	
	
	public ArrayList<ERS_reimbursement> getAllRequests(String status, int user_id) {
		
		return new ArrayList<ERS_reimbursement>(); //method stub
		
	}
	
	public ArrayList<ERS_reimbursement> getAllRequests(int user_id) {
		
		return new ArrayList<ERS_reimbursement>();
		
	}
	
}
