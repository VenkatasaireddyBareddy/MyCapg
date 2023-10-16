package com.cg;

import java.util.Scanner;

public class Handson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Book No:");
		//int bookno=sc.nextInt();
		
		//System.out.println("Enter title:");
		//String title=sc.next();
		
		//System.out.println("Enter Authour Name:");
		//String author=sc.next();
		
		//System.out.println("Enter Price:");
		//int price=sc.nextInt();
		
		//System.out.println("Enter Discount:");
		//int discount=sc.nextInt();
		
		//Book b=new Book(bookno,title,author,price);
		
		//b.displayDetails();
		//b.discountedPrice(discount);
		System.out.println("Enter EMployee id");
		int Empid=sc.nextInt();
		System.out.println("Enter Employee Name");
		String Empname=sc.next();
		System.out.println("enter basic sal");
		int basicsal=sc.nextInt();
		Bankemployee emp=new Bankemployee(Empid,Empname,basicsal);
		emp.display();
		System.out.println(emp);
		emp.generateSalary();
			
	}

}
