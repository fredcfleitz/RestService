package com.restservice;

import org.springframework.data.annotation.Id;

public class Customer {

  @Id
  public String id;

  public String firstName;
  public String lastName;
  public String country;
  public String phone;

  public Customer() {}

  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public String getCountry(){
	  return country;
  }
  
  public void setCountry(String country) {
	  this.country = country;
  }
  
  public String getPhone() {
	  return phone;
  }
  
  public void setPhone(String phone) {
	  this.phone = phone;
  }
	  

  /* @Override
  public String toString() {
    return String.format(
        "Customer[id=%s, firstName='%s', lastName='%s']",
        id, firstName, lastName);
  } */

}