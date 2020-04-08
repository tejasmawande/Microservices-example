package com.java.demo.JavaJpaDemo.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EMPLOYEES {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  int id;
  String first_name;
  String last_name;
  String email;
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "EMPLOYEES [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
			+ ", getId()=" + getId() + ", getFirst_name()=" + getFirst_name() + ", getLast_name()=" + getLast_name()
			+ ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
}