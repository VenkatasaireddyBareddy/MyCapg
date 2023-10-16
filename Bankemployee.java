package com.cg;

public class Bankemployee {
	private int Empid;
	private String Empname;
	private double basicsal;
	public int da=200,hra=240,tax=2000,loan=25000,pf=1500,ded,bonus=10000;
	double gross;
	double netsal;
	public Bankemployee(int empid, String empname, double basicsal) 
	{
		Empid = empid;
		Empname = empname;
		this.basicsal = basicsal;
	}
	void display() {
	}
	@Override
	public String toString() {
		return "Bankemployee [Empid=" + Empid + ", Empname=" + Empname + ", basicsal=" + basicsal + "]";
	}

	
	void generateSalary() {
		ded=loan+pf+tax;
		netsal= gross-ded;
		System.out.println("Netsalary ="+netsal);
	}

}
