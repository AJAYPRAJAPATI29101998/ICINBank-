package com.bank.UserRegistration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserData")
public class UserData {
	
		private int id;
		private String name;
		private String phoneNo;
		private String AdharNo;
		private String email;
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getAdharNo() {
			return AdharNo;
		}
		public void setAdharNo(String adharNo) {
			AdharNo = adharNo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public UserData(int id, String name, String phoneNo, String adharNo, String email) {
			super();
			this.id = id;
			this.name = name;
			this.phoneNo = phoneNo;
			AdharNo = adharNo;
			this.email = email;
		}
		public UserData() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
	
		
		

}
