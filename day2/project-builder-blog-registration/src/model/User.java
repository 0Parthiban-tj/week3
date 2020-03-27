package model;

import java.time.LocalDateTime;

public class User {
	String email;
	String password;
	LocalDateTime date;
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password=password;
	}
	public LocalDateTime getdate() {
		return date;
	}
	public void setdate(LocalDateTime date) {
		this.date=date;
	}
	public User(String email,String password,LocalDateTime date) {
		this.email=email;
		this.password=password;
		this.date=date;
	}

}
