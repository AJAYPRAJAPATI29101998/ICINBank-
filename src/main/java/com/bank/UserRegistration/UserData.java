package com.bank.UserRegistration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name ="userdata")
@Table(name = "UserData")
public class UserData {
	
		private int id;
		private String firstName;
		private String mobileNumber;
		private int password;
		private String email;
		private String adharNumber;
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAdharNumber() {
			return adharNumber;
		}
		public void setAdharNumber(String adharNumber) {
			this.adharNumber = adharNumber;
		}
		
		
		public UserData(int id, String firstName, String mobileNumber, int password, String email, String adharNumber) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.mobileNumber = mobileNumber;
			this.password = password;
			this.email = email;
			this.adharNumber = adharNumber;
		}
		public UserData() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
	
		
		

}
