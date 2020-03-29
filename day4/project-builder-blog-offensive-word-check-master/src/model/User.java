package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

//class user
public class User {

//arguments
	private String email;
	private String password;
	private LocalDateTime date;
	
//getter and setter
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}	
	
	
	//constructor
	public User(String email, String password,LocalDateTime date) {
		this.email = email;
		this.password = password;
		this.date = date;
	}
}
