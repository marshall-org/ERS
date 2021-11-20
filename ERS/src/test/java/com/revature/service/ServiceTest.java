package com.revature.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.revature.DAL.DAL;

import org.junit.jupiter.api.MethodOrderer.MethodName;

@TestMethodOrder(MethodName.class)
public class ServiceTest {

	private Service sut;
	private DAL mockDao;
	
	@BeforeEach
	public void DaoAndServiceSetup() {
		
		mockDao = mock(DAL.class);
		sut = new Service(mockDao);
		
	}
	
	/**********************************************BEGIN CREATE USER TESTS************************************/
	
	@Test
	public void createUserPositiveNewEmployee() {	
		//test method stub
	}
	
	@Test
	public void createUserPositiveNewManager() {
		//test method stub
	}
	
	@Test
	public void createUserNegativeInvalidUserRole() {
		//test method stub
	}
	
	@Test
	public void createUserNegativeEmptyUsername() {
		//test method stub		
	}
	
	@Test
	public void createUserNegativeNullUsername() {
		//test method stub
	}
	
	@Test
	public void createUserNegativeEmptyPassword() {
		//test method stub
	}
	
	@Test
	public void createUserNegativeNullPassword() {
		//test method stub
	}
	
	@Test
	public void createUserNegativeEmptyFirstname() {
		//test method stub
	}
	
	@Test
	public void createUserNegativeNullFirstname() {
		//test method stub
	}
	
	@Test
	public void createUserNegativeEmptyLastname() {
		//test method stub
	}
	
	@Test
	public void createUserNegativeNullLastname() {
		//test method stub
	}
	
	@Test 
	public void createUserNegativeEmptyEmail() {
		//test method stub
	}
	
	@Test
	public void createUserNegativeNullEmail() {
		//test method stub
	}
	
	@Test
	public void createUserNegativeNoEmailDomain() {		//I.e., email give doesn't have an @....com, .net etc. 
		//test method stub
	}
	
	@Test
	public void createUserNegativeUsernameTaken() {
		//test method stub
	}
	
	@Test
	public void createUserNegativeEmailTaken() {
		//test method stub
	}
	
	/*********************************************END CREATE USER TESTS************************************/
	
	/*********************************************BEGIN DELETE USER TESTS***********************************/
	
	@Test
	public void deleteUserPositive() {	//only managers can delete users
		//test method stub
	}
	
	@Test
	public void deleteUserNegativeUserDoesntExist() {
		//test method stub
	}
	
	@Test
	public void deleteUserNegativeAuthorizerIsntManager() {
		//test method stub 
	}
	
	@Test
	public void deleteUserNegativeAuthorizerDoesntExist() {
		//test method stub
	}
	
	/*********************************************END DELETE USER TESTS*****************************************/
	
	/*********************************************BEGIN LOGIN TESTS*********************************************/

	@Test
	public void loginPositive() {
		//test method stub
	}
	
	@Test
	public void loginNegativeUsernameDoesntMatch() {
		//test method stub
	}
	
	@Test
	public void loginNegativePasswordDoesntMatch() {
		//test method stub 
	}
	
	/*************************************************END LOGIN TESTS*********************************************/
	
	/**************************************************BEGIN UPDATE USER TESTS*************************************/
	
	@Test
	public void updateUserPositiveUser() {	//User profile successfully updated by user
		//test method stub
	}
	
	@Test 
	public void updateUserPositiveManager() {	//User profile successfully updated by manager (manager can update other users)
		//test method stub
	}
	
	@Test
	public void updateUserNegativeAuthorizerDoesntHavePermission() {	//i.e., user that isnt manager trying to update profile of other users
		//test method stub
	}
	
	@Test
	public void updateUserNegativeAuthorizerDoesntHavePermissionToChangeOwnRoleToManager() {	//only managers can update users to be a manager
		//test method stub
	}
	
	@Test
	public void updateUserNegativeUserDoesntExist() {
		//test method stub
	}
	
	@Test
	public void updateUserNegativeAuthorizingUserDoesntExist() {
		//test method stub
	}
	
	/******************************************************END UPDATE USER TESTS***********************************/
	
	/*****************************************************BEGIN GET ALL USERS TESTS*********************************/
	
	@Test
	public void getAllUsersPositive() {
		//test method stub 
	}
	
	@Test
	public void getAllUsersNegativeAuthorizingUserNotManager() { //Only managers should be able to get info on other users. DONT INCLUDE USERNAME/PASSWORDS
		//test method stub
	}
	
	@Test
	public void getAllUsersNegativeAuthorizingUserDoesntExist() {	//could honestly include this with authorizer is not manager, but whatever
		//test method stub
	}
	
	/******************************************************END GET ALL USER TESTS************************************/
	
	/*****************************************************BEGIN GET USER TESTS****************************************/
	
	@Test
	public void getUserPositiveUserGettingThemselves() { //should only be allowed to get info on own user or if authorizer is a manager
		//test method stub 
	}
	
