package com.cg;

public class Person {
	private String fname;

	private String lname;

	private int age;


	public String getFname() {

		return fname;

	}

	// this keyowrk is used to refer to the current object


	public String fullName() {


		return fname+lname;

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

	public int getAge() {

		return age;

	}

	public void setAge(int age) {

		this.age = age;

	}

 

	@Override

	public String toString() {

		return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";

	}







 

} 

	