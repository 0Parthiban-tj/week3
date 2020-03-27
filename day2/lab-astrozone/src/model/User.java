package model;

//Type your code here

public class User{
	String name;
	String email;
	String dob;
	String gender;
	 public User(String name,String gender,String dob) {
		this.name=name;
		this.dob=dob;
		this.gender=gender;
	}  
		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name=name;
		}
		public String getemail() {
			return email;
		}
		public void setemail(String email) {
			this.email=email;
		}
		public String getdob() {
			return dob;
		}
		public void setdob(String dob) {
			this.dob=dob;
		}
		public String getgender() {
			return gender;
		}
		public void setgender(String gender) {
			this.gender=gender;
		}
	}