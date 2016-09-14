package com.yash.sfm.model;

import java.util.Date;

public class Fees {
	private int id;
	private int fk_stud_id;
	private int fk_course_id;
	private Float amount_paid;
	private Date paid_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFk_stud_id() {
		return fk_stud_id;
	}
	public void setFk_stud_id(int fk_stud_id) {
		this.fk_stud_id = fk_stud_id;
	}
	public int getFk_course_id() {
		return fk_course_id;
	}
	public void setFk_course_id(int fk_course_id) {
		this.fk_course_id = fk_course_id;
	}
	public Float getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(Float amount_paid) {
		this.amount_paid = amount_paid;
	}
	public Date getPaid_date() {
		return paid_date;
	}
	public void setPaid_date(Date paid_date) {
		this.paid_date = paid_date;
	}
}
