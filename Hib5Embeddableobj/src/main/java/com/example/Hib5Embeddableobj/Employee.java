package com.example.Hib5Embeddableobj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "emp_table")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "emp_id")
	int emp_id;
	@Column(name = "first_name")
	String fname;
	@Column(name="last_name")
	String lname;
	Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", fname=" + fname + ", lname=" + lname + ", address=" + address + "]";
	}
	

}
