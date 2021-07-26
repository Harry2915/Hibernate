package com.example.Hib5Embeddableobj;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
String street;
String city;

public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


@Override
public String toString() {
	return "Address [city=" + city +  "]";
}

}
