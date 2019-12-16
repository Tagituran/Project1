package com.egemsoft.springboot.projectdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="users")
public class Users {
	
	//define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") 
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="adress")
	private String adress;
	
	@Column(name="geo")
	private String geo;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="website")
	private String webSite;
	
	@Column(name="company")
	private String company;

	//define constructors
	
	public Users() {
		
	}


	public Users(String name, String userName, String email, String adress, String geo, String phone, String webSite,
			String company) {
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.adress = adress;
		this.geo = geo;
		this.phone = phone;
		this.webSite = webSite;
		this.company = company;
	}
	
	//define getters/setters
	
	
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



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public String getGeo() {
		return geo;
	}



	public void setGeo(String geo) {
		this.geo = geo;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getWebSite() {
		return webSite;
	}


	
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}


	//define toString

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", userName=" + userName + ", email=" + email + ", adress="
				+ adress + ", geo=" + geo + ", phone=" + phone + ", webSite=" + webSite + ", company=" + company + "]";
	}
	
	
	
	
	

}
