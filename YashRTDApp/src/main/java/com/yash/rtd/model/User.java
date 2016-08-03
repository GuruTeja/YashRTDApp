package com.yash.rtd.model;

import java.sql.Timestamp;
import java.util.Date;

public class User {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String contact;
	private Date dob;
	private String password;
	private Date doj;
	private int created_by;
	private int last_modified_by;
	private Timestamp created_date;
	private Timestamp last_modified_date;
	//for foreign keys
	private int fk_role_id;
	private int fk_status_id;
	private int fk_companylocation_id;
	private int fk_gender_id;
	private Address address;
	private CompanyLocations companyLocations;
	private Roles roles;
	private UserStatus userStatus;
	private Gender gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public int getLast_modified_by() {
		return last_modified_by;
	}
	public void setLast_modified_by(int last_modified_by) {
		this.last_modified_by = last_modified_by;
	}
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public Timestamp getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(Timestamp last_modified_date) {
		this.last_modified_date = last_modified_date;
	}
	public int getFk_role_id() {
		return fk_role_id;
	}
	public void setFk_role_id(int fk_role_id) {
		this.fk_role_id = fk_role_id;
	}
	public int getFk_status_id() {
		return fk_status_id;
	}
	public void setFk_status_id(int fk_status_id) {
		this.fk_status_id = fk_status_id;
	}
	public int getFk_companylocation_id() {
		return fk_companylocation_id;
	}
	public void setFk_companylocation_id(int fk_companylocation_id) {
		this.fk_companylocation_id = fk_companylocation_id;
	}
	public int getFk_gender_id() {
		return fk_gender_id;
	}
	public void setFk_gender_id(int fk_gender_id) {
		this.fk_gender_id = fk_gender_id;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public CompanyLocations getCompanyLocations() {
		return companyLocations;
	}
	public void setCompanyLocations(CompanyLocations companyLocations) {
		this.companyLocations = companyLocations;
	}
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	public UserStatus getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}
}

