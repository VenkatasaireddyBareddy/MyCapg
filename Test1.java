package com.cg;

public class Test1 {
	
		public static void main(String[] args) {

				// u need to create the object

			//  objectname.member

			// getter and setter methods are meant to set the field data

			// to get the field data

			Circle c = new Circle();


			c.setX(10);

			c.setY(20);

			c.setR(30);

			c.z=40;


			int x=c.getX();

			int y= c.getY();

			int r= c.getR();

			System.out.println(" First Object ");

//			System.out.println("X:- "+x);

//			

//			System.out.println("Y:- "+y);

//			

//			System.out.println("R:- "+r);

	 

			System.out.println(c);

			c.area();


			System.out.println(" ******************** ");

			System.out.println("Second Object ");

			Circle c1 = new Circle();

				c1.setX(100);

				c1.setY(200);

				c1.setR(300);


				x= c1.getX();

				y= c1.getY();

				r= c1.getR();


				System.out.println("X:- "+x);


				System.out.println("Y:- "+y);


				System.out.println("R:- "+r);

			   c1.area();

			System.out.println("****************");	


			Person p= new Person();


			p.setFname("Chandu");

			p.setLname("Sharma");

			p.setAge(20);


			String fname= p.getFname();

			String lname=p.getLname();

			int age= p.getAge();

	   String fullname= p.fullName();

//			System.out.println("Fname : "+fname);

//			System.out.println("Lname :- "+lname);

//			System.out.println("Age :- "+age);


	   System.out.println(p);

	   System.out.println(fullname);





		}

	 

		


	}

