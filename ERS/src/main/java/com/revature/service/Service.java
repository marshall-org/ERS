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
	
	public ERS_user createUser(ERS_user newUser) {
		
		return new ERS_user(); //method stub
		
	}
	
	
	public void deleteUser(int user_id, ERS_user userPerformingAction) {
		
		//method stub
		
	}
	
	public ERS_user updateUser(ERS_user updatedUser, ERS_user userPerformingAction) {
		
		return new ERS_user(); //method stub
		
	}
	
	public ArrayList<ERS_user> getAllUsers(ERS_user userPerformingAction) {
		
		return new ArrayList<ERS_user>(); ///method stub
		
	}
	
	public ERS_user getUser(int user_id, ERS_user userPerformingAction) {
		
		return new ERS_user(); //Method stub
		
	}
	
	public ERS_reimbursement createRequest(ERS_reimbursement newReimbursement, ERS_user userPerformingAction) {
		
		return new ERS_reimbursement(); //Method stub
		
	}
	
	public void deleteRequest(int requestId, ERS_user userPerformingAction) {
		
		//method stub
		
	}
	
	public ERS_reimbursement updateRequest(ERS_reimbursement updatedReimbursement, ERS_user userPerformingAction) {
		
		return new ERS_reimbursement(); //method stub
		
	}
	
	public ArrayList<ERS_reimbursement> getAllRequests(ERS_user userPerformingAction) {
		
		return new ArrayList<ERS_reimbursement>(); //method stub
		
	}
	
	public ArrayList<ERS_reimbursement> getAllRequests(ERS_user userPerformingAction, String status) {
		
		return new ArrayList<ERS_reimbursement>(); //method stub
		
	}	
	
	public ArrayList<ERS_reimbursement> getAllRequests(ERS_user userPerformingAction, String status, int user_id) {
		
		return new ArrayList<ERS_reimbursement>(); //method stub
		
	}
	
	public ArrayList<ERS_reimbursement> getAllRequests(ERS_user userPerformingAction, int user_id) {
		
		return new ArrayList<ERS_reimbursement>();
		
	}
	
	public ERS_user loginUser(ERS_user userLoggingIn) {
		
		return new ERS_user(); //method stub 
		
	}
}
