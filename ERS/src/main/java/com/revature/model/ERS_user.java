package com.revature.model;

import java.util.Objects;

public class ERS_user {

	private int user_id; 
	private String ers_username;
	private String ers_password; 
	private String user_first_name;
	private String user_last_name;
	private String user_email;
	private String user_role;
	
	
	public ERS_user() {

	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getErs_username() {
		return ers_username;
	}


	public void setErs_username(String ers_username) {
		this.ers_username = ers_username;
	}


	public String getErs_password() {
		return ers_password;
	}


	public void setErs_password(String ers_password) {
		this.ers_password = ers_password;
	}


	public String getUser_first_name() {
		return user_first_name;
	}


	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}


	public String getUser_last_name() {
		return user_last_name;
	}


	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	public String getUser_role() {
		return user_role;
	}


	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ers_password, ers_username, user_email, user_first_name, user_id, user_last_name,
				user_role);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ERS_user other = (ERS_user) obj;
		return Objects.equals(ers_password, other.ers_password) && Objects.equals(ers_username, other.ers_username)
				&& Objects.equals(user_email, other.user_email)
				&& Objects.equals(user_first_name, other.user_first_name) && user_id == other.user_id
				&& Objects.equals(user_last_name, other.user_last_name) && Objects.equals(user_role, other.user_role);
	}


	@Override
	public String toString() {
		return "ERS_user [user_id=" + user_id + ", ers_username=" + ers_username + ", ers_password=" + ers_password
				+ ", user_first_name=" + user_first_name + ", user_last_name=" + user_last_name + ", user_email="
				+ user_email + ", user_role=" + user_role + "]";
	}
	
	
	
}