	@Test
	public void getUserPositiveManagerGettingUser() {
		//test method stub
	}
	
	@Test
	public void getUserNegativeUserDoesntExist() {
		//test method stub 
	}
	
	@Test
	public void getUserNegativeAuthorizingUserIsNotManagerAndTryingToGetOtherUser() {
		//test method stub
	}
	
	
	/*************************************************************END GET USER TESTS************************************/
	
	/***********************************************************BEGIN CREATE REQUEST TESTS******************************/
	
	@Test
	public void createRequestPositive() {
		//test method stub
	}
	
	@Test
	public void createRequestNegativeReimbursementAmountLessThanOrEqualToZero() {	//why would you create a reimbursement request for negative dollars?!?! Baka
		//test method stub
	}
	
	@Test
	public void createRequestNegativeUserDoesntExist() {	//Trying to create a request for a user that doesn't exist
		//test method stub
	}
	
	@Test
	public void createRequestNegativeStatusNotValid() {	//When creating tests, will probably just assign as pending in service layer
		//test method stub
	}
	
	@Test
	public void createRequestNegativeTypeNotValid() {
		//test method stub
	}
	
	/**********************************************************END CREATE REQUEST TESTS**********************************/
	
	/**********************************************************BEGIN DELETE REQUEST TESTS*********************************/
	
	@Test
	public void deleteRequestPositiveUserDeletedRequestBelongingToThem() { //Users can delete their own request IF theyre still pending
		//test method stub
	}
	
	@Test
	public void deleteRequestPositiveManagerDeletedRequest() {	//Managers can delete any request they like
		//test method stub
	}
	
	@Test
	public void deleteRequestNegativeUserTryingToDeleteOwnRequestThatsNotPending() { //Users can only delete their own requests if theyre pending
		//test method stub
	}
	
	@Test
	public void deleteRequestNegativeRequestDoesntBelongToUserAndUserNotManager() {
		//test method stub
	}
	
	@Test
	public void deleteRequestNegativeAuthorizerDoesntExist() {
		//test method stub
	}
	
	/*********************************************************END DELETE REQUEST TESTS****************************************/
	
	/*********************************************************BEGIN UPDATE REQUEST TESTS**************************************/
	
	@Test
	public void updateRequestPositiveRequestUpdatedByOwningUserAndNotPending() {
		//test method stub 
	}
	
	@Test
	public void updateRequestPositiveRequestUpdatedByManager() {
		//test method stub
	}
	
	@Test
	public void updateRequestNegativeUserTriedToUpdateOwnRequestButStatusIsNotPending() {
		//test method stub
	}
	
	@Test
	public void updateRequestNegativeRequestDoesntExist() {
		//test method stub
	}
	
	@Test
	public void updateRequestNegativeRequestDoesntBelongToUserAndUserNotManager() {
		//test method stub
	}
	
	@Test
	public void updateRequestNegativeUserTriedToUpdateStatusButIsNotManager() {
		//test method stub 
	}
	
	@Test
	public void updateRequestNegativeManagerTriedToUpdateButStatusIsNotPending() {
		//test method stub 
	}
	
	/**************************************************************END UPDATE REQUEST TESTS******************************************/
	
	/**************************************************************BEGIN GET ALL REQUESTS TESTS**************************************/
	

	@Test
	public void getAllRequestsPositiveManagerGettingAllRequests() {
		//test method stub
	}
	
	@Test
	public void getAllRequestsPositiveManagerGettingAllRequestsWithStatus() {
		//test method stub
	}
	
	@Test
	public void getAllRequestsPositiveManagerGettingAllRequestsOfUser() {
		//test method stub
	}
	
	@Test
	public void getAllRequestsPositiveManagerGettingAllRequestsOfUserWithStatus() {
		//test method stub
	}
	
	@Test
	public void getAllRequestsPositiveUserGettingAllOwnRequests() {
		//test method stub 
	}
	
	@Test
	public void getAllRequestsPositiveUserGettingAllOwnRequestsWithStatus() {
		//test method stub
	}
	
	@Test
	public void getAllRequestsNegativeUserTryingToGetOtherUsersRequests() {
		//test method stub
	}
	
	@Test 
	public void getAllRequestsNegativeUserTryingToGetOtherUsersRequestsWithStatus() {
		//test method stub
	}
	
	
	@Test
	public void getAllRequestsNegativeUserTryingToGetAllRequestsWhenNotManager() {
		//test method stub
	}
	
	@Test
	public void getAllRequestsNegativeUserTryingToGetAllRequestsWithStatusWhenNotManager() {
		//test method stub
	}
	
	@Test
	public void getAllRequestsNegativeTryingToGetAllRequestsOfUserThatDoesntExist() {
		//test method stub
	}
	
	@Test
	public void getAllRequestsNegativeTryingToGetAllRequestsOfUserThatDoesntExistWithStatus() {
		//test method stub asdfasf
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
