package com.example.Hib1conf;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
int empid;
String name;
String lname;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}

}
